/***********************************************
*   Ryan Ronish  Homework Assignment 3         * 
*   11/03/23                                   *
*                                              *
***********************************************/
import java.lang.Math;

class Box implements Shape {
    private double length;
    private double width;
    private double height;
    private double weight;

    // Constructor for initializing a Box object with given dimensions and weight
    public Box(double length, double width, double height, double weight) {
        this.length = length;
        this.width = width;
        this.height = height;
        this.weight = weight;
    }

    // Display the dimensions and weight of the Box
    public void displayDimensions() {
        System.out.println("A Box of length " + length + ", width " + width + 
        ", height " + height + ", and weight " + weight + " lb. was created.");
    }
    
    // Calculate and return the volume of the Box
    public double calculateVolume(double height, double length, double width){
        double volume = length * width * height;
        return volume;
    }
    
    // Calculate and return the density of the Box based on its weight and volume
    public double calculateDensity(double weight){
        double volume = calculateVolume(height, length, width);
        double density = weight / volume;
        return density;
    }
    
    // Display the volume and density of the Box, rounded to two decimal places
    public void displayVolumeDensity(){
        System.out.printf("Box volume: %.2f cu ft.        Box density: %.2f lbs./cu ft%n", calculateVolume(height, length, width), calculateDensity(weight));
    }
    
    // Calculate and return the minimum volume that a container for the Box should have
    public double calculateBestFit(double length, double width, double height){
        double minVolume = length * width * height;
        return minVolume;
    }
    
    // Calculate and return the waste percentage when the Box is placed in a container
    public double calculateWaste(){
        double volume = calculateVolume(height, length, width);
        double containerVolume = calculateBestFit(length, width, height);
        double waste = (containerVolume - volume) / containerVolume;
        return waste;
    }
    
    // Display the container information, including the minimum container volume and waste percentage
    public void displayContainer(){
        System.out.printf("%.2f cu ft for a Box (%.2f%% waste)%n", calculateBestFit(length, width, height), calculateWaste() * 100);
    }
}




