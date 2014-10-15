
/**
 * A game to guess numbers
 * 
 * @author David Johnson
 * @version 10/14/14
 */

import java.util.Scanner;

public class GuessingGameV1
{
    
    public static void main(String[] args)
    {
        
        System.out.println("Welcome to the number guessing game! Guess a number between 1-100!");
        
        int number = 0;
        int numberGuessed = 0;
        int guesses = 0;
        Scanner in = new Scanner(System.in);
        
        number = 1 + (int)(Math.random() * 100); 
        
        while (number != numberGuessed){
            
            System.out.print("Enter your guess: ");
            numberGuessed = in.nextInt();
            
            if(numberGuessed > number){
                
                System.out.println("Guess is to high!");
                
            }
            
            else{
                
                System.out.println("Guess is to low!");
                
            }
            
            guesses++;
            
        }
        
        System.out.println("Congratulations, you won!! :D ");
        System.out.println("The random number was: " + number);
        System.out.println("Number of guesses" + guesses);
        
    }
    
}
