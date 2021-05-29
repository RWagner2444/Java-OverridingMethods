
/**
 * Learn Overriding Methods
 * 4/20/2021
 * Ryan Wagner
 *
 *
 * @author Poly Morphism
 * @version 06/13/17
 * 
 * PMR is in the Tester class
 */
public class Rectangle4
{
    // instance variables
    private int length;
    private int width;

    // Constructor for objects of class Rectangle
    public Rectangle4(int l, int w)
    {
        // initialize instance variables
        length = l;
        width = w;
    }

    // return the height
    public int getLength()
    {
        return length;
    }

    // return the width
    public int getWidth()
    {
        return width;
    }

    // String to display when object is printed.
    public String toString()
    {
        return "Rectangle - " + length + " X " + width;
    }
    
    public boolean equals(Object o){
        Rectangle4 r = (Rectangle4)o; 
        return r.getLength() == length && r.getWidth() == width;
    }
}
