/**
 * Finds the probabilty for the dice rolled, user can choose sides and amount of rolls
 *
 * @author David Johnson
 * @version 10/21/14
 *
 *
 */

//importing random and scanner
import java.util.Random;
import java.util.Scanner;

public class DiceProbability
{
    public static void main(String[] args)
    {
      
	//creating all the variables needed
        int sumOfDice = 0;
        int sumOfRoll = 0;
        int numSides = 0;
        int numRolls = 0;
        int match = 0; //Number of times sum of dice matches the current sum
        double probability = 0.0;
        Random randNum = new Random();
        Scanner in = new Scanner(System.in);
        
	//asking the user for input and setting 
        System.out.print("Please enter the number of sides on a die: ");
        numSides = in.nextInt();
        System.out.print("Please enter the number of rolls: ");
        numRolls = in.nextInt();
        
	//printing basic visual structure
        System.out.print("\n Sum of dice \t Probability \n");
        
	//nested for loop that is counting the sides rolls and generating sum of roll
        for( sumOfDice = 1; sumOfDice <= (numSides * 2); sumOfDice++ )
        {
            
            for( int roll  = 0; roll < numRolls; roll++ )
            {
                
                for(int i = 0; i < 2; i++)
                {
                    
                    sumOfRoll = randNum.nextInt(numSides * 2) + 1;
                    
                }
            
                if ( sumOfDice == sumOfRoll )
                {
                    
	 	    //adding to the match if the sum equals sum of the roll
                    match++;
                    
                } // end if
                
                sumOfRoll = 0;
                
            } //end for
            
	    //printing out prob data in correct format
            System.out.println("    " + sumOfDice + "s: " + "    \t\t" + ((double)match / 1000) * 100);
            
            match = 0;
        } //end for
       
    } //end main

}//end class DiceProbability
