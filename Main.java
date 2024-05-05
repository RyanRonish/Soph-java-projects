/***********************************************
*   Ryan Ronish  Homework Assignment 1         * 
*   10/23/23                                   *
*                                              *
***********************************************/
import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        
        Scanner scnr = new Scanner(System.in);
        
        //prompt user for dimension size
        int dimensionSize = promptForDimensionSize(scnr);
        
        //user input seed for the random number generator
        int seed = promptForSeed(scnr);
        
        //Generate a random 2D array 
        int[][] randomArray = generateRandomArray(dimensionSize, seed);
        
        //print the random array
        System.out.println("Main Array:");
        printArray(randomArray);
        
        // user input for the size fo the window
        int windowSize = promptForWindowSize(scnr);
        
        // calculate and print the sum array
        int[][] sumArray = calculateSumArray(randomArray, windowSize);
        System.out.println("Sum Array:");
        printArray(sumArray);
        
        //calculate and print the average array
        int[][] avgArray = calculateAvgArray(sumArray, windowSize);
        System.out.println("Avg Array:");
        printArray(avgArray);
        
        //calculate and print the minimum array
        int[][] minArray = calculateMinArray(randomArray, windowSize);
        System.out.println("Min Array:");
        printArray(minArray);
        
        //calculate and print the max array
        int[][] maxArray = calculateMaxArray(randomArray, windowSize);
        System.out.println("Max Array:");
        printArray(maxArray);
    }
    // numRows - number of rows  numcols - number of columns
    // gets the dimension size from the user, checks its in between 2 and 8. 
    //Returns dimension size
    public static int promptForDimensionSize(Scanner scnr) {
        int dimensionSize;
        do {
            System.out.print("Enter the dimension size (between 2 and 8 inclusive): ");
            dimensionSize = scnr.nextInt();
            
        } while (dimensionSize < 2 || dimensionSize > 8);

        return dimensionSize;
    }
    
    //gets the seed value for the random number generator
    //user input is returned for the seed value
        public static int promptForSeed(Scanner scnr) {
        System.out.print("Enter the seed for the random number generator: ");
        return scnr.nextInt();
    }
    
    //generates a 2D array of integers 
    //random class selects numbers between 0 and 15
    //returns the random array
    public static int[][] generateRandomArray(int dimensionSize, int seed) {
        int[][] randomArray = new int[dimensionSize][dimensionSize];
        Random random = new Random(seed);

        for (int i = 0; i < dimensionSize; i++) {
            for (int j = 0; j < dimensionSize; j++) {
                randomArray[i][j] = random.nextInt(15); // Generate random integers between 0 and 15
            }
        }

        return randomArray;
    }
    
    //print a 2D array and uses print format to print each element
    public static void printArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.printf("%4d", array[i][j]);
            }
            System.out.println();
        }
    }
    
    // user input for the size of the window
    //makes sure its between 1 annd the size
    //returns a window size
    public static int promptForWindowSize(Scanner scnr) {
        int windowSize;
        do {
            System.out.print("Enter the size of the sliding window (between 1 and the dimension size): ");
            windowSize = scnr.nextInt();
        } while (windowSize < 1 || windowSize > 8); // Adjust the upper limit as needed

        return windowSize;
    }
    
    //calculates the sum array 
    //iteratesthe input array and calculates the sum of the elements w/in the window
    //returns the sum array
    public static int[][] calculateSumArray(int[][] array, int windowSize) {
        int dimensionSize = array.length;
        int[][] sumArray = new int[dimensionSize - windowSize + 1][dimensionSize - windowSize + 1];

        for (int i = 0; i < dimensionSize - windowSize + 1; i++) {
            for (int j = 0; j < dimensionSize - windowSize + 1; j++) {
                int sum = 0;
                for (int x = i; x < i + windowSize; x++) {
                    for (int y = j; y < j + windowSize; y++) {
                        sum += array[x][y];
                    }
                }
                sumArray[i][j] = sum;
            }
        }

        return sumArray;
    }
    
    //calculates the average array based on the sum array and window size
    //each element is dividedin the sum array by the square of the windowsize
    //returns the average array
    public static int[][] calculateAvgArray(int[][] sumArray, int windowSize) {
        int numRows = sumArray.length;
        int numCols = sumArray[0].length;
        int[][] avgArray = new int[numRows][numCols];

        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                avgArray[i][j] = sumArray[i][j] / (windowSize * windowSize);
            }
        }

        return avgArray;
    }
    
    //calcs min array by sputting a window over the input array
    //keeps track of the min value within the window
    //returns the minimum array
    public static int[][] calculateMinArray(int[][] array, int windowSize) {
        int numRows = array.length;
        int numCols = array[0].length;
        int[][] minArray = new int[numRows - windowSize + 1][numCols - windowSize + 1];

        for (int i = 0; i < numRows - windowSize + 1; i++) {
            for (int j = 0; j < numCols - windowSize + 1; j++) {
                int min = Integer.MAX_VALUE;
                for (int x = i; x < i + windowSize; x++) {
                    for (int y = j; y < j + windowSize; y++) {
                        min = Math.min(min, array[x][y]);
                    }
                }
                minArray[i][j] = min;
            }
        }

        return minArray;
    }
    
    //calcs max arrayby sliding the window ofver the input array
    //iterates throug the input array and keeps track of the max value within the window
    //returnsn the max array
    public static int[][] calculateMaxArray(int[][] array, int windowSize) {
        int numRows = array.length;
        int numCols = array[0].length;
        int[][] maxArray = new int[numRows - windowSize + 1][numCols - windowSize + 1];

        for (int i = 0; i < numRows - windowSize + 1; i++) {
            for (int j = 0; j < numCols - windowSize + 1; j++) {
                int max = Integer.MIN_VALUE;
                for (int x = i; x < i + windowSize; x++) {
                    for (int y = j; y < j + windowSize; y++) {
                        max = Math.max(max, array[x][y]);
                    }
                }
                maxArray[i][j] = max;
            }
        }

        return maxArray;
    }
}
