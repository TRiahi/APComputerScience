
/**
 * 12.04
 * 
 * @author David Johnson
 * @version 1/10/14
 */
public class QuestionFour{
    
    private static int f(int x) {
        
        if (x <= 20) {
            
            return f(x*2) - 4;
            
        } else  {
            
            return -100;
            
        }
        
    }   

    public static void main(String[] args) {
        
        System.out.println(f(500));
    
    }
    
}
