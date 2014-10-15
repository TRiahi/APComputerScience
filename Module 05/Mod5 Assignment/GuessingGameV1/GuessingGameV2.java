/**
 * A game to guess numbers
 * 
 * @author David Johnson
 * @version 10/14/14
 */

//importing scanner
import java.util.Scanner;

public class GuessingGameV2
{
    
    public static void main(String[] args)
    {
        
        //printing out nice welcome message
        System.out.println("Welcome to the number guessing game! Guess a number between 1-100!");
        
        //declaring everything I need for the game
        int number = 0;
        int numberGuessed = 0;
        int guesses = 0;
        int minRange = 0;
        int maxRange = 0;
        String minMax;
        Scanner in = new Scanner(System.in);
        
        //asking for the user set range
        System.out.print("Please enter the range you'd like to choose from (min max)");
        minMax = in.nextLine(); 
        
        //getting the min and max while parsing in one line :)
        minRange = Integer.parseInt(minMax.substring(0,minMax.indexOf(" ")));
        maxRange = Integer.parseInt(minMax.substring(minMax.indexOf(" ") + 1));
        
        //this creates the random number, using a formula from past langauges I've learned
        number = minRange + (int)(Math.random() * maxRange); 
        
        //straight forward loop
        while (number != numberGuessed){
            
            //getting guess
            System.out.println();
            System.out.print("Enter your guess: ");
            numberGuessed = in.nextInt();
            
            //if the user guesses to high we print message
            if(numberGuessed > number){
                
                System.out.println("Guess is to high!");
                
            }
            
            //if not then we print its to low
            else{
                
                System.out.println("Guess is to low!");
                
            }
            
            //adding guesses
            guesses++;
            
        }
        
        //printing out the congrats, random number, and guesses
        System.out.println();
        System.out.println("Congratulations, you won!! :D ");
        System.out.println("The random number was: " + number);
        System.out.println("Number of guesses" + guesses);
        
    }
    
}