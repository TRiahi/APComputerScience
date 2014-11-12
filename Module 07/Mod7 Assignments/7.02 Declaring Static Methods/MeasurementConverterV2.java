/**
 * A program that uses static methods to convert units of measurement
 * 
 * @author David Johnson
 * @version 11/10/14
 */
public class MeasurementConverterV2{
    
    public static void printPurpose( ){
        
	//printing the basic top structure
        System.out.println("This program converts to and from");
        System.out.println("English and metric units of measure.");
        System.out.println("=====================================");
        
    }
        
    //static methods calculating and returning conversion values

    //convert feet to miles
    public static double convertFeetToMiles(double ft){
        
        return ft / 5280;      
        
    } 
    
    //convert miles to feet
    public static double convertMilesToFeet(double mi){
        
        return mi * 5280;      
        
    } 
    
    //convert miles to kilometers
    public static double convertMilesToKilometers(double mi){
        
        return mi / 0.62137;  
        
    } 
    
    //convert kilometers to miles
    public static double convertKilometersToMiles(double km){
        
        return km * 0.62137;
        
    } 
    
    //convert pounds to kilograms
    public static double convertPoundsToKilograms(double pounds){
        
        return pounds / 0.453592;
        
    } 
    
    //convert kilograms to pounds
    public static double convertKilogramsToPounds(double kilograms){
        
        return kilograms * 0.453592;
        
    } 
    
    public static double convertGallonsToLiters(double gallons){
        
        return gallons / 0.26417;
        
    }
    
    public static double convertLitersToGallons(double liters){
        
        return liters * 0.26417;
        
    }
    
    public static double convertMBToGIG(double MB){
        
        return MB / 1024;
        
    }
    
    public static double convertGIGToMB(double GIG){
        
        return GIG * 1024;
        
    }
    
    public static void main(String[ ] args)
    {
        //local variables
        double miles = 0 , feet = 0 , inches = 0 , pounds = 0 , gallons = 0, kilometers = 0 , kilograms = 0 
        , liters = 0, MB = 0, GIG = 0;
    
        printPurpose(); 
                  
	//printing all of the conversions out                 
        feet = 6230;
        miles = convertFeetToMiles(feet);            
        System.out.printf("%8.1f ft. = %7.1f mi. %n", feet, miles);
        
        miles = 1.9;
        feet = convertMilesToFeet(miles);
        System.out.printf("%8.1f mi. = %7.1f ft. %n", miles, feet);
        
        miles = 22.3;
        kilometers = convertMilesToKilometers(miles);
        System.out.printf("%8.1f mi. = %7.1f km. %n", miles, kilometers);
        
        kilometers = 1000.0;
        miles = convertKilometersToMiles(kilometers);
        System.out.printf("%8.1f km. = %7.1f mi. %n", kilometers, miles);
        
        pounds = 204.0;
        kilograms = convertPoundsToKilograms(pounds);
        System.out.printf("%8.1f lb. = %7.1f kg. %n", pounds, kilograms);
        
        kilograms = 78.0;
        pounds = convertKilogramsToPounds(kilograms);
        System.out.printf("%8.1f kg. = %7.1f lbs. %n", kilograms,  pounds);
        
        gallons = 55.0;
        liters = convertGallonsToLiters(gallons);
        System.out.printf("%8.1f gl. = %7.1f li. %n", gallons,  liters);
        
        liters = 2.0;
        gallons = convertLitersToGallons(liters);
        System.out.printf("%8.1f li. = %7.1f gl. %n", liters,  gallons);
           
        MB = 44556.6;
        GIG = convertMBToGIG(MB);
        System.out.printf("%9.1f MB = %7.1f GIG %n", MB,  GIG);
        
        GIG = 56.7;
        MB = convertGIGToMB(GIG);
        System.out.printf("%8.1f GIG = %7.1f MB %n", GIG,  MB);
    }//end of main method
    
}//end of class


