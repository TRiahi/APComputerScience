/**
 * Program to calculate the Total Daily Energy Expenditure
 *
 * @author David Johnson
 * @version 10/12/14
 */
import java.util.Scanner;
public class TDEE
{
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);

        // Input: Gather information from user
        System.out.print("Please enter your name: ");
        String name = in.nextLine();
        System.out.print("Please enter your BMR: ");
        double basalMR = in.nextDouble();
        System.out.print("Please enter your gender (M/F): ");
        String gender = in.next();
        System.out.println();

        // Activity Level Menu
        System.out.println("Select Your Activity Level");
        System.out.println("[A] Resting (Sleeping, Reclining)");
        System.out.println("[B] Sedentary (Minimal Movement)");
        System.out.println("[C] Light (Sitting, Standing)");
        System.out.println("[D] Moderate (Light Manual Labor, Dancing, Riding Bike)");
        System.out.println("[E] Very Active (Team Sports, Hard Manual Labor)");
        System.out.println("[F] Extremely Active (Full-time Athelete, Heavy Manual Labor)");
        System.out.println();
        System.out.print("Enter the letter corresponding to your activity level: ");
        String choice = in.next();
        System.out.println();

        //Processing:
        // Activity Factor
        double activityFactor = 0;
        
        choice = choice.toUpperCase();
          
        if (choice.equals("A")){
            
          activityFactor = 1.0;
                
        }
        
        else if (choice.equals("B")){
            
            activityFactor = 1.3;
                
        }
        
        else if (choice.equals("C")){
            
            if (gender.equals("M")){
                
                activityFactor = 1.6;
                
            }
            
            if (gender.equals("F")){
                
                activityFactor = 1.5;
                
            }
               
        }
        
        else if (choice.equals("D")){
            
            if (gender.equals("M")){
                
                activityFactor = 1.7;
                
            }
            
            if (gender.equals("F")){
                
                activityFactor = 1.6;
                
            }
            
        }
        
        else if (choice.equals("E")){
            
            if (gender.equals("M")){
                
                activityFactor = 2.1;
                
            }
            
            if (gender.equals("F")){
                
                activityFactor = 1.9;
                
            }
            
        }
        
        else if (choice.equals("F")){
            
            if (gender.equals("M")){
                
                activityFactor = 2.4;
                
            }
            
            if (gender.equals("F")){
                
                activityFactor = 2.2;
                
            }
        }
        
        else{
            
            System.out.println("Sorry thats not a menu option. We can't calculate your TDEE!");
        
        }
            
        // Calculate TDEE
        double tDEE = basalMR * activityFactor;

        // Output: Print Results
        System.out.println("Name: " + name + "\t\tGender: " + gender);
        System.out.println("BMR: " + basalMR + " calories "+ "\t\tActivity Factor: " + activityFactor);
        System.out.println("TDEE: " + tDEE + " calories ");

    }
}

