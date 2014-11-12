
/**
 * A program that uses the pythagorean theorem to find x and y cords.
 * 
 * @author David Johnson
 * @version 11/10/14
 */
public class PointsOnACircleV1{

    public static void main(String[ ] args){
        
	//creating vars
        double radiusNegative = 1.0, xCordNegative = 1, yCordNegative= 0;
        double radiusPositive = 1.0, xCordPositive = 1, yCordPositive = 0, temp = 0;
        
	//printing out basic structures
        System.out.println("      Points on a Circle of Radius 1.0");
        System.out.printf("%2s%11s%15s%9s\n", "x1", "y1", "x1", "y2");
        System.out.println("------------------------------------------");
        
	//for loop to print all the statements out nicely and easily
        for (int i = 0; i < 21; i++){
            
	    //calculating the cord
            temp = Math.pow(xCordPositive, 2);
            yCordPositive = radiusPositive - temp;
            yCordPositive = Math.sqrt(yCordPositive);
            
            //reseting the temp
            temp = 0;
           
            temp = Math.pow(xCordNegative, 2);
            yCordNegative = radiusNegative - temp;
            yCordNegative = Math.sqrt(yCordNegative);
            
	    //one big print statement
            System.out.printf("%1.2f%10.2f%15.2f%6s%1.2f\n", xCordPositive , yCordPositive , xCordNegative , "-" , yCordNegative);
            
	    //setting the cords to the correct value for the next loop
            xCordPositive = xCordPositive - 0.1;
            xCordNegative = xCordNegative - 0.1;
            
        }
        
    }
    
}
