/***********************************************
*   Ryan Ronish  Homework Assignment 2         * 
*   11/03/23                                   *
*                                              *
***********************************************/
public class Box extends Shape
{
    // instance variables lwh
    private double length;
    private double width;
    private double height;
    
    //Constructor one - has no parameters and initializees the Box's instance variables to 0.0
    public Box()
    {
        // initialise instance variables
        this.length = 0.0;
        this.width = 0.0;
        this.height = 0.0;
    }
    //Constructor two four double parameters that initializes the Box object's length, width, height, and weight
    public Box(double length, double width, double height, double weight)
    {
        this.length = length;
        this.width = width;
        this.height = height;
        this.weight = weight;
    }
    //accepts a double and returns nothing
    public void setLength(double length)
    {
        this.length = length;
    }
    //no aurguement and returns the length value as a double
    public double getLength()
    {
        return length;
    }
    //accepts a double and returns nothing
    public void setWidth(double width)
    {
        this.width = width;
    }
    //no arguements and returns the width value as a double
    public double getWidth()
    {
        return width;
    }
    //accepts a double and returns nothing
    public void setHeight(double height)
    {
        this.height = height;
    }
    // no arguements and returns the height value as a double
    public double getHeight()
    {
        return height;
    }
    // no args, returns boolean
    public boolean isACube()
    {
        return length == width && width == height;
    }
    // no args, returns boolean
    // 2/3 have to have the same value
    public boolean hasASquare()
    {
        return length == width || width == height || height == length;
    }
    // no args, returns volume
    // formula = length * width *height
    public double calculateVolume(){
        return length * width * height;
    }
    //no args, returns density
    //formula = weight/volume
    public double calculateDensity() {
        double volume = calculateVolume();
        
        if (volume == 0) {
            return 0.0; // Return a default value or handle the error appropriately.
        }
        
        return weight / volume;
    }
    
    // Returns a boolean true if the density is >= 10.00lbs
    public boolean isHeavy() {
        try {
            double density = calculateDensity();
            return density >= 10.0;
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage()); // Handle the exception message here if needed.
            return false; // Return an appropriate default value.
        }
    }
    
    // No args, returns a boolean true if the density is <= 0.10lbs/cu ft
    public boolean isLightWeight() {
        try {
            double density = calculateDensity();
            return density <= 0.10;
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage()); // Handle the exception message here if needed.
            return false; // Return an appropriate default value.
        }
    }
}
