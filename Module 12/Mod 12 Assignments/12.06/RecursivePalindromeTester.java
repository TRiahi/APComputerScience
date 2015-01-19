/**
 * A program that takes input in and uses palindrome
 * 
 * David Johnson
 * 
 * 1/18/15
 */

import java.util.Scanner;

public class RecursivePalindromeTester{
    
    public static void main(String[] args){
        
        RecursivePalindrome Pal = new RecursivePalindrome ();

        boolean stop = true;
        Scanner in = new Scanner(System.in);
        
        while(stop){
            
            System.out.print("Enter to test if it is a palindrome. Don't want to continue? Type stop! : ");
            String input = in.nextLine();
        
            boolean itsPal = Pal.isP(input);
            
            if(itsPal == true){
            
                System.out.println(input + " is a palindrome.");
            
            }else if (input.equals("stop")) {
                
                stop = false;
                System.out.println("You have quit the program.");
            
            }else{
                
                System.out.println(input + " is not a palindrome.");
            
            }
        
        }
    
    }

}