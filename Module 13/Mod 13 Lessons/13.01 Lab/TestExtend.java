public class TestExtend extends Rectangle
{
    // instance variables 
    private int height;
    private int width;
    
    /**
     * Constructor for objects of class box
     */
    public TestExtend(int l, int w, int h)
    {
        // call superclass
        super(l, w);
        // initialise instance variables
        height = h;
        width = w;
    }

    // return the height
    public int getTotal()
    {
        return height + width;
    }

}
