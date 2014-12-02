/**
 * A program that calcs price per kw and bill along with co2 emissions
 * 
 * @author David Johnson 
 * @version 12/2/14
 */

import java.util.ArrayList;

public class CO2FromElectricityTester
{
   
    public static void main(String[ ] args){

        //declaring vars
        ArrayList<Double> monthlyBill = new ArrayList<Double>(3);
        ArrayList<Double> monthlyPrice = new ArrayList<Double>(3);
        
        CO2FromElectricity CO2 = new CO2FromElectricity(monthlyBill,monthlyPrice);
        
        //adding values to the list
        monthlyBill.add(209.60);
        monthlyBill.add(249.68);
        monthlyBill.add(222.59);

        monthlyPrice.add(209.70 / 2464);
        monthlyPrice.add(249.68 / 2948);
        monthlyPrice.add(222.59 / 2621);
        
        //running the methods
        double avgBill = CO2.calcAverageBill();
        double avgPrice = CO2.calcAveragePrice();
        double emissions = CO2.calcElectricityCO2(avgBill,avgPrice);
        
        //printing out into a friendly format
        System.out.printf("%s%5.2f\n","Average Monthly Electicity Bill: ",avgBill);
        System.out.printf("%s%5.2f\n","Average Monthly Electicity Price: ",avgPrice);
        System.out.printf("%s%5.2f\n","Annual CO2 Emissions from Electricity Usage: ",emissions);
        
    }
    
}
