
/**
 * Write a description of class TestCandidate here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TestCandidate
{
    public static void main(String[] args){
        
        String[][] election = new String[5][2];
        
        election[0][0] = "John Smith";
        election[0][1] = "5000";
        election[1][0] = "Mary Miller";
        election[1][1] = "4000";
        election[2][0] = "Michael Duffy";
        election[2][1] = "6000";
        election[3][0] = "Tim Robinson";
        election[3][1] = "2500";
        election[4][0] = "Joe Ashtony";
        election[4][1] = "1800";
            
        Candidate var = new Candidate("",0);
        
        System.out.println("Results per candidate");
        System.out.println("---------------------");
        System.out.println();
        
        var.printVotes(election);
        
        System.out.println();
        
        int voteTotal = var.getTotal(election);
        
        System.out.println();
        
        var.getPercent(election,voteTotal);
        
        System.out.println();
        
        System.out.println("Total votes: " + voteTotal);
        
    }
}
