/**
 * Write a description of class Cube here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cube
{
    
    int length = 0, width = 0, height = 0;
    
    public Cube(int len, int wid, int hei){
        
        length = len;
        width = wid;
        height = hei;
        
    }
    
    public int cubeCheck(){
        
        if (length == width){
            
            if (width == height){
                
                if (length == height){
                    
                    return 1;
                    
                }else{
                
                    return 0;
                
                }
                
            }else{
            
                return 0;
            
            }
            
        }else{
            
            return 0;
            
        }
        
    }
    
    public int getHeight(){
    
        return height;
    
    }
    
    public int getWidth(){
    
        return width;
    
    }
    
    public int getLength(){
    
        return length;
        
    }
    
}
