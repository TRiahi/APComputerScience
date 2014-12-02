
/**
 * A program that calculates mpg and distance
 * 
 * @author David Johnson
 * @version 11/18/14
 */
public class CarV5{
    
   //starting vars
   double milesStart, milesEnd, gallons, MPG, distance, price, total;
   
   CarV5(double ms, double me, double g, double mpg, double dis, double pri, double tot){
       
       milesStart = ms;
       milesEnd = me;
       gallons = g;
       MPG = mpg;
       distance = dis;
       price = pri;
       total = tot;
       
   }
   
   //calculating the distance
   public double distance(){
   
       total = milesEnd - milesStart;
       
       return total;
   
   }
    
   //calculating the mpg
   public double mpgcalc(){
   
       total = milesEnd - milesStart;
       total = total / gallons;
       
       return total;
       
   }
   
   //calculating the gpm
   public double gpmcalc(){
   
       total = milesEnd - milesStart;
       total = gallons / total;
       
       return total;
       
   }
   
   //calculating cost
   public double cost(){
   
       total = gallons * price;
       
       return total;
       
   }
    
   public static void main(String[ ] args){
       
       double milesStart = 100, milesEnd = 120, gallons = 15, MPG = 0, distance = 0, price = 3.54, total = 0, GPM = 0, cost = 0;
       String type = "09 Scion XB";
       
       CarV5 vars = new CarV5(milesStart, milesEnd, gallons, MPG, distance, price, total);
       
       //running the methods
       MPG = vars.mpgcalc();
       GPM = vars.gpmcalc();
       distance = vars.distance();
       cost = vars.cost();
       
       //printing out into friendly format
       System.out.println("                                         Gas Mileage Calculations");
       System.out.println();
       System.out.printf("%13s%15s%15s%15s%15s%15s%15s%15s%15s\n", "Type of Car" , "Start Miles" , "End Miles" , "Distance" , "Gallons", "Price", "Cost", "Mile/Gal", "Gal/Mile");
       System.out.println("======================================================================================================================================");
       System.out.printf("%13s%11.2f%16.2f%17.2f%15.2f%15.2f%17.2f%14.2f%14.2f", type , milesStart , milesEnd , distance , gallons, price, cost, MPG, GPM);
       
   }
    
}
