/**
 * Box2 demo.
 * 
 * @author R. Enger 
 * @version 5/5/2007
 */
public class Box3 extends Rectangle3
{
    // instance variables 
    private int height;
    private int width;
    private int length;
    
    /**
     * Constructor for objects of class box
     */
    public Box3(int l, int w, int h)
    {
        // call superclass
        super(l, w);
        // initialise instance variables
        height = h;
        width = w;
        length = l;
        
    }

    // return the height
    public int getHeight()
    {
        return height;
    }
    
    public int getWidth(){
    
        return width;
       
    }
    
    public int getLength(){
    
        return length;
       
    }
    
    public String toString()
    {
        return "The box's dimensions are " + getLength() + " X " + getWidth() + " X " + height;
    }

}
