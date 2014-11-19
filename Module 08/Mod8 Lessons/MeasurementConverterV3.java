
/**
 * The purpose of this program is to demonstrate Object Oriented Programming.
 * A default constructor is defined to create an object and methods are called
 * on the object.
 *
 * ©FLVS 2007
 * @author B. Jordan 
 * @version 05/25/07
 * Lesson: 08.03
 */
public class MeasurementConverterV3
{
    //default constructor
    //    consult the CylinderVolumeV2 class in the 8.02 Virtual Lecture Notes
    //    to see how to write a default constructor.  Remember that the constructor
    //    always has the same name as the class.
    
    //Purpose of program
    public void printPurpose( )  //notice that this method is void, nothing is returned
    {
        System.out.println("This program converts to and from");
        System.out.println("English and metric units of measure.");
        System.out.println("=====================================");
    }
        
    //convert feet to miles
    //the ft parameter receives the value of the feet argument passed from main method. 
    public double convertFeetToMiles(double ft)
    {
        return ft / 5280;      
    } 
    
    //convert miles to feet
    public double convertMilesToFeet(double mi)
    {
        return mi * 5280;      
    } 
    
    //convert miles to kilometers
    public double convertMilesToKilometers(double mi)
    {
        return mi * 1.61;      
    } 
    
    //convert kilometers to miles
    
    
    //convert pounds to kilograms
     
    
    //convert kilograms to pounds
    
    
    //main method
    public static void main(String[ ] args)
    {   
        //variable declaration and initialization
        double feet = 6230;
        double miles = 0;
        double kilometers = 0;
        double pounds = 204;
        double kilograms = 0;
        
        //create a new convertV3 object
        //  write a statement to make a new object called convertV3 from the MeasurementConverterV3 class.
        //  consult the 8.03 Virtual Lecture Notes and demo programs to see how to write this statement.
        
        
        //invoke the printPurpose() method on the convertV3 object to display the purpose of the program
        
        miles = convertV3.convertFeetToMiles(feet);            //invoke the convertFeetToMiles() method and pass the feet variable as an argument
        System.out.printf("%8.1f ft. = %7.1f mi. %n", feet, miles);
        
        miles = 1.9;
        feet = convertV3.convertMilesToFeet(miles);
        System.out.printf("%8.1f mi. = %7.1f ft. %n", miles, feet);  //invoke the convertMilesToFeet() method
        
        miles = 22.3;
        kilometers = convertV3.convertMilesToKilometers(miles);      //invoke the convertMilesTpLo;p,eter
        System.out.printf("%8.1f mi. = %7.1f km. %n", miles, kilometers);
        
        //place the reset of the code assign data, invoke methods, and print results for the
        //   remaining conversions below this point.
        
        
    }//end of main method
    
}


