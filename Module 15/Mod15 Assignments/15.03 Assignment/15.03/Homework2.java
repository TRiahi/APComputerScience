public abstract class Homework2 implements Processing{
    
    int pagesRead;
    String typeHomework;
    
    public Homework2(){
       
        pagesRead = 0;
        typeHomework = "none";
        
    }
    
    public int getPagesRead(){
        
        return pagesRead;
        
    }
    
    public void setPagesRead(int p){
        
        pagesRead = p;
        
    }
    
    public String getHomework(){
        
        return typeHomework;
        
    }
    
    public void setHomework(String hw){
        
        typeHomework = hw;
        
    }

    public abstract void createAssignment(int p);
    
}
