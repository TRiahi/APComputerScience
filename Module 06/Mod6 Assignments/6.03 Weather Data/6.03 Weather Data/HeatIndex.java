/**
 * Formats tempature and humidity, then calcs heat index
 *
 * @author: David Johnson
 * @version: 10/28/14
 *
 */

//importing libs
import java.util.Scanner;
import java.io.File;
import java.io.IOException; 
import java.io.PrintWriter; 

public class HeatIndex
{
    public static void main(String[] args) throws IOException
    {
        
        //declaring variables
        String location = "Key West";
        File fileNameTemp = new File("KeyWestTemp.txt");
        File fileNameHumid = new File("KeyWestHumid.txt");

        Scanner inFileTemp = new Scanner(fileNameTemp);
        Scanner inFileHumid = new Scanner(fileNameHumid);

        String [] month = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "Novermber", "December"};
        int length = month.length;
        double [] temperature = new double[length];
        double [] humidity = new double[length];
        double [] hI = new double[length];
        double t = 0.0;
        double h = 0;
        double tempSum = 0.0;
        double humidSum = 0.0;
        double hISum = 0.0;
        int n = 0;
        
        //adding all the data into arrays
        while(inFileTemp.hasNextDouble()){
            
            temperature[n] = inFileTemp.nextDouble( );
            n++;
        
        }
        
        inFileTemp.close();
        
        n = 0;
        
        while (inFileHumid.hasNextDouble()){
                
            humidity[n] = inFileHumid.nextInt( );   
            n++;
            
        }
        
        inFileHumid.close();
        
        n = 0;
        
        //calculating formula and then if its not above 80 just add it
        for(n = 0; n < hI.length; n++)
        {
            
            if( temperature[n] >= 80.0  )
            {
                
                t = temperature[n];
                h = humidity[n];
                
                double temp =(-42.379)+(2.04901523*t)+10.14333127*h+         
                -0.22475541*t*h+-0.00683783*t*t+-0.05481717*h*h+                                      
                0.00122874*t*t*h+0.00085282*t*h*h+-0.00000199*t*t*h*h;  
                
                hI[n] = temp;  
                hISum += temp;
                
            }
            else 
            {
                
                hI[n] = temperature[n];
                hISum += temperature[n];
                
            }
            
        }
        
        //calcualting averages
        hISum = hISum / hI.length;
        
        for(n = 0; n < temperature.length; n++){
            
            tempSum += temperature[n];
            
        }
        
        tempSum = tempSum / temperature.length;
        
        for(n = 0; n < humidity.length; n++){
            
            humidSum += humidity[n];
            
        }
        
        humidSum = humidSum / humidity.length;
        
        //print out the data in the nice format
        System.out.printf("%55s%1s\n\n", "Heat Index: " , location);
        
        
        System.out.printf("%s" , "Months ");
        System.out.print("    ");
        for(String m : month)
        {
            System.out.printf("   %4.3s", m);
        }


        System.out.println("  Avg");
        System.out.println("******************************************************************************************");
        
        System.out.print("Temp (F)   ");
        for (int i = 0; i < temperature.length; i++){
            
            System.out.printf("%7.1f" , temperature[i]);
        
        }
        
        System.out.printf("%6.1f" , tempSum);
        
        System.out.print("\nHumidity(%)");  
        for (int i = 0; i < humidity.length; i++){
            
            System.out.printf("%7.1f" , humidity[i]);
            
        }
        
        System.out.printf("%6.1f" , humidSum);
        
        System.out.print("\nHI (F)     ");
        for (int i = 0; i < hI.length; i++){
            
            System.out.printf("%7.1f" , hI[i]);
            
        }
        
        System.out.printf("%6.1f" , hISum);
        
        //printing to file
        PrintWriter outFile = new PrintWriter (new File("test.txt")); 
        
        for (int i = 0; i < hI.length; i++){
            
            outFile.println(hI[i]);
            
        }
        
        outFile.close ();
        
    } //end main()
}//end HeatIndex
