/**
 * Learn Overriding Methods
 * 4/20/2021
 * Ryan Wagner
 */
public class Box4 extends Rectangle4
{
    // instance variables
    private int height;

    // Constructor for objects of class Box
    public Box4(int l, int w, int h)
    {
        // call superclass
        super(l, w);

        // initialize instance variables
        height = h;
    }

    // return the height
    public int getHeight()
    {
        return height;
    }

    // String to display when object is printed.
    public String toString()
    {
        return "Box - " + getLength() + " X " + getWidth() + " X " + height;
    }
    
    public boolean equals(Object o){
        Box4 b = (Box4)o;
        return b.getLength() == getLength() && b.getWidth() == getWidth() && b.getHeight() == height;
    }
}
