
/**
 * Write a description of class Forest here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Forest
{
   
    int length, width;
    
    public Forest(int l, int w){
      
        length = l;
        width = w;
    
    }
    
     public int getForest(){
        
        int count = 0, totalForest1 = 0, totalForest2 = 0;
        
        for(int i = 0; i < length; i++){
        
            if (count == 5){
                
                totalForest1++;
                count = 0;
                
            }
            
            count++;
            
        }
        
        for(int i = 0; i < width; i++){
        
            if (count == 5){
                
                totalForest2++;
                count = 0;
                
            }
            
            count++;
            
        }
        
        totalForest1 = totalForest1 + totalForest2;
        
        return totalForest1;
    
    }
    
}
