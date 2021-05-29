
/**
 * Learn Overriding Methods
 * 4/20/2021
 * Ryan Wagner
 */
public class RectangularPrism4 extends Box4
{

    /**
     * Constructor for objects of class RectangularPrism4
     */
    public RectangularPrism4(int l, int w, int h){
        super(l, w, h);
    }

    public String toString()
    {
        return "Rectangular Prism - " + getLength() + " X " + getWidth() + " X " + getHeight();
    }

}
