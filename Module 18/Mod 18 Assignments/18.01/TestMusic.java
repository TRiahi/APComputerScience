/**
 * Tester class for music
 * 
 * @author David Johnson 
 * @version 3/19/15
 */

import java.util.ArrayList;

public class TestMusic{
    
    public static void main(String[] args){
        
        int arraySize = 3,f = 0,i = 0;
        String[][] myMusic = new String[arraySize][3];
        ArrayList<Integer> results = new ArrayList<Integer>();
        
        myMusic[0][0] = "Pieces of You";
        myMusic[0][1] = "1994";
        myMusic[0][2] = "Jewel";
        
        myMusic[1][0] = "Jagged Little Pill";
        myMusic[1][1] = "1995";
        myMusic[1][2] = "Alanis Morissette";
        
        myMusic[2][0] = "What if its you";
        myMusic[2][1] = "1995";
        myMusic[2][2] = "Reba McEntire";
        
        //add the rest before turning in
        
        printMusic(myMusic,arraySize);
        results = searchTitle(myMusic,arraySize,"Jagged Little Pill");
        
        int alLength = results.size();
        
        while (i < alLength){
            
            while (f < 3){
                
                System.out.println(myMusic[results.get(i)][f]);
                
                f++;
                
            }
            
            f = 0;
            i++;
            
        }
        
        results = searchYear(myMusic,arraySize,"2001");
        
        alLength = results.size();
        
        while (i < alLength){
            
            while (f < 3){
                
                System.out.println(myMusic[results.get(i)][f]);
                
                f++;
                
            }
            
            f = 0;
            i++;
            
        }
        
        results = searchSinger(myMusic,arraySize,"Dido");
        
        alLength = results.size();
        
        while (i < alLength){
            
            while (f < 3){
                
                System.out.println(myMusic[results.get(i)][f]);
                
                f++;
                
            }
            
            f = 0;
            i++;
            
        }
        
    }
    
    public static void printMusic(String[][] myMusic, int arraySize){
    
        System.out.println("Orignal Array: ");
        System.out.println();
        
        for (int i = 0; i < arraySize; i++){
            
            System.out.printf("%s%11s%15s",myMusic[i][0],myMusic[i][1],myMusic[i][2]);
            System.out.println();
        
        }
        
        System.out.println();
        
    
    }
    
    public static ArrayList<Integer> searchTitle(String[][] myMusic, int arraySize, String search){
        
        String value;
        int found = 0;
        ArrayList<Integer> results = new ArrayList<Integer>();
        
        for(int i = 0; i < arraySize; i++){
        
           if (myMusic[i][0].compareTo(search) == 0){
               
               value = myMusic[i][0];
               found = 1;
                   
           }
         
           if (found == 1){  
               
               results.add(i);
               found = 0;
           
           }
           
        }
        
        return results;
        
    }
    
    public static ArrayList<Integer> searchYear(String[][] myMusic, int arraySize, String search){
        
        String value;
        int found = 0;
        ArrayList<Integer> results = new ArrayList<Integer>();
        
        for(int i = 0; i < arraySize; i++){
        
           if (myMusic[i][1].compareTo(search) == 0){
               
               value = myMusic[i][1];
               found = 1;
                   
           }
         
           if (found == 1){  
               
               results.add(i);
               found = 0;
           
           }
           
        }
        
        return results;
        
    }
    
    public static ArrayList<Integer> searchSinger(String[][] myMusic, int arraySize, String search){
        
        String value;
        int found = 0;
        ArrayList<Integer> results = new ArrayList<Integer>();
        
        for(int i = 0; i < arraySize; i++){
        
           if (myMusic[i][2].compareTo(search) == 0){
               
               value = myMusic[i][2];
               found = 1;
                   
           }
         
           if (found == 1){  
               
               results.add(i);
               found = 0;
           
           }
           
        }
        
        return results;
        
    }
    
}
