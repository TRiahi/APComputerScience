/**
 * Write a description of class Candidate here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Candidate{
    
    String name = "";
    int numVotes = 0;
    
    Candidate(String n, int nV){
        
        name = n;
        numVotes = nV;
        
    }
    
    public String toString(String name, int numVotes){
        
        return name + " got " + numVotes + " votes";
        
    }
    
    public void printVotes(String[][] election){
        
         for (int i = 0;i < 5; i++){
            
            System.out.println(election[i][0] + " has " + election[i][1] + " votes.");
        
        }
        
    }
    
    public int getTotal(String[][] election){
        
        int voteTotal = 0;
        
        for (int i = 0;i < 5; i++){
        
            voteTotal += Integer.parseInt(election[i][1]);
        
        }
        
        return voteTotal;
        
    }
    
    public void getPercent(String [][] election, int voteTotal){
        
        double [] percent = new double[5];
        int votes = 0;
        
        for (int i = 0;i < 5; i++){
            
            votes = Integer.parseInt(election[i][1]);
            percent[i] = (((double)votes / (double)voteTotal) * 100);
            
        }
        
        System.out.printf("%s%10s%5s","Candiate","Votes Received","% of Total Votes");
        System.out.println();
        
        for (int i = 0;i < 5; i++){
            
            System.out.println(election[i][0] + "   " + election[i][1] + "    " + percent[i]);
        
        }
        
    }
    
}
