import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class MorseCode{
    
    String message = "";
    
    MorseCode(String m, String[] letters){
    
        message = m;
    
    }
    
    public String[] loadMorseCode(String[] letters)throws IOException{
        
        File morsecode = new File("../morsecodesource.txt");
        Scanner morsecodeds = new Scanner(morsecode);
      
        int i = 0;
        
        //load all the info into the array
        while (morsecodeds.hasNext()){
           
           // Used for testing System.out.println(morsecodeds.next());
           letters[i] += morsecodeds.next();
           
           i++;
           
        }
        
        //System.out.println("SYSTEM: Morse code loaded.");
        return letters;
        
    }
    
    public String convertEnglishToMorse(String message, String[] letters){
        
        int i = 0, messageLength = message.length();
        String messageLetters [] = new String[messageLength];
        
        while (i < messageLength){
            
            messageLetters[i] =  message.substring(i,i + 1);
            
            i++;
            
        }
        
        if (message.equals("")){
            
            //System.out.println("SYSTEM: Don't send empty phrases...");
            System.exit(1);
            
        }
        
        if (messageLetters[i - 1].length() > 0){
            
            //System.out.println("SYSTEM: Phrase Split");
            
        }else{
            
            System.out.println("SYSTEM: Something went wrong during the phrase split.");
            System.exit(1);
            
        }
        
        int f = 0;
        i = 0;
        String letterMorse = "", letterEnglish = "",phrase = "";
        
        while (i < messageLength){
        
            while (f < 36){
            
                letterMorse = letters[f].substring(4,5);
                letterEnglish = messageLetters[i];
                
                letterEnglish = letterEnglish.toUpperCase();
                
                if (letterMorse.equals(letterEnglish)){
                    
                    int morseLength = letters[f].length();
                    
                    phrase = phrase + " " + letters[f].substring(5,morseLength);
                    
                }
                
                f++;
                
            }
            
            i++;
            f = 0;
            
        }
        
        return phrase;
    
    }
    
}
