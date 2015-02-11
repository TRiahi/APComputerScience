/**
 * Count the amount of letters 
 * 
 * @author David Johnson
 * @version 2/9/15
 */

//importing required libs
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter; 
import java.util.ArrayList;

public class FrequencyAnalysis{
     
    public static void main(String[] args)throws IOException{
        
        int i = 0, f = 0;
        String [] letters = {"A","B","C","D","E","F","G","H","I","J","K","L","N","M","O"
        ,"P","Q","R","S","T","U","V","W","X","Y","Z"};
        int [] lettersCount = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
        String message = "", letter="";
        
        File messageS = new File("plaintext.txt");
        Scanner in = new Scanner(System.in);
        Scanner messageSS = new Scanner(messageS);
        
        //load all the info into the array
        while (messageSS.hasNext()){
           
            message += messageSS.next();
           
        }
        
        while (i < message.length()){
            
            letter = message.substring(i, i + 1);
            
            while (f < 26){
                
                if (letter.toUpperCase().equals(letters[f])){
                   
                   lettersCount[f] += 1;
                
                }
                
                f++;
                
            }
            
            f = 0;
            i++;
            
        }
        
        for (int g = 0; g < 26; g++){
            
            System.out.println(letters[g] + ": " + lettersCount[g]);
            
        }
        
        //printing to file
        PrintWriter outFile = new PrintWriter (new File("plaintextfreq.txt")); 
        
        for (i = 0; i < 26; i++){
            
            outFile.println(lettersCount[i]);
            
        }
        
        outFile.close ();
        
       ArrayList < Integer > a = new ArrayList < Integer >();
ArrayList b = a;
a.add(new Integer(4));
b.add(new Integer(5));
a.add(new Integer(6));
a.add(new Integer(7));
System.out.println(a.size());;
         
    }
    
}
