
/**
 * A program to simulate the population ratio
 * 
 * @author David Johnson
 * @version 10/14/14
 */
import java.util.Scanner;
public class PopulationRatio
{
    public static void main(String[] args)
	{
	    int men = 0;
	    int women = 0;
	    int counter = 1;
	    double randNumber = 0.0;
	    Scanner in = new Scanner(System.in);
	    
	    System.out.print("What is the population you would like to simulate? : ");
	    int flips = in.nextInt();
	    
	    System.out.println();
	    
	    while(counter <= flips)
	    {
	        randNumber = Math.random();
	        
	        System.out.print(counter + "\t" + randNumber);
	        
	        if(randNumber < .47)
	        {
	            
	            men++;
	            System.out.println("\t men");
	            
	        }
	        else
	        {
	            
	            women++;
	            System.out.println("\t women");
	            
	        }
	        
	        counter++;  
	        
	    }
	    
	    System.out.println();
	    System.out.println("Men= " + men);
	    System.out.println("Women= " + women);
	    
	    
	    
	}
}
