/**
 * Program that encrypts and decrypts messages
 * 
 * @author David Johnson
 * @version 2/2/15
 */

import java.util.Scanner;

public class CaesarShiftTester{
    
    public static void main(String[] args){
        
        int stop = 0;
        Scanner in = new Scanner(System.in);
        
        System.out.println("=======================================");
        System.out.println("=   Basic Encryption and Decryption   =");
        System.out.println("=======================================");
        System.out.println("=                Menu                 =");
        System.out.println("=======================================");
        System.out.println("[1] Encrypt a message using Caesar Shift");
        System.out.println("[2] Decrypt a message using Caesar Shift");
        System.out.println("[3] Exit");
        System.out.println("=======================================");
            
        int menu = 0;
        
        while (stop != 1){
            
            if (menu == 0){
                
                menu = in.nextInt();
                
            }
            
            if (menu == 1){
                
                in.nextLine();
                System.out.println("Type the message you want to encrypt: ");
                String messageEncrypt = in.nextLine();
                CaesarShiftEncryption vars = new CaesarShiftEncryption(messageEncrypt);
                String encryptedMessage = vars.encrypt();
                System.out.println("Your message has been encrypted to -> " + encryptedMessage);
        
                System.out.println("======================================================");
                System.out.println("Type what you want to do next (type 4 to see the menu): ");
                menu = in.nextInt();
                
            }else if (menu == 2){
                
                String messageDecrypt = in.nextLine();
                
            }else if(menu == 3){
                
                stop = 1;
                
            }else if(menu == 4){
            
                System.out.println("=======================================");
                System.out.println("=                Menu                 =");
                System.out.println("=======================================");
                System.out.println("[1] Encrypt a message using Caesar Shift");
                System.out.println("[2] Decrypt a message using Caesar Shift");
                System.out.println("[3] Exit");
                System.out.println("=======================================");
                
                menu = 0;
                
            }
            
            if  (stop == 1){
            
                System.out.println("Quitting.......Done");
            
            }
            
        }
        
    }
   
}
