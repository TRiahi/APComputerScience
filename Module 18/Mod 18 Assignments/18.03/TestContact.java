/**
 * Write a description of class TestContact here.
 * 
 * @author David Johnson 
 * @version 3/24/15
 */
public class TestContact{
    
    public static void main(String args[]){
        
        int arraySize = 6;
        String[][] myContacts = new String[arraySize][5];
        
        myContacts[0][0] = "John Carter";
        myContacts[0][1] = "brother";
        myContacts[0][2] = "Mar 3";
        myContacts[0][3] = "(342)555-7069";
        myContacts[0][4] = "jcarter@carter.com";
        
        myContacts[1][0] = "Elise Carter";
        myContacts[1][1] = "mom";
        myContacts[1][2] = "Apr 9";
        myContacts[1][3] = "(342)555-7011";
        myContacts[1][4] = "carterMom@carter.com";
        
        myContacts[2][0] = "Ellie Carter";
        myContacts[2][1] = "me";
        myContacts[2][2] = "Jun 10";
        myContacts[2][3] = "(342)555-8102";
        myContacts[2][4] = "ecarter@carter.com";
        
        myContacts[3][0] = "Sue Ellen";
        myContacts[3][1] = "friend";
        myContacts[3][2] = "Mar 9";
        myContacts[3][3] = "(342)555-9182";
        myContacts[3][4] = "susieE@hotmail.com";
        
        myContacts[4][0] = "Frank Carter";
        myContacts[4][1] = "dad";
        myContacts[4][2] = "Dec 1";
        myContacts[4][3] = "(342)555-7011";
        myContacts[4][4] = "carterDad@carter.com";
        
        myContacts[5][0] = "Johnnie";
        myContacts[5][1] = "friend";
        myContacts[5][2] = "Jan 21";
        myContacts[5][3] = "(342)555-7789";
        myContacts[5][4] = "jDawg5555@carter.com";
        
        printContacts(myContacts, arraySize);
        
    }
    
    public static void printContacts(String[][] myContacts, int arraySize){
    
        for (int i = 0; i < arraySize; i++){
            
            for (int f = 0; f < 5; f++){
            
                System.out.println(myContacts[i][f]);
            
            }
            
            System.out.println();
        }
    
    }
    
}
