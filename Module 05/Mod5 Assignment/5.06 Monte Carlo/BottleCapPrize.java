
/**
 * A program to see how many tries it takes on average to get a prize with 
 * a 1 to 5 chance
 * 
 * @author David Johnson
 * @version 10/21/14
 */

//importing scanner
import java.util.Scanner;
import java.io.IOException; 
import java.io.PrintWriter; 
import java.io.File; 

public class BottleCapPrize
{   
    
    public static void main(String[] args) throws IOException 
    {
        
       //creating variables needed
       int oneToFive = 0;
       int done = 0;
       int count = 0;
       int stopLoop = 0;
       double intTotalData = 0;
       String totalData = "";
       
       //got scanner set to input
       Scanner input = new Scanner(System.in);
       
       //asking user the amount of trials it would liket to attempt (1000 is required)
       System.out.print("Enter the amount of trials you would like to do: ");
       int trials = input.nextInt();
       
       //opening up file stream and creating test.txt
       PrintWriter outFile = new PrintWriter (new File("test.txt")); 
	
       //running for loop for as long as trials last
       for (int i = 1; i <= trials; i++) {
         
	   //while the user hasnt won yet, run loop
           while (done != 1){ 
             
	       //generating random number every loop 1-5
               oneToFive = 0 + (int)(Math.random() * 5); 
               
	       //counting trys
	       count++;
               
	       //if the user wins then print to file and reset vars
               if (oneToFive == 1){
                       
                   outFile.println(count); 
                   count = 0;
                   done = 1;
                       
                }
            
            }
            
	    //reset done out side while loop so we don't get stuck in it (might have done that :D )
            done = 0; 
            
       } 
       
       //closing the file after writing to it
       outFile.close ();
        
       //reading in all file data
       File data = new File("test.txt");
       //creating file scanner
       Scanner inFile = new Scanner(data);
            	
       //while ther is data in the inFile scanner parse to int and add to total data
       while (inFile.hasNext()){
    
           intTotalData += Integer.parseInt(inFile.next( ));
                 
       }
         
       //divide by trials and you should get something to close to 5 
       System.out.println(intTotalData / trials);
    
    }
    
}
