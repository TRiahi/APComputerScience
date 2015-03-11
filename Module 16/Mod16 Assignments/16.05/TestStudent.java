/**
 * A test class to do calculations for the Student Class
 * 
 * @author David Johnson
 * @version 3/9/15
 */
import java.util.ArrayList;

public class TestStudent{
  
    public static void main(String[] args){
       
        ArrayList myClass = new ArrayList();
        
        myClass.add("Mark Kennedy");
        myClass.add("70");
        myClass.add("80");
        myClass.add("90");
        myClass.add("100");
        myClass.add("90");
        
        myClass.add("Max Gerard");
        myClass.add("80");
        myClass.add("85");
        myClass.add("90");
        myClass.add("85");
        myClass.add("80");
        
        myClass.add("Jean Smith");
        myClass.add("50");
        myClass.add("79");
        myClass.add("89");
        myClass.add("99");
        myClass.add("100");
        
        myClass.add("Betty Farm");
        myClass.add("85");
        myClass.add("80");
        myClass.add("85");
        myClass.add("88");
        myClass.add("89");
        
        myClass.add("Dilbert Gamma");
        myClass.add("70");
        myClass.add("70");
        myClass.add("90");
        myClass.add("70");
        myClass.add("80");
        
        printBook(myClass);
     
    }
    
    public static void printBook(ArrayList myClass){
        
        int alLength = myClass.size();
        int i2 = 0, iFirst = 5;
        System.out.printf("%10s%5s%5s%5s%5s%5s","Candidate","Q1","Q2","Q3","Q4","Q5","Q6");
        System.out.println();
        
        for (int i = 0; i < alLength; i++){
            
            System.out.printf("%5s",myClass.get(i));
            
            if (i2 == iFirst){
                
                System.out.println();
                
                iFirst = 6;
                i2 = 0;
                
            }
            
            i2++;
        }
        
    }
    
    public static void replaceName(int index, String name, ArrayList myClass){
        
        myClass.set(index,name);
        
    }
    
    public static void replaceQuiz(int index, int grade, ArrayList myClass){
        
        myClass.set(index,grade);
        
    }
    
    public static void replaceStudent(String name, int[] quizzes, int[] indexi, ArrayList myClass){
        
        int alLength = myClass.size();
        
        for (int i = 0; i < alLength; i++){
        }
        
    }
    
    public static void insertStudent(String name, int[] quizzes, ArrayList myClass){
    
    }
    
    public static void deleteStudent(int[] indexi,String name, int[] quizzes, ArrayList myClass){
    
    }
    
}
