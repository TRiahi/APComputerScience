
/**
 * The Shapes class calcualtes the area and the 
 * hypoteneuse of a triangle.
 * 
 * @author B. Jordan 
 * @version 05/31/07
 * Lesson: 08.06
 */
public class Shapes
{
    private int myBase;
    private int myHeight;
    
    Shapes(int b, int h)
    {
        myBase = b;
        myHeight = h;
    }
    
    public double calcTriArea()
    {
        return myBase * myHeight * .5;    
    }
    
    public double calcHypoteneuse()
    {
        return Math.sqrt(Math.pow(myBase, 2) + Math.pow(myHeight, 2));
    }
    
    
}