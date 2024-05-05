/***********************************************
*   Ryan Ronish  Homework Assignment 2         * 
*   11/03/23                                   *
*                                              *
***********************************************/

public class Shape
{
    // instance variables
    protected double weight;
    //constructor one - has no parameters and initaializes Shapes weight to 0.0
    public Shape()
    {
        this.weight = 0.0;
    }
    //constructor two - has one double parameter that initializes Shape's weight
    public Shape(double weight)
    {
        this.weight = weight;
    }
    //setweight method
    public void setWeight(double weight){
        this.weight = weight;
    }
    //getweight method
    public double getWeight(){
        return this.weight;
    }
}
