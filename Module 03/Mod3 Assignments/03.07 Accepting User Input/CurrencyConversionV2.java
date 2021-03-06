/**
 * The CurrencyConversion class converts an amount of money from a specific
 * country into the equivalent currency of another country given the current
 * exchange rate.
 *
 *
 * �CSA/FLVS 2011
 * @author Maria Vieta Jacquard
 * @version 09/01/11
 * 
 * Modified By: David Johnson
 * Modified On: 9/23/14
 * 
 */

import java.util.Scanner; //importing the scanner class

public class CurrencyConversionV2
{
    public static void main(String [ ] args)
    {
        System.out.print("Please enter your name (first last): ");
        double startingUsDollars = 5000.00;     // local variable for US Dollars
        double pesosSpent = 7210.25;            // local variable for Mexican pesos spent
        double yenSpent = 99939.75;             // local variable for Yen spent
        double euroSpent = 624.95;              // local variable for Euro spnet
        double pesoExchangeRate = 0.0796;       // local variable for exchange rate of US Dollars to Pesos
        double euroExchangeRate = 1.3565;       // local variable for exchange rate of Euros
        double yenExchangeRate = 0.00972;       // local variable for exchange rate of Yen
        double dollarsSpentInMexico = 0.0;      // local variable for dollars spent in Mexico
        double dollarsSpentInJapan = 0.0;       // local variable for dollars spent in Japan
        double dollarsSpentInFrance = 0.0;      // local 
        double remainingUsDollars = 0.0;        // local variable for US Dollars remaining
        //remaining variables below here

        // purpose of program
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("This program converts an amount of money");
        System.out.println("from a specific country into the equivalent");
        System.out.println("currency of another country given the current");
        System.out.println("exchange rate.");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println();
        
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter the peso exchange rate:  ");
        pesoExchangeRate = in.nextDouble();
        System.out.println();
        String firstName = in.next();
        System.out.print("Please enter the euro exchange rate:  ");
        euroExchangeRate = in.nextDouble();
        System.out.println();
        
        System.out.print("Please enter the yen exchange rate:   ");
        yenExchangeRate = in.nextDouble();
        System.out.println();
        
        System.out.println("Starting US dollars:           5000.0");
        
        // convertion for Mexican pesos
        dollarsSpentInMexico = pesosSpent * pesoExchangeRate;
        remainingUsDollars = startingUsDollars - dollarsSpentInMexico;
        
        // convertion for Japanese yen
        dollarsSpentInJapan = yenSpent * yenExchangeRate;
        remainingUsDollars = remainingUsDollars - dollarsSpentInJapan;

        // convertion for Euros
        dollarsSpentInFrance = euroSpent * euroExchangeRate;
        remainingUsDollars = remainingUsDollars -  dollarsSpentInFrance;

        //print output to the screen
        System.out.println("US dollars spent in Mexico:    " + dollarsSpentInMexico);
        System.out.println("US dollars spent in Japan:     " + dollarsSpentInJapan);
        System.out.println("US dollars spent in France     " + dollarsSpentInFrance);
        System.out.println("======================================================");
        System.out.println("Remaining US dollars:          " + remainingUsDollars);
        System.out.println();
        System.out.println();

        // Complete the code below. Replace th 0's for totalItem and fundsRemaining
        // with the proper calculations. Casting, integer division and the modulus
        // operator needed. Do not worry about extra decimal places for the dollar amounts.

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Souvenir Purchases");
        System.out.println(" (all values in US Dollars) ");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        //Calculations for Souvenir #1
        int costItem1 = 4;                          //cost per item of first souvenir
        int budget1 = 50;                           //budget for first item
        int totalItem1 = 12;         //how many items can be purchased
        double fundsRemaining1 = 0.0;  //how much of the budget is left
        
        fundsRemaining1 = budget1 / totalItem1;
        fundsRemaining1 = (int)budget1 % costItem1;
        
        System.out.println("Item 1");
        System.out.println("   Cost per item: $" + costItem1 );
        System.out.println("   Budget: $"+ budget1);
        System.out.println("   Total items purchased: " +  totalItem1);
        System.out.println("   Funds remaining: $"  +  fundsRemaining1);

        //Calculations for Souvenir #2
        double costItem2 = 32.55;                       //cost per item of second souvenir
        int budget2 = 713;                              //budget for second item
        int totalItem2 = 21;     //how many items can be purchased
        double fundsRemaining2 = 0.0;   //how much of the budget is left
        
        fundsRemaining2 = budget2 / totalItem2;
        fundsRemaining2 = (int)budget2 % costItem2;
        
        System.out.println("Item 2");
        System.out.println("   Cost per item: $" + costItem2 );
        System.out.println("   Budget: $"+ budget2);
        System.out.println("   Total items purchased: " +  totalItem2);
        System.out.println("   Funds remaining: $"  +  fundsRemaining2);
        
    } // end of main method
} // end of class

