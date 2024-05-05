/***********************************************
*   Ryan Ronish  Homework Assignment 3         * 
*   11/03/23                                   *
*                                              *
***********************************************/

// The Shape interface defines a set of methods that any class implementing this interface must provide.
interface Shape {
    
    // This method displays the dimensions of a shape.
    // It is expected to be implemented by classes that represent specific shapes.
    void displayDimensions();

    // This method displays the volume and density of a shape.
    // It is expected to be implemented by classes that represent specific shapes.
    void displayVolumeDensity();

    // This method displays information about the container of the shape, including
    // the container volume and waste percentage.
    void displayContainer();
}

