public class MyScience extends Homework{
    
    public MyScience(){
        
    }
    
    String typeHomeowrk = getHomework();
    
    public void createAssignment(int p){
        
        p = 20;
        typeHomework = "Science";
        
    }
    
    public String toString(int p, String typeHomework){
        
        return "Homework type was: " + typeHomework + " Pages Read: " + p;
        
    }
    
}