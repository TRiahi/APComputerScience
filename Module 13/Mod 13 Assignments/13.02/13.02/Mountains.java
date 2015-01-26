/**
 * Mountain terrian
 * 
 * @author David Johnson
 * @version 1/23/15
 */
public class Mountains{
    
    int length, width;
    
    public Mountains(int l, int w){
      
        length = l;
        width = w;
    
    }
    
    public int getMountains(){
        
        int count = 0, totalMountains1 = 0, totalMountains2 = 0;
        
        for(int i = 0; i < length; i++){
        
            if (count == 10){
                
                totalMountains1++;
                count = 0;
                
            }
            
            count++;
            
        }
        
        for(int i = 0; i < width; i++){
        
            if (count == 10){
                
                totalMountains2++;
                count = 0;
                
            }
            
            count++;
            
        }
        
        totalMountains1 = totalMountains1 + totalMountains2;
        
        return totalMountains1;
    
    }

}
