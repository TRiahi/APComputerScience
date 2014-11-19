/**
* Darts calc to calc pi
* 
* @author David Johnson 
* @version 11/12/14
*/

//importing libs
import java.util.Random;
import java.util.Scanner;

public class Darts{
    
    public static void main(String[] args){
        
        //getting amount of darts wanted
        Scanner in = new Scanner(System.in);
        System.out.print("How many Darts/Trial: ");
        
        //declaring all of the needed vars
        double darts = in.nextDouble();
        int seed = 3298758;
        double x = 0, y = 0, total = 0, hits = 0;
        Random generator = new Random(seed);
        double [] totalArray = new double[10];
        
        //for loop to do ten trials
        for (int i = 0; i < 10; i++){
            
            hits = 0;
            
            //amount of darts per trial loop
            for (int f = 0; f < darts; f++){
                
                //getting random cords
                x = 0 + (double)(generator.nextDouble() * 1);
                y = 0 + (double)(generator.nextDouble() * 1);
                
                //squaring
                x = Math.pow(x,2);
                y = Math.pow(x,2);
                
                //totaling
                total = x + y;
                
                //if the total is less then one there is a hit
                if (total < 1){
                    
                    hits += 1;
                    
                }
                
            }   
            
            //caclulating pi
            total = 4 * (hits/darts);
            
            //adding to array
            totalArray[i] += total;
            
            //printing out totals for trials
            System.out.printf("%s%d%s%1.2f\n","Trial [ ", i,"]: pi = ",total);
             
        }
        
        //reseting total
        total = 0;
        
        //adding all of the sperate totals to one big total
        for (int i = 0 ; i < totalArray.length ; i++){
            
            //total being added up
            total += totalArray[i];
            
        }
        
        //printing out last line
        System.out.println("Estimate of pi " + total / 10);
        
    }
    
}