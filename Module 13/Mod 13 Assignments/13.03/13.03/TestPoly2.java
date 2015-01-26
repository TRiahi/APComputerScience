
/**
 * Testing all the poly classes
 * 
 * @author David Johnson
 * @version 1/26/15
 */
public class TestPoly2
{
    
    public static void main(String[] args){
       int x = 3, y = 4, z = 5;
        
       for (int i = 0; i < 4; i++){
            
            Circle2 var = new Circle2(x,y,z);
            
            String circle = var.center();
            
            System.out.println(circle);
            
            x = x + i + 2;
            y = y + i + 3;
            z = z + i + 6;
            
       }
        
    }
    
}
       
        
