/***********************************************
*   Ryan Ronish  Homework Assignment 3         * 
*   11/03/23                                   *
*                                              *
***********************************************/
import java.util.Scanner;
import java.util.Arrays;

public class Main
{
    
    public static void main(String[] args)
    {
        Scanner scnr = new Scanner(System.in);
        
        //array to store the userData, easier to manipulate the data later
        double[] userData = new double[3];
        
        double length = 0, width = 0, height = 0, weight = 0, diameter = 0;

        // Input validation for length in feet
        while (true) {
            try {
                System.out.println("Enter the length in feet: ");
                length = scnr.nextDouble();

                if (length <= 0) {
                    throw new IllegalArgumentException("Length must be a positive value.");
                }

                break; // Valid input, exit the loop
            } catch (Exception e) {
                scnr.nextLine(); // Clear the invalid input
                System.out.println("Please enter a valid positive numerical value for length.");
            }
        }
        
        // Input validation for width in feet
        while (true) {
            try {
                System.out.println("Enter the width in feet: ");
                width = scnr.nextDouble();

                if (width <= 0) {
                    throw new IllegalArgumentException("Width must be a positive value.");
                }

                break; // Valid input, exit the loop
            } catch (Exception e) {
                scnr.nextLine(); // Clear the invalid input
                System.out.println("Please enter a valid positive numerical value for width.");
            }
        }

        // Input validation for height in feet
        while (true) {
            try {
                System.out.println("Enter the height in feet: ");
                height = scnr.nextDouble();

                if (height <= 0) {
                    throw new IllegalArgumentException("Height must be a positive value.");
                }

                break; // Valid input, exit the loop
            } catch (Exception e) {
                scnr.nextLine(); // Clear the invalid input
                System.out.println("Please enter a valid positive numerical value for height.");
            }
        }

        // Input validation for weight in lbs
        while (true) {
            try {
                System.out.println("Enter the weight in pounds: ");
                weight = scnr.nextDouble();

                if (weight <= 0) {
                    throw new IllegalArgumentException("Weight must be a positive value.");
                }

                break; // Valid input, exit the loop
            } catch (Exception e) {
                scnr.nextLine(); // Clear the invalid input
                System.out.println("Please enter a valid positive numerical value for weight.");
            }
        }
        
        //store and sort input values
        userData[0] = length;
        userData[1] = width;
        userData[2] = height;
        Arrays.sort(userData);
        
        //Create box, sphere, cylinder, cone objects
        Box box = new Box(length, width, height, weight);
        diameter = userData[2];
        Sphere sphere = new Sphere(diameter, weight);
        height = userData[2]; //adjusting data for the next objects
        diameter = userData[1];
        Cylinder cylinder = new Cylinder(height, diameter, weight);
        Cone cone = new Cone(height, diameter, weight);
        
        // Display dimensions of each shape
        box.displayDimensions();
        cone.displayDimensions();
        cylinder.displayDimensions();
        sphere.displayDimensions();
        
        System.out.println();
        
        //Displays the volume and density of each shape
        box.displayVolumeDensity();
        cone.displayVolumeDensity();
        cylinder.displayVolumeDensity();
        sphere.displayVolumeDensity();
        
        System.out.println();
        
        //Displays the container informationn for each shape
        box.displayContainer();
        cone.displayContainer();
        cylinder.displayContainer();
        sphere.displayContainer();
        
    }
}
