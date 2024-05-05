/***********************************************
*   Ryan Ronish  Homework Assignment 2         * 
*   11/03/23                                   *
*                                              *
***********************************************/
import java.util.Scanner;

public class Main
{
    
    public static void main(String[] args)
    {
        Scanner scnr = new Scanner(System.in);
        
        //user input for length in feet
        System.out.println("Enter the length in feet: ");
        double length = scnr.nextDouble();
        
        //user input for the width in feet
        System.out.println("Enter the width in feet: ");
        double width = scnr.nextDouble();
        
        //user input for the height in feet
        System.out.println("Enter the height in feet: ");
        double height = scnr.nextDouble();
        
        //user input for the weight in lbs
        System.out.println("Enter the weight in pounds: ");
        double weight = scnr.nextDouble();
        
        //Box object and user input
        Box box = new Box(length, width, height, weight);
        
        //displays the volume of the box
        //System.out.printf("The volume of the box is %.2f cubic ft.%n", box.calculateVolume());
        
        //displays the density of the box
        //both printf are using print format 
        //System.out.printf("The density of the box is %.2f lbs./cubic ft.%n", box.calculateDensity());
        
        if(box.calculateDensity() == 0.0){
            System.out.println("Division by zero attempted.");
            System.out.printf("The volume of the box is %.2f cubic ft.%n", box.calculateVolume());
            System.out.printf("The density of the box is %.2f lbs./cubic ft.%n", box.calculateDensity());
        }
        else{
            System.out.printf("The volume of the box is %.2f cubic ft.%n", box.calculateVolume());
            System.out.printf("The density of the box is %.2f lbs./cubic ft.%n", box.calculateDensity());
        }
        
        
        // if/else sees if the conditions of hasAsquare are met
        if(box.hasASquare() == true){
            System.out.println("At least one side of the box is square.");
        }
        else {
            System.out.println("No sides of the box are square.");
        }
        
        // if/else checks if the box is a cube 
        if (box.isACube()) {
            System.out.println("The box is a cube.");
        } else {
            System.out.println("The box is not a cube.");
        }
        
        //if/else sees if the box is heavy, lightweight, or cause why not medium-weight
        if(box.isHeavy() == true){
            System.out.println("The box is heavy.");
            System.out.println("The box is not lightweight.");
        }
        else if(box.isLightWeight() == true){
            System.out.println("The box is not heavy.");
            System.out.println("The box is lightweight.");
        }
        else{
            System.out.println("The box is medium-weight.");
        }
    }

}
