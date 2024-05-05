/***********************************************
*   Ryan Ronish  Homework Assignment 3         * 
*   11/03/23                                   *
*                                              *
***********************************************/
import java.lang.Math;

class Cylinder implements Shape {
    private double height;
    private double diameter;
    private double weight;

    // Constructor for initializing a Cylinder object with given height, diameter, and weight
    public Cylinder(double height, double diameter, double weight) {
        this.height = height;
        this.diameter = diameter;
        this.weight = weight;
    }

    // Display the dimensions and weight of the Cylinder
    public void displayDimensions() {
        System.out.println("A Cylinder of height " + height + 
        ", diameter " + diameter + ", and weight " + weight + " lb. was created.");
    }
    
    // Calculate and return the volume of the Cylinder
    public double calculateVolume(double height, double diameter){
        double radius = diameter / 2;
        double volume = Math.PI * Math.pow(radius, 2) * height;
        return volume;
    }
    
    // Calculate and return the density of the Cylinder based on its weight and volume
    public double calculateDensity(double weight){
        double volume = calculateVolume(height, diameter);
        double density = weight / volume;
        return density;
    }
    
    // Display the volume and density of the Cylinder, rounded to two decimal places
    public void displayVolumeDensity(){
        System.out.printf("Cylinder volume: %.2f cu ft.   Cylinder density: %.2f lbs./cu ft%n", calculateVolume(height, diameter), calculateDensity(weight));
    }
    
    // Calculate and return the minimum volume that a container for the Cylinder should have
    public double calculateBestFit(double diameter, double height){
        double minVolume = diameter * diameter * height;
        return minVolume;
    }
    
    // Calculate and return the waste percentage when the Cylinder is placed in a container
    public double calculateWaste(){
        double volume = calculateVolume(height, diameter);
        double containerVolume = calculateBestFit(diameter, height);
        double waste = (containerVolume - volume) / containerVolume;
        return waste;
    }
    
    // Display the container information, including the minimum container volume and waste percentage
    public void displayContainer(){
        System.out.printf("%.2f cu ft for a Cylinder (%.2f%% waste)%n", calculateBestFit(diameter, height), calculateWaste() * 100);
    }
}

