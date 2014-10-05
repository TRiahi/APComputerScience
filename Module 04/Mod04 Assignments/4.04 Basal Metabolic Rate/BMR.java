
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
       
       System.out.print("Enter your name: ");
       String name = in.nextLine();
      
       System.out.print("Gender (M or F): ");
       char gender = in.next().charAt(0);
       
       System.out.print("Enter your age: ");
       int age = in.nextInt();
       
       System.out.print("Height in inches: ");
       double inches = in.nextDouble();
       
       System.out.print("Weight in pounds: ");
       double pounds = in.nextDouble();
       
       double cmHeight = inches * 2.54;
       double kgWeight = pounds / 0.453592;
       double BMR = 0;
       
       if (gender == 'M'){
           
           BMR = (10 * kgWeight) + (6.25 * cmHeight) - (5 * age + 5);
           
       }else if (gender == 'F'){
           
           BMR = (10 * kgWeight) + (6.25 * cmHeight) - (5 * age - 161);
           
       }
       
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

