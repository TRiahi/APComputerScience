
/**
 * A program to determine if your exercising heart rate is within a healthy range
 * 
 * @author David Johnson 
 * @version 10/1/14
 */

//importing scanner class for obvious reasons
import java.util.Scanner;

public class BMR
{
   public static void main(String [] args) 
   {
       
       //declaring a new scanner
       Scanner in = new Scanner(System.in);  
       
       //getting the users name
       System.out.print("Enter your name: ");
       String name = in.nextLine();
      
       //getting the users gender 
       System.out.print("Gender (M or F): ");
       char gender = in.next().charAt(0);
       
       //getting the users age
       System.out.print("Enter your age: ");
       int age = in.nextInt();
       
       //getting the users height in inches
       System.out.print("Height in inches: ");
       double inches = in.nextDouble();
       
       //getting the users weight 
       System.out.print("Weight in pounds: ");
       double pounds = in.nextDouble();
       
       //converting inches to cm and pounds to kg
       double cmHeight = inches * 2.54;
       double kgWeight = pounds / 0.453592;
       //initializing BMR
       double BMR = 0;
       
       //simple if else structure to figure out the gender
       if (gender == 'M'){
           
           BMR = (10 * kgWeight) + (6.25 * cmHeight) - (5 * age + 5);
           
       }else{
           
           BMR = (10 * kgWeight) + (6.25 * cmHeight) - (5 * age - 161);
           
       }
       
       //printing out all of the information in the required structure
       System.out.println();
       System.out.println("Calculate Your Basal Metabolism");
       System.out.println();
       System.out.println("Name: " + name);
       System.out.println("Gender: " + gender);
       System.out.println("Age: " + age);
       System.out.println("Weight (kg): " + kgWeight);
       System.out.println("Height (cm): " + cmHeight);
       System.out.println("Basal Metabolic Rate: " + BMR + " calaries per day");
       
   }
}

