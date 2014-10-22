/**
 * A random password gen, with cool choices
 * 
 * @author David Johnson
 * @version 10/21/14
 */

//importing scanner class
import java.util.Scanner;

public class Passwords
{
    public static void main(String[] args)
    {
       
        //making all the required variables
        Scanner input = new Scanner(System.in);
        int selection = 0;
        int randNumberAlpha = 0;
        int randNumber = 0;
        int randPunct = 0;
        int length = 0;
        int charSelection = 0;
        int counter = 0;
        String lowerCase = "abcdefghijklmnopqrstuvwxyz";
        String upperCase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String number = "0123456789";
        String punctuation = "!?";
        String password = "";
        String temp = "";
        
        //printing out the visual menu
        System.out.println("            Password Generation Menu");
        System.out.println("********************************************************");
        System.out.println("*   [1] Lowercase Letters                              *");
        System.out.println("*   [2] Lowercase & Uppercase Letters                  *");
        System.out.println("*   [3] Lowercase, Uppercase, and Numbers              *");
        System.out.println("*   [4] Lowercase, Uppercase, Numbers, and Punctuation *");
        System.out.println("*   [5] Quit                                           *");
        System.out.println("********************************************************");
        
        //getting the users menu selection and password length
        System.out.print("Enter Selection (1-5): ");
        selection = input.nextInt();
        
        System.out.println();
        
        System.out.print("Enter Length (1-14): ");
        length = input.nextInt();
        
        //all the if else statements are set to there respected menu number
        if (selection == 1){
            
            //generating password by looping by length since you only need to worry about lowercase here
            for (int i = 0; i < length; i++){
                
                randNumberAlpha = 1 + (int)(Math.random() * 26); 
                temp = lowerCase.substring(randNumberAlpha - 1 , randNumberAlpha);
                
                password += temp;
                
            }
            
        }
        
        
        else if (selection == 2){
            
            //using a while loop instead because its easier here
            while (counter < length){
            
                //for (int i = 0; i < length; i++){
                    
                    charSelection = 1 + (int)(Math.random() * 10); 
                    
                    //made a formula for selecting lower and uper case letters
                    if (charSelection < 5){
                        
                        //adding letter to total password and counting one
                        randNumberAlpha = 1 + (int)(Math.random() * 26); 
                        temp = lowerCase.substring(randNumberAlpha - 1 , randNumberAlpha);
                        counter++;
                        password += temp;
                        
                    }
                    
                    else if (charSelection > 5 && charSelection < 10){
                        
                        randNumberAlpha = 1 + (int)(Math.random() * 26); 
                        temp = upperCase.substring(randNumberAlpha - 1 , randNumberAlpha);
                        counter++;
                        password += temp;
                        
                    }
                    
                //}
            
            }
            
        }
        
        else if (selection == 3){
            
            while (counter < length){
                
                //for (int i = 0; i < length; i++){
                     
                    //same idea here only with numbers
                    charSelection = 1 + (int)(Math.random() * 17);
                    randNumber = 1 + (int)(Math.random() * 9);
            
                    if (charSelection < 5){
                    
                        randNumberAlpha = 1 + (int)(Math.random() * 26); 
                        temp = lowerCase.substring(randNumberAlpha - 1 , randNumberAlpha);
                        counter++;
                        password += temp;
                    
                    }
                
                    else if (charSelection > 5 && charSelection < 10){
                    
                        randNumberAlpha = 1 + (int)(Math.random() * 26); 
                        temp = upperCase.substring(randNumberAlpha - 1 , randNumberAlpha);
                        counter++;
                        password += temp;
                    
                    }
                
                    else if (charSelection > 15 && charSelection < 17){
                    
                        randNumberAlpha = 1 + (int)(Math.random() * 26); 
                        temp = number.substring(randNumber - 1 , randNumber);
                        counter++;
                        password += temp;
                    
                    }
                    
                //}
        
            }
            
        }
        
        else if (selection == 4){
            
            while (counter < length){
                
                //for (int i = 1; i < 0; i++){
                    
                    //and with punctuation
                    charSelection = 1 + (int)(Math.random() * 20); 
                    randNumber = 1 + (int)(Math.random() * 9);
                    randPunct = 1 + (int)(Math.random() * 2);
                    
                    if (charSelection < 5){
                    
                        randNumberAlpha = 1 + (int)(Math.random() * 26); 
                        temp = lowerCase.substring(randNumberAlpha - 1 , randNumberAlpha);
                        counter++;
                        password += temp;
                    
                    }
                
                    else if (charSelection > 5 && charSelection < 10){
                    
                        randNumberAlpha = 1 + (int)(Math.random() * 26); 
                        temp = upperCase.substring(randNumberAlpha - 1 , randNumberAlpha);
                        counter++;
                        password += temp;
                    
                    }
                
                    else if (charSelection > 15 && charSelection < 17){
                    
                        randNumberAlpha = 1 + (int)(Math.random() * 26); 
                        temp = number.substring(randNumber - 1 , randNumber);
                        counter++;
                        password += temp;
                    
                    }
                
                    else if (charSelection > 17){
                    
                        randNumberAlpha = 1 + (int)(Math.random() * 26); 
                        temp = punctuation.substring(randPunct - 1 , randPunct);
                        counter++;
                        password += temp;
                        
                    }
                //} 
                
            }
            
        }
         
        else if(selection == 5){
            
            password = "You quit the generator!";
            
        }
        
        System.out.println();
        System.out.println("Password: " + password);
        
    }

}
