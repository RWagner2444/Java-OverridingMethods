
/**
 * Learn Overriding Methods
 * 4/20/2021
 * Ryan Wagner
 */
public class Cube4 extends Box4
{
    
    public Cube4(int l, int w, int h){
        super(l, w, h);
    }

    public String toString()
    {
        return "Cube - " + getLength() + " X " + getWidth() + " X " + getHeight();
    }
}
