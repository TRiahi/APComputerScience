/**
 * Prompts user to select a category and tests the menu structure.
 * 
 * @author David Johnson
 * @version 10/7/14
 */
import java.util.Scanner;
public class WellnessMenu
{
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        
        System.out.println("Please select one of the following options from the menu for more information.");
        System.out.println("\nSelect a letter corresponding to a menu option.");
        System.out.println("[A] BMI");
        System.out.println("[B] BMR");
        System.out.println("[C] Healthy Eating");
        System.out.println("[D] Food Pyramid");
        System.out.println("[E] Fitness Training\n");
        System.out.print("Enter a selection: ");
        String choice = in.nextLine();
        // accept user choice with a Scanner class method
        System.out.println("");
        
        if(choice.equals("A")) //condition for choice A goes in the parentheses
        {
            // provide print statement to indicate menu item A was chosen
            System.out.println("Testing: You chose A for BMI");
        }
        else if(choice.equals("B")) //condition for choice B goes in the parentheses
        {
            // provide print statement to indicate menu item B was chosen
            System.out.println("Testing: You chose B for BMR");
        }
        else if (choice.equals("C")) //condition for choice C goes in the parentheses
        {
            // provide print statement to indicate menu item C was chosen
            System.out.println("Testing: You chose C for Healthy Eating");
        }
        else if (choice.equals("D")) //condition for choice D goes in the parentheses
        {
            // provide print statement to indicate menu item D was chosen
            System.out.println("Testing: You chose D for Food Pyramid");
        }
        else if (choice.equals("E")) //condition for choice E goes in the parentheses
        {
            // provide print statement to indicate menu item E was chosen
            System.out.println("Testing: You chose E for Fitness Training");
        }
        else //default choice for an invalid entry
        {
            // provide print statement to indicate invalid entry
            System.out.println("Not a valid entry!");
        }
    }
}
