public class CO2FootprintV1{
    
    double gallonsOfGas;
    
    CO2FootprintV1(double g){
        
        gallonsOfGas = g;
        
    }
    
    public double poundsOfGas(){
        
        double temp1 = 0;
        
        temp1 = (8.78 * Math.pow(10, -3));
        temp1 = gallonsOfGas * temp1;
        temp1 = temp1 * 1.10231;
        temp1 = temp1 * 2000;
        
        return temp1;
        
    }
    
    public double tonsOfGas(){
        
        double temp1 = 0;
        
        temp1 = (8.78 * Math.pow(10, -3));
        temp1 = gallonsOfGas * temp1;
        temp1 = temp1 * 1.10231;
        
        return temp1;
        
    }
    
}

