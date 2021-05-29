
/**
 * Learn Overriding Methods
 * 4/20/2021
 * Ryan Wagner
 */
public class Quadrilateral4 extends Rectangle4
{

    /**
     * Constructor for objects of class Quadrilateral
     */
    public Quadrilateral4(int l, int w)
    {
        super(l, w);
    }

    public String toString()
    {
        return "Quadrilateral - " + getLength() + " X " + getWidth();
    }
}
