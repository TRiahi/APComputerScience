public class CO2Footprint
{
    
    double [] gas, electricity, waste, recycling, bulbs;
    
    CO2Footprint(double [] g, double [] e, double [] w, double [] r, double [] b){
        
        gas = g;
        electricity = e;
        waste = w;
        recycling = r;
        bulbs = b;
        
    }
    
    public double [] emissionReductionBulbs(){
       
       double [] total = {0,0};
       
       for (int i = 0; i < total.length; i++){
           
           total[i] = bulbs[i] * 1.37 * 73;
        
       }
        
       return total; 
        
    }
    
    public double [] emissionReduction(){
        
        double [] total = {0,0};
        
        for (int i = 0; i < gas.length; i++){
            
            total[i] = (gas[i] + electricity[i] + waste[i]) - (recycling[i] + bulbs[i]);
            
        }
        
        return total;
        
    }
    
}
