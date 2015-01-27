/**
 * testNow is a class to test the other two classes, cube3 is missing?
 * 
 * @author David Johnson
 * @version 1/27/15
 */
public class testNew
{
    
    public static void main(String[] args){
    
        Box3 varB = new Box3(4,4,4);
        Box3 varB2 = new Box3(7,10,4);
        Rectangle3 varR = new Rectangle3(5,5);
        
        String varBResponse = varB.toString();
        String varB2Response = varB2.toString();
        String varRResponse = varR.toString();
        
        int yesno = 0;
        
        int heightB = varB.getHeight();
        int widthB = varB.getWidth();
        int lengthB = varB.getLength();
        
        int heightB2 = varB2.getHeight();
        int widthB2 = varB2.getWidth();
        int lengthB2 = varB2.getLength();
        
        if (heightB == heightB2){
            
            yesno = 1;
            
            if (widthB == widthB2){
                
                yesno = 1;
                
                if (lengthB == lengthB2){
        
                    yesno = 1;
                    
                }else{
                
                    yesno = 0;
                
                }
                
            }else{
            
                yesno = 0;
            
            }
        
        }else{
        
            yesno = 0;
        
        }
        
        System.out.println(varBResponse);
        System.out.println(varB2Response);
        System.out.println(varRResponse);
        
        if (yesno == 1){
        
            System.out.println("The two boxes are equal");
        
        }else{
        
            System.out.println("The two boxes are not equal");
            
        }
        
    }
    
}
