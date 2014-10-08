/**
 * A program written calculate BMI from pounds and height, then tell the
 * user if they are over weight.
 * 
 * @author David Johnson
 * @version 10/1/14
 */

//importing scanner from util lib
import java.util.Scanner;

public class BMI
{
   
    public static void main(String[] args)
    {
        
        //creating new scanner
        Scanner in = new Scanner(System.in);  
        
        //getting the users name
        System.out.print("Enter your name (first, last): ");
        String fullname = in.nextLine();
        
        //getting the users weight
        System.out.print("Enter your weight in pounds (e.g. 175): ");
        String weight = in.nextLine();
        
        //weight being parsed and converted into kg
        int weightPounds = Integer.parseInt(weight);
        double weightTotal = (double)weightPounds * 0.453592;
        
        //getting the users height
        System.out.print("Enter your height in feet and inches (e.g. 5 11): ");
        String feetInches = in.nextLine();
        
        //finding the point where there is a space
        int point = feetInches.indexOf(" ");
        int lenghtFeetInches = feetInches.length();
        
        //getting the feet and inches in there respected vars
        String feet = feetInches.substring(0,point);
        String inches = feetInches.substring(point + 1,point + 2);
        
        //parsing strings, then converting feet to inches, then inches to meters
        int intFeet = Integer.parseInt(feet);
        int intInches = Integer.parseInt(inches);
        int inchesTotal = intFeet * 12;
        inchesTotal += intInches;
        double metersTotal = (double)inchesTotal * 0.0254;
        
        //calculating total bmi
        double bmi = weightTotal / (metersTotal * metersTotal);
      
        String category = "";
        
        //if else if structure to check bmi
        if (bmi < 18.8){
            category = "Underweight"; 
        }
        else if (bmi > 18.5 && bmi < 24.9)
        {
            category = "Normal";
        }
        else if (bmi > 25.0 && bmi < 29.9)
        {
            category = "Overweight";
        }
        else if (bmi > 30.0)
        {
            category = "Obese";
        }
        
        //printing all the required structure for the program
        System.out.println("Body Mass Index Calculator");
        System.out.println("==========================");
        System.out.println("Name: " + fullname);
        System.out.println("Height (m): " + metersTotal);
        System.out.println("Weight (kg): " + weightTotal);
        System.out.println("BMI: " + bmi);
        System.out.println("Catergory: " + category);
        
    }
    
}
