
/**
 * A progam used to average 4 grades
 * 
 * @author David Johnson
 * @version 9/23/14
 */
public class GradesV2
{
   public static void main(String[ ] args)
   {
       //local variables 
       int numTests  = 0;       //counts number of tests
       int testGrade = 0;       //individual test grade
       int totalPoints = 0;     //total points for all tests
       double average = 0.0;    //average grade
       
       //adds one grade to the list
       testGrade = 97;
       numTests++;
       
       totalPoints += testGrade;
       average = (double)totalPoints / numTests;
       System.out.println( "n = " + numTests + "    New Test Grade: " + testGrade + "   Total Points: " + totalPoints + "   Average Score: " + average );
   
       //adds one grade to the list
       testGrade = 79;
       numTests++;
       
       totalPoints += testGrade;
       average = (double)totalPoints / numTests;
       System.out.println( "n = " + numTests + "    New Test Grade: " + testGrade + "   Total Points: " + totalPoints + "   Average Score: " + average );
       
       //adds one grade to the list
       testGrade = 83;
       numTests++;
       
       totalPoints += testGrade;
       average = (double)totalPoints / numTests;
       System.out.println( "n = " + numTests + "    New Test Grade: " + testGrade + "   Total Points: " + totalPoints + "   Average Score: " + average );
       
       //adds one grade to the list
       testGrade = 88;
       numTests++;
       
       totalPoints += testGrade;
       average = (double)totalPoints / numTests;
       System.out.println( "n = " + numTests + "    New Test Grade: " + testGrade + "   Total Points: " + totalPoints + "   Average Score: " + average );
    }
}
