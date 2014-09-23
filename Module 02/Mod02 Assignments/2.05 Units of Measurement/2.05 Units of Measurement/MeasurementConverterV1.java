/**
 * MeasuermentConverter_v1 converts to and from Metric and English
 * units of measure.
 *
 *      Sample Calculation:
 *        1 mile = 5280 ft,
 *        therefore    6230 ft / 5280 = 1.17992 miles
 *          and    1.179 miles * 5280 = 6225.12 ft
 *
 * �FLVS 2007
 * @author B. Jordan
 * @version 01/19/07
 *
 * Modified by: David Johnson
 * Date: 9/18/14
 */
public class MeasurementConverterV1
{
    public static void main(String[ ] args)
    {
        //local variable declarations - assign actual values below
        double miles;                   // distance in miles
        double feet;                    // distance in feet
        double kilometers;              // distance in kilometers 
        double pounds;                  // weight in pounds
        double kilograms;               // weight in kilograms
        double liters;                  // amount in liters
        double gallons;                 // amount in gallons
        double tbsp;                    // amount in tablespoon
        double tsp;                     // amount in teaspoon
        double feetPerMile = 5280;      // number of feet per 1 mile
        double kilometerPerMile = 1.60934; // number of kilometers in one mile 
        double kilogramPerPound = 0.453592; //number of kilograms per pound
        double literPerGallon = 3.78541;//number of liters per gallon
        double tablespoonPerTeaspoon = 3; //number of tablespoon per teaspoon

        //convert feet to miles
        feet = 6230;
        miles = feet / feetPerMile; 
        System.out.println( feet + " ft. = " + miles + " mi.");
        
        //convert miles to feet
        miles = 3;
        feet = miles * feetPerMile;
        System.out.println( miles + " mi. = " + feet + " ft. " );
        
        System.out.println();
        
        //miles to lkilometers 
        miles = 6;
        kilometers = miles * kilometerPerMile;
        System.out.println( kilometers + " km. = " + miles + " mi. " );
        
        //kilometers to miles 
        kilometers = 9;
        miles = kilometers / kilometerPerMile;
        System.out.println( miles + " mi. = " + kilometers + " km. " );
              
        System.out.println();
        
        //pounds to kilograms 
        pounds = 30;
        kilograms = pounds * kilogramPerPound;
        System.out.println( kilograms + " kg. = " + pounds + " lb. " );
        
        //kilograms to pounds 
        kilograms = 67;
        pounds = kilograms / kilogramPerPound;
        System.out.println( pounds + " lb. = " + kilograms + " kg. " );
        
        System.out.println();
        
        //gallons to liters
        gallons = 4;
        liters = gallons * literPerGallon;
        System.out.println( gallons + " gal. = " + liters + "lit." );
        
        //liters to gallons
        liters = 65;
        gallons = liters / literPerGallon;
        System.out.println( liters + " lit. = " + gallons + " gal." );
        
        System.out.println();
        
        //tablespoons to teaspooon
        tbsp = 45;
        tsp = tbsp * tablespoonPerTeaspoon;
        System.out.println( tbsp + " tbsp. = " + tsp + " tsp." );
        
        //teaspoon to tablespoon
        tsp = 57;
        tbsp = tsp / tablespoonPerTeaspoon;
        System.out.println( tsp + " tsp. = " + tbsp + " tbsp. " );
        
    }//end of main method
}//end of class

