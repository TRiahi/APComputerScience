public class MyMath extends Homework{
       
    public MyMath(){
        
    }
    
    String typeHomeowrk = getHomework();
    
    public void createAssignment(int p){
        
        p = 10;
        typeHomework = "Math";
        
    }
    
    public String toString(int p, String typeHomework){
        
        return "Homework type was: " + typeHomework + " Pages Read: " + p;
        
    }
    
}
