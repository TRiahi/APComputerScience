/**
 * 12.04
 * 
 * @author David Johnson
 * @version 1/10/14
 */
public class QuestionTwo{
    
    private static int f(int x) {
        
        if (x > 25) {
            
            return f(x/12+5) - 3;
            
        } else  {
            
            return 20;
            
        }
    }   

    public static void main(String[] args) {
        
        System.out.println(f(30));
        
    }
}