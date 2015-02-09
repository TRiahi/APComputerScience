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

public class FrequencyAnalysis{
     
    public static void main(String[] args)throws IOException{
        
        int A,B,C,D,E,F,G,H,I,J,K,L,M,N,O,P,Q,R,S,T,U,V,W,X,Y,Z, i = 0;
        String [] letters = {"A","B","C","D","E","F","G","H","I","J","K","L","N","M","O"
        ,"P","Q","R","S","T","U","V","W","X","Y","Z"};
        String message = "";
        
        File messageS = new File(".txt");
        Scanner in = new Scanner(System.in);
        Scanner messageSS = new Scanner(messageS);
        
        //load all the info into the array
        while (messageSS.hasNext()){
           
            message += messageSS.next();
           
        }
        
        while (i < message.length()){
            
            String letter = message.substr(i, i + 1);
            
            while (f < 26){
                
                if (letter.equals(letters[f])){
                
                   
                
                }
                
                f++;
                
            }
            
            i++;
            
        }
        
        System.out.println(message);
         
    }
    
}
