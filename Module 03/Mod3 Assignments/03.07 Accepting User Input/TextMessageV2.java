/**
 * A program the plays around with the java string class
 * 
 * @author David Johnson
 * @version 9/24/14
 */
import java.util.Scanner; //importing the scanner class
public class TextMessageV2
{
    public static void main(String[ ] args)
    {
        
        String message;
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter the phrase youd like to convert  ");
        message = in.nextLine();
        System.out.println();
        
        
        int messageLength = message.length();
        
        //printing out the message in required format
        System.out.println("Original Message:");
        System.out.println("    " + message);
        System.out.println("    Message Length: " + messageLength + " Characters");
        
        //replacing full words with slang
        message = message.replace("advanced placement", "ap");
        message = message.replace("computer science", "comp sci");
        message = message.replace("bait", "b8");
        message = message.replace("mate", "m8");
        message = message.replaceAll("great", "gr8");
        
        //finding new length
        messageLength = message.length();
        
        //printing out new message and length
        System.out.println();
        System.out.println("New Message:");
        System.out.println("    " + message);
        System.out.println("    Message Length: " + messageLength + " Characters");
        
        //starting next formatted section 
        System.out.println();
        System.out.println("String method samples: ");
        
        //finding inde of the char i and printing it out in correct format
        int iLocation = message.indexOf( "i" );
        System.out.println("    indexOf \"p\":                                    " + iLocation);
        
        //cutting out first third of shortned message and printing in required format
        String message1Third = message.substring(0,16);
        System.out.println("    substring (two parameters) first third:         " + message1Third);   
        
        //cutting out last third of shortned message and printing in required format
        String message3Third = message.substring(32,49);
        System.out.println("    substring (one parameter) last third:           " + message3Third);
        
        //this block is just replacing all chars with blanks and printing out in required format
        String messageReplace = message.replaceAll("v","");
        messageReplace = messageReplace.replaceAll("p", "");
        messageReplace = messageReplace.replaceAll("e", "");
        messageReplace = messageReplace.replaceAll("a", "");
        messageReplace = messageReplace.replaceAll("t", "");
        System.out.println("    replaceAll VPEAT's:                            " + messageReplace);
    }
}
