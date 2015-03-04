/**
 * A tester class to get the homework
 * 
 * @author David Johnson
 * @version 2/18/15
 */
public class testHomework
{
    
  public static void main(String []args){
  
      MyMath vars = new MyMath();
	    
	  String math = vars.toString(10,"Math");
	  String science = vars.toString(20,"Science");
	  String english = vars.toString(30,"English");
	  
	  System.out.println("Before Reading:");
	  System.out.println(math);
	  System.out.println(science);
	  System.out.println(english);
	  
	  System.out.println("");
      
	  
  }
    
}
