/***********************************************
*   Ryan Ronish  Homework Assignment 3         * 
*   11/03/23                                   *
*                                              *
***********************************************/
import java.lang.Math;

class Cone implements Shape {
    private double height;
    private double diameter;
    private double weight;

    // Constructor for initializing a Cone object with given height, diameter, and weight
    public Cone(double height, double diameter, double weight) {
        this.height = height;
        this.diameter = diameter;
        this.weight = weight;
    }

    // Display the dimensions and weight of the Cone
    public void displayDimensions() {
        System.out.println("A Cone of height " + height + ", diameter " + diameter + 
        ", and weight " + weight + " lb. was created.");
    }
    
    // Calculate and return the volume of the Cone
    public double calculateVolume(double height, double diameter){
        double radius = diameter / 2;
        double volume = Math.PI * Math.pow(radius, 2) * height;
        return volume;
    }
    
    // Calculate and return the density of the Cone based on its weight and volume
    public double calculateDensity(double weight){
        double volume = calculateVolume(height, diameter);
        double density = weight / volume;
        return density;
    }
    
    // Display the volume and density of the Cone, rounded to two decimal places
    public void displayVolumeDensity(){
        System.out.printf("Cone volume: %.2f cu ft.       Cone density: %.2f lbs./cu ft%n", calculateVolume(height, diameter), calculateDensity(weight));
    }
    
    // Calculate and return the minimum volume that a container for the Cone should have
    public double calculateBestFit(double diameter, double height){
        double minVolume = diameter * diameter * height;
        return minVolume;
    }
    
    // Calculate and return the waste percentage when the Cone is placed in a container
    public double calculateWaste(){
        double volume = calculateVolume(height, diameter);
        double containerVolume = calculateBestFit(diameter, height);
        double waste = (containerVolume - volume) / containerVolume;
        return waste;
    }
    
    // Display the container information, including the minimum container volume and waste percentage
    public void displayContainer(){
        System.out.printf("%.2f cu ft for a Cone (%.2f%% waste)%n", calculateBestFit(diameter, height), calculateWaste() * 100);
    }
}


