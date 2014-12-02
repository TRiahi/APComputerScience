public class CO2FootprintV1Tester{
    
    public static void main(String[ ] args){
        
        double gallonsOfGas = 1000;
        
        CO2FootprintV1 vars = new CO2FootprintV1(gallonsOfGas);
        
        double totalPounds = vars.poundsOfGas();
        double totalTons = vars.tonsOfGas();
        System.out.println("       CO2 Emissions       ");
        System.out.printf("%s%10s%10s\n","Gallons","Pounds","Tons");
        System.out.printf("%s%12s%12s\n","of Gas","from Gas","from Gas");
        System.out.println("=================================");
        System.out.printf("%1.2f%11.2f%10.2f",gallonsOfGas, totalPounds, totalTons);
        
    }
    
}