/**
 * Tests the cube class
 * 
 * @author David Johnson 
 * @version 1/22/15
 */
public class CubeTester{
  
    public static void main(String[] args){
	    
        int width = 3, height = 3, length = 3;
        
        Cube vars = new Cube(length, width, height);
        
        int check = vars.cubeCheck();
        
        if (check == 1){
        
            width = vars.getWidth();
            height = vars.getHeight();
            length = vars.getLength();
            
            System.out.println("Cube class is working");
            System.out.println(width + " | " + height + " | " + length);
            
        }else{
            
            System.out.println("Cube class is working");
            System.out.println("Error: All sides need to be the same.");
            
        }
        
	}
    
}
