/**
 * Write a description of class MorseCodeTest here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

//importing required libs
import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class MorseCodeTest
{
   
    public static void main(String[] args)throws IOException{
    
        File morsecode = new File("../morsecodesource.txt");
        Scanner morsecodeds = new Scanner(morsecode);
        
        String letters [] = new String[35];
        int i = 0;
        
        //load all the info into the array
        while (morsecodeds.hasNext()){
           
           letters[i] += morsecodeds.next();
           
           i++;
           
        }
        
        System.out.printf("%s", letters);
    
    } 
    
}
