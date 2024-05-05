/***********************************************
*   Ryan Ronish  Homework Assignment 3         * 
*   11/03/23                                   *
*                                              *
***********************************************/
import java.lang.Math;

class Sphere implements Shape {
    private double diameter;
    private double weight;

    // Constructor for initializing a Sphere object with given diameter and weight
    public Sphere(double diameter, double weight) {
        this.diameter = diameter;
        this.weight = weight;
    }

    // Display the dimensions and weight of the Sphere
    public void displayDimensions() {
        System.out.println("A Sphere of diameter " + diameter + 
        " and weight " + weight + " lb. was created.");
    }
    
    // Calculate and return the volume of the Sphere
    public double calculateVolume(double diameter){
        double radius = diameter / 2;
        double volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
        return volume;
    }
    
    // Calculate and return the density of the Sphere based on its weight and volume
    public double calculateDensity(double weight){
        double volume = calculateVolume(diameter);
        double density = weight / volume;
        return density;
    }
    
    // Display the volume and density of the Sphere, rounded to two decimal places
    public void displayVolumeDensity(){
        System.out.printf("Sphere volume: %.2f cu ft.     Sphere density: %.2f lbs./cu ft%n", calculateVolume(diameter), calculateDensity(weight));
    }
    
    // Calculate and return the minimum volume that a container for the Sphere should have
    public double calculateBestFit(double diameter){
        double minVolume = diameter * diameter * diameter;
        return minVolume;
    }
    
    // Calculate and return the waste percentage when the Sphere is placed in a container
    public double calculateWaste(){
        double volume = calculateVolume(diameter);
        double containerVolume = calculateBestFit(diameter);
        double waste = (containerVolume - volume) / containerVolume;
        return waste;
    }
    
    // Display the container information, including the minimum container volume and waste percentage
    public void displayContainer(){
        System.out.printf("%.2f cu ft for a Sphere (%.2f%% waste)%n", calculateBestFit(diameter), calculateWaste() * 100);
    }
}

