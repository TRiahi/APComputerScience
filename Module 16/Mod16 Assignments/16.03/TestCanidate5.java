/**
 * Write a description of class TestCanidate5 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.util.ArrayList;

public class TestCanidate5
{
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
       
        insertPostion(5,14000,"Mickey Duck",voting);
        insertCandidate(100,"Donald Mouse",voting);
        
        printResults(voting);
        
    }
    
    public static void insertPostion(int index,int votes,String name,ArrayList voting){
        
        voting.add(index,votes);
        index = index + 1;
        
        voting.add(index,name);
        
    }
    
    public static void insertCandidate(int votes,String name,ArrayList voting){
        
        int alLength = voting.size();
        int index = 0;
        
        for (int i = 0; i < alLength; i++){
            
            voting.get(i).equals("Kathleen Turner");
            
            index = i;
             
        }
        
        index = index - 4;
        
        voting.add(index,votes);
        index = index + 1;
        
        voting.add(index,name);
        
    }
    
    public static void printResults(ArrayList voting){
        
        int alLength = voting.size();
        
        for (int i = 0; i < alLength; i++){
            
            System.out.println(voting.get(i));
            
        }
        
    }
}
