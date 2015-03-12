/**
 * Write a description of class Movie2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class Movie2{
    
   String title, studio;
   int year = 0;
   
   Movie2(String t, int y, String s){
       
       studio = s;
       title = t;
       year = y;
       
   }
   
   public String toString(String studio, String title, int year){
   
       return studio + " - " + title + " - " + year;
       
   }
    
}
