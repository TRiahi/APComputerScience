
/**
 * A program to determine if your exercising heart rate is within a healthy range
 * 
 * @author David Johnson 
 * @version 10/1/14
 */

//importing scanner class for obvious reasons
import java.util.Scanner;

public class TargetZone
{
   public static void main(String [] args) 
   {
       
       //printing out the header statement
       System.out.println("Determine Your Heart Rate Zone for Cardiovascular Exercise (50%-80%)");
       System.out.println();
       
       //declaring a new scanner
       Scanner in = new Scanner(System.in);  
       
       //asking for users age
       System.out.print("Enter your age: ");
       String age = in.nextLine();
       
       //asking for the users resting heart rate
       System.out.print("Enter your heart rate: ");
       String heartRate = in.nextLine();
       
       //asking for the users heart rate after exercising 
       System.out.print("Enter your heart rate after exercising: ");
       String heartRateExcercising = in.nextLine();
       
       //parsing strings into doubles for calculations
       double dHeartRate = Double.parseDouble(heartRate);
       double dAge = Double.parseDouble(heartRate);
       double dHeartRateExcercising = Double.parseDouble(heartRateExcercising);
       
       //calculating the required information to output (high,low,range)
       double maximumHeartRate = 220 - dAge;
       double heartRateReserve = maximumHeartRate - dHeartRate;
       double high = (heartRateReserve * .85) + dHeartRate;
       double low = (heartRateReserve * .50) + dHeartRate;
       
       //magically casting doubles into integers
       int intHeartRateExcercising = (int)(dHeartRateExcercising);
       int intHigh = (int)(high);
       int intLow = (int)(low);
       
       //outputing the range
       System.out.println("Your excercising heart rate should be between " + high + " and " + low + ".");
       
       //simple if statement to output if the user is in the range or not
       if (intHeartRateExcercising < intHigh && intHeartRateExcercising > intLow){
           System.out.println("After just exercising, your heart rate is within your target zone. ");
       }else{
           System.out.println("Your heart rate is not within the range, contact your doctor!");
       }
   }
}

