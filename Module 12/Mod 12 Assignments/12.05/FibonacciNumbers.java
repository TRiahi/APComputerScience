/**
 * Calculates the Fibonnaci value associated with an integer.
 * 
 * @author  David Johnson
 * @version 1/17/15
 */

import java.util.Scanner;
import javax.swing.*;

class FibonacciNumbers
{
    
    public int fibonacci(int y){  
       
        if (y <= 1){
            
            return y;
        
        }

        else{
            
            return fibonacci(y-1) + fibonacci(y-2);
        
        }
        
    }
    
}

public class FibonacciNumbersTester{
    
    public static void main(String[] args){
        
        while (true) {
            
            FibonacciNumbers object = new FibonacciNumbers();

            System.out.println("Please enter an integer for the Fibonacci calculation or enter 0 to quit the program: ");
            Scanner in = new Scanner(System.in);
            int n = in.nextInt();
            int f = 0;
        
            if (n == 0){
                
                System.out.println("You've quit the program.");
                System.exit(0);
            
            }else if (n != 0){
                
                for (int i = 1; i <= n; i++){
                   
                    f = object.fibonacci(i);
                
                }
                
                System.out.println("fibonacci(" + n + ") = " + f);
            
            }else{
                
                System.out.println("Please enter an integer!");
            
            }
            
        }
        
    }
    
}