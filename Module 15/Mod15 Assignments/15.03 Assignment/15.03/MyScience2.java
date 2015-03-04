public class MyScience2 extends Homework2{
    
    public MyScience2(){
        
    }
    
    String typeHomeowrk = getHomework();
    
    public void createAssignment(int p){
        
        p = 20;
        typeHomework = "Science";
        
    }
    
     public void doReading(int p, String typeHomework){
        
        p = p - 1;
        System.out.println("Homework type was: " + typeHomework + " Pages Left: " + p);
        
    }
    
    public String toString(int p, String typeHomework){
        
        return "Homework type was: " + typeHomework + " Pages Read: " + p;
        
    }
    
}