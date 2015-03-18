/**
 * A class for testing the items class.
 * 
 * @author David Johnson
 * @version 3/16/15
 */

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class TestItem{
    
    public static void main(String[] args){
    
       int arraySize = 6;
       String[][] hardware = new String[arraySize][4];
       
       hardware[0][0] = "1011";
       hardware[0][1] = "Air Filters";
       hardware[0][2] = "200";
       hardware[0][3] = "10.50";
       
       hardware[1][0] = "1034";
       hardware[1][1] = "Door Knobs";
       hardware[1][2] = "60";
       hardware[1][3] = "21.5";
       
       hardware[2][0] = "1101";
       hardware[2][1] = "Hammers";
       hardware[2][2] = "90";
       hardware[2][3] = "9.99";
       
       hardware[3][0] = "1600";
       hardware[3][1] = "Levels";
       hardware[3][2] = "80";
       hardware[3][3] = "19.99";
       
       hardware[4][0] = "1500";
       hardware[4][1] = "Ceiling Fans";
       hardware[4][2] = "100";
       hardware[4][3] = "59";
       
       hardware[5][0] = "1201";
       hardware[5][1] = "Wrench Sets";
       hardware[5][2] = "55";
       hardware[5][3] = "80";
       
       printInventory(hardware,arraySize);
       String sorted[] = sortID(hardware,arraySize,1);
       String sorted2[] = sortName(hardware,arraySize,1);
       String sorted3[] = sortInStore(hardware,arraySize,1);
       String sorted4[] = sortPrice(hardware,arraySize,1);
       
       System.out.println("Sorted ID's");
       
       for (int i = 0; i < arraySize; i++){
       
           System.out.println(sorted[i]);
           
       }
       
       System.out.println();
       System.out.println("Sorted names");
       
       for (int i = 0; i < arraySize; i++){
       
           System.out.println(sorted2[i]);
           
       }
       
       System.out.println();
       System.out.println("Sorted In store");
       
       for (int i = 0; i < arraySize; i++){
       
           System.out.println(sorted3[i]);
           
       }
       
       System.out.println();
       System.out.println("Sorted price");
       
       for (int i = 0; i < arraySize; i++){
       
           System.out.println(sorted4[i]);
           
       }
       
    }
    
    public static void printInventory(String[][] hardware, int arraySize){
        
        System.out.println("Orignal Array: ");
        System.out.printf("%s%11s%11s%7s","itemID","itemName","inStore","price");
        System.out.println();
        System.out.println("--------------------------------------");
        System.out.println();
        
        for (int i = 0; i < arraySize; i++){
            
            System.out.printf("%s%15s%8s%8s",hardware[i][0],hardware[i][1],hardware[i][2],hardware[i][3]);
            System.out.println();
        
        }
        
        System.out.println();
        
    }
    
    public static String[] sortID(String[][] hardware, int arraySize, int option){
        
        String[] hardwareSorted = new String[arraySize];
        
        for (int i = 0; i < arraySize; i++){
           
            hardwareSorted[i] = hardware[i][0];
                    
        }
        
        if (option == 1){
              
            Arrays.sort(hardwareSorted); 
            
        }else{
            
            Arrays.sort(hardwareSorted,  Collections.reverseOrder()); 
           
        }
        
        return hardwareSorted;
        
    }
    
    public static String[] sortName(String[][] hardware, int arraySize, int option){
        
        String[] hardwareSorted = new String[arraySize];
        
        for (int i = 0; i < arraySize; i++){
           
            hardwareSorted[i] = hardware[i][1];
                    
        }
        
        if (option == 1){
              
            Arrays.sort(hardwareSorted); 
            
        }else{
            
            Arrays.sort(hardwareSorted,  Collections.reverseOrder()); 
           
        }
        
        return hardwareSorted;
        
    }
    
    public static String[] sortInStore(String[][] hardware, int arraySize, int option){
        
        String[] hardwareSorted = new String[arraySize];
        
        for (int i = 0; i < arraySize; i++){
           
            hardwareSorted[i] = hardware[i][2];
                    
        }
        
        if (option == 1){
              
            Arrays.sort(hardwareSorted); 
            
        }else{
            
            Arrays.sort(hardwareSorted,  Collections.reverseOrder()); 
           
        }
        
        return hardwareSorted;
        
    }
    
    public static String[] sortPrice(String[][] hardware, int arraySize, int option){
        
        String[] hardwareSorted = new String[arraySize];
        
        for (int i = 0; i < arraySize; i++){
           
            hardwareSorted[i] = hardware[i][3];
                    
        }
        
        if (option == 1){
              
            Arrays.sort(hardwareSorted); 
            
        }else{
            
            Arrays.sort(hardwareSorted,  Collections.reverseOrder()); 
           
        }
        
        return hardwareSorted;
        
    }
    
}
