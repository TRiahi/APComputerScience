public class Music{
    
    String title,singer;
    int year;
    
    Music(String t, String s, int y){
        
        title = t;
        singer = s;
        year = y;
        
    }
    
    public String toString(String title, String singer, int year){
        
        String all = title + " " + singer + " " + year;
        
        return all;
        
    }
    
}
