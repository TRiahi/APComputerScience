public class MyEnglish extends Homework{
    
    public MyEnglish(){
        
    }
    
    String typeHomeowrk = getHomework();
    
    public void createAssignment(int p){
        
        p = 30;
        typeHomework = "English";
        
    }
    
    public String toString(int p, String typeHomework){
        
        return "Homework type was: " + typeHomework + " Pages Read: " + p;
        
    }
    
}
