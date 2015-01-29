/**
 * Morse code translator
 * 
 * @author David Johnson
 * @version 11/27/15
 */

//importing required libs
import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class MorseCodeTest
{
   
    public static void main(String[] args)throws IOException{
        
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter the text you'd like to convert to morse code: ");
        String message = in.nextLine();
        String letters [] = new String[36];
        
        MorseCode vars = new MorseCode(message,letters);
        
        letters = vars.loadMorseCode(letters);
          
        if (letters[35].length() > 0){
            
            //System.out.println("SYSTEM: Confirmed");
            
        }else{
            
            System.out.println("SYSTEM: Error system may not work because files are missing.");
            System.exit(1);
            
        }
        
        String convertedMessage = vars.convertEnglishToMorse(message,letters);
        
        System.out.println("========================================");
        System.out.println("Your original message: " + message);
        System.out.println("Translated message: " + convertedMessage);
    
    } 
    
}
