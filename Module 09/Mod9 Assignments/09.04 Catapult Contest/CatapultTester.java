/**
 * Write a description of class CatapultTester here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CatapultTester{
    
    public static void main(String[] args){
        
        double [] speed = {20,25,30,35,40,45,50};
        double [] degrees = {25,30,35,40,45,50};
        
        System.out.printf("%s", "MPG");
        
        for (int i = 0; i < degrees.length; i++){
        
            System.out.printf("%10.0f",degrees[i]);
            
        }
        
        System.out.printf("\n");
        System.out.println("=======================================================");
        
        for (int i = 0; i < speed.length; i++){
            
            System.out.printf("%1.0f\n",speed[i]);
        
        }
        
    }
   
}
