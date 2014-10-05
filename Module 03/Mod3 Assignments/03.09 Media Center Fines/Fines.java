/**
 * Fine system to fine the total fine and compile a message
 * 
 * @author David Johnson
 * @version 9/30/14
 */

//importing the scanner class
import java.util.Scanner; 

public class Fines
{
    public static void main(String[] args)
    { 
        //creating a new scanner
        Scanner in = new Scanner(System.in); 
        
        //printing out a statement for the user to input there name and ssn
        System.out.print("Enter name (Last, First) and Social Security Number (###-##-####): ");
        String basicInfo = in.nextLine();
        System.out.println();
        
        //enter the book title
        System.out.print("Enter the title of the book: ");
        String bookTitle = in.nextLine();
        System.out.println();
        
        //month day and year are entered in the format supplied
        System.out.print("Enter the date checked out (mm/dd/yyyy): ");
        String date = in.nextLine();
        System.out.println();
        
        //days late
        System.out.print("Days late: ");
        String daysLate = in.nextLine();
        System.out.println();
        
        //fine rate
        System.out.print("Daily Fine: ");
        String dailyFine = in.nextLine();
        System.out.println();
        
        //changing the string to a double for calculations
        double dDaysLate = Double.parseDouble(daysLate);
        double dDailyFine = Double.parseDouble(dailyFine);
        double fine = dDaysLate * dDailyFine;
        
        //getting the stopping point for substring later and then substring the raw input data
        int point1 = basicInfo.indexOf(",");
        String lastName = basicInfo.substring(0,point1);
        
        //finding the first name, basically finds the stopping point and the name is assigned to a var
        int nameLength = lastName.length();
        nameLength = nameLength + 1;
        String temp = basicInfo.substring(0,nameLength);
        temp = basicInfo.replace(lastName + ", ","");
        int point2 = temp.indexOf(" ");
        String firstName = temp.substring(0,point2);
        temp = temp.substring(0,point2);
        
        //getting the ssn 
        String ssn4 = basicInfo.replace(lastName + ", " + firstName + " ", "");
        ssn4 = ssn4.substring(7,11);
        temp = firstName.substring(0,3);
        
        //concatinating for the name and account var
        String name = lastName + ", " + firstName;
        String account = lastName + temp + "-" + ssn4;
        
        //concatinating the days late and daily fine
        System.out.println("Days late: " + daysLate);
        System.out.println("Days fine: " + dailyFine);
        
        //spacing 
        System.out.println();
        System.out.println();
        
        //printing out everything in format required
        System.out.print("To:   " + name);
        System.out.println("        Account: " + account);
        System.out.println("From: Mona");
        System.out.println("Subject: Overdue Notice");
        System.out.println("==================================================================");
        System.out.println(bookTitle + " was checked out on: " + date);
        System.out.println("The book is currently " + daysLate + " days late.");
        System.out.println("Your fine has accumulated to: " + fine);
    }
}
 