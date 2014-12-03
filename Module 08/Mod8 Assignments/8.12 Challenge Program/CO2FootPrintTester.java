
/**
 * Write a description of class CO2FootPrintTester here.
 * 
 * @author David Johnson 
 * @version 12/3/14
 */
public class CO2FootPrintTester
{
   
    public static void main(String[ ] args){
        
        double [] gas = {48000,38400};
        double [] electricity = {16440,16111};
        double [] waste = {1018,3054};
        
        System.out.println("|              Pounds of CO2              |       Pounds of CO2       |                      |");
        System.out.println("|              Emmitted from              |        Reduce from        |                      |");
        System.out.println("|    Gas     |  Electricity  |    Waste   |   Recycling  |  New Bulbs |    CO2 Footprint     |");
        System.out.println("|============|===============|============|==============|============|======================|");
        
        for (int i = 0; i < 2; i++){
            
            System.out.printf("%s%10.2f%3s%12.2f%4s\n","|",gas[i],"|",electricity[i],"|");
        
        }
        
    }
    
}
