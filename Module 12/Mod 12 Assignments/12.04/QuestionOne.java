/**
 * 12.04
 * 
 * @author David Johnson
 * @version 1/10/14
 */
public class QuestionOne{
    
    private static int f(int x) {
        
        if (x > 10) {
            
            return f(x-4) + 2;
            
        } else  {
            
            return -7;
            
        }
        
    }   

    public static void main(String[] args) {
        
        System.out.println(f(25));
        
    }
}