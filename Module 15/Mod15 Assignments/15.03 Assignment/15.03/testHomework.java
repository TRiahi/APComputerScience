/**
 * A tester class to get the homework
 * 
 * @author David Johnson
 * @version 2/18/15
 */
public class testHomework
{
    
  public static void main(String []args){
  
      MyMath2 varM = new MyMath2();
      MyScience2 varS = new MyScience2();
      MyEnglish2 varE = new MyEnglish2();
        
      String math = varM.toString(10,"Math");
      String science = varS.toString(20,"Science");
      String english = varE.toString(30,"English");
      
      System.out.println("Before Reading:");
      System.out.println(math);
      System.out.println(science);
      System.out.println(english);
      
      System.out.println("");
      
      System.out.println("After Reading:");
      varM.doReading(10,"Math");
      varS.doReading(20,"Science");
      varE.doReading(30,"English");
      
  }
    
}
