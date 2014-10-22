/**
 * Sorts the gender combos in a file
 * BB,GG,BG,GB
 * @author David Johnson
 * @version 10/20/14
 */

import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class Family
{
    
    public static void main(String[] args) throws IOException
    {
        
        int sampleSize = 0;
        int twoBoys = 0;
        int twoGirls = 0;
        int boyGirl = 0;
        double twoBoysPercent = 0;
        double twoGirlsPercent = 0;
        double boyGirlPercent = 0;
        String genderCombo = "";
        File maleFemale = new File("MaleFemaleInFamily.txt");
        Scanner inFile = new Scanner(maleFemale);
        
        while (inFile.hasNext()){
            
            genderCombo = inFile.next( );
            
            if (genderCombo.equals("GB") || genderCombo.equals("BG")){
            
                boyGirl++;
                
            }
            
            else if (genderCombo.equals("BB")){
                
                twoBoys++;
                
            }
            
            else if(genderCombo.equals("GG")){
                
                twoGirls++;
                
            }
            
            sampleSize++;
            
        }
        
        twoBoysPercent = (double)twoBoys / (double)sampleSize * 100;
        twoGirlsPercent = (double)twoGirls / (double)sampleSize * 100;
        boyGirlPercent = (double)boyGirl / (double)sampleSize * 100;
        
        System.out.println("Sample Size: " + sampleSize);
        System.out.println("Two Boys: " + (int)twoBoysPercent);
        System.out.println("One boy One Girl: " + (int)boyGirlPercent);
        System.out.println("Two Girls: " + (int)twoGirlsPercent);
        
    }
    
}
        