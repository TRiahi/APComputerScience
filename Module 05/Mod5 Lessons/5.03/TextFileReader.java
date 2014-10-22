import java.util.Scanner;
import java.io.File;
import java.io.IOException;
public class TextFileReader
{
   public static void main(String[] args) throws IOException
   {
      String token = "";
      File fileName = new File("data3.txt");
      Scanner inFile = new Scanner(fileName);
      while (inFile.hasNext())
      {
         token = inFile.next( );
         System.out.println (token);
      }
      inFile.close();
    }//end of main method
}//end of class 