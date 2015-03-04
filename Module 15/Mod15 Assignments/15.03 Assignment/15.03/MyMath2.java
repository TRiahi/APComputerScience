public class MyMath2 extends Homework2{
       
    public MyMath2(){
        
    }
    
    String typeHomeowrk = getHomework();
    
    public void createAssignment(int p){
        
        p = 10;
        typeHomework = "Math";
        
    }
    
    public void doReading(int p, String typeHomework){
        
        p = p - 3;
        System.out.println("Homework type was: " + typeHomework + " Pages Left: " + p);
        
    }
    
    public String toString(int p, String typeHomework){
        
        return "Homework type was: " + typeHomework + " Pages Read: " + p;
        
    }
    
}
