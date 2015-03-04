public class MyEnglish2 extends Homework2{
    
    public MyEnglish2(){
        
    }
    
    String typeHomeowrk = getHomework();
    
    public void createAssignment(int p){
        
        p = 30;
        typeHomework = "English";
        
    }
    
     public void doReading(int p, String typeHomework){
        
        p = p - 4;
        System.out.println("Homework type was: " + typeHomework + " Pages Left: " + p);
        
    }
    
    public String toString(int p, String typeHomework){
        
        return "Homework type was: " + typeHomework + " Pages Read: " + p;
        
    }
    
}