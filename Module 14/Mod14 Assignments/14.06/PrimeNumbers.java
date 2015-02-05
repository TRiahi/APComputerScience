import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrimeNumbers{
    
    private int highestRange = 0;
    
    PrimeNumbers(int high){
        
        highestRange = high;
        
    }
    
    public List<Integer> getPrimeNumbers(){
        
        List<Integer> primeNumbers = new ArrayList<>();
        
        for (int i = 2; i < highestRange; i++){
            
            boolean isPrimeNumber = true;
            
            for (int j = 2; j < i; j++) {
                
                if (i % j == 0) {
                   
                    isPrimeNumber = false;
                
                }
            
            }
            
            if (isPrimeNumber = true) {
            
                primeNumbers.add(i);
            
            }
            
        }
        
        return primeNumbers;
        
    }
    
}