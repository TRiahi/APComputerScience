
import java.util.ArrayList;

public class TestCandidate{

    public static void main(String[] args){
        
        ArrayList voting = new ArrayList();
        
        voting.add("John Smith"); //0
        voting.add(5000); //1
        voting.add("Mary Miller");  //2
        voting.add(4000); //3
        voting.add("Michael Duffy"); //4
        voting.add(6000); //5
        voting.add("Tim Robinson");  //6
        voting.add(2500); //7
        voting.add("Joe Ashtony"); //8
        voting.add(1800); //9
        voting.add("Micky Jones"); //10
        voting.add(3000); //11
        voting.add("Rebecca Morgan"); //12
        voting.add(2000); //13
        voting.add("Kathleen Turner"); //14
        voting.add(8000); //15
        voting.add("Tory Parket"); //16
        voting.add(500); //17
        voting.add("Ashton Davis"); //18
        voting.add(10000); //19
       
        replaceName(4,"John Elmos",voting);
        replaceVotes(11,2500,voting);
        replaceCandidate(14,15,8500,"John Kennedy",voting);
        
        printResults(voting);
        
    }
    
    public static void replaceName(int index,String name,ArrayList voting){
       
        voting.set(index,name);
        
    }
    
    public static void replaceVotes(int index,int votes,ArrayList voting){
        
        voting.set(index,votes);
        
    }
    
    public static void replaceCandidate(int index1,int index2,int votes,String name,ArrayList voting){
        
        voting.set(index1,name);
        voting.set(index2,votes);
        
    }
    
    public static void printResults(ArrayList voting){
        
        int alLength = voting.size();
        
        for (int i = 0; i < alLength; i++){
            
            System.out.println(voting.get(i));
            
        }
        
    }
}
