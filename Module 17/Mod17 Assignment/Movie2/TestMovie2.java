/**
 * Write a description of class TestMovie2 here.
 * 
 * @author David Johnson
 * @version 3/12/15
 */
public class TestMovie2{
    
    public static void main(String[] args){
       
       int arraySize = 10;
       String[][] myMovies = new String[arraySize][3];
        
       myMovies[0][0] = "The Muppets Take Manhattan";
       myMovies[0][1] = "2001";
       myMovies[0][2] = "Columbia Tristar";
       
	   myMovies[1][0] = "Mulan Special Edition"; 
	   myMovies[1][1] = "2004"; 
	   myMovies[1][2] = "Disney";   
	   
	   myMovies[2][0] = "Shrek 2"; 
	   myMovies[2][1] = "2004"; 
	   myMovies[2][2] = "Dreamworks";   
	   
       myMovies[3][0] = "The Incredibles"; 
	   myMovies[3][1] = "2004"; 
	   myMovies[3][2] = "Pixar";
	   
	   myMovies[4][0] = "Nanny MacPhee"; 
	   myMovies[4][1] = "2006"; 
	   myMovies[4][2] = "Universal";
	   
	   myMovies[5][0] = "The Curse of the Were-Rabbit"; 
	   myMovies[5][1] = "2006"; 
	   myMovies[5][2] = "Aardman";
	   
	   myMovies[6][0] = "Ice Age"; 
	   myMovies[6][1] = "2002"; 
	   myMovies[6][2] = "20th Century Fox";
	   
	   myMovies[7][0] = "Lilo & Stitch"; 
	   myMovies[7][1] = "2002"; 
	   myMovies[7][2] = "Disney";
	   
	   myMovies[8][0] = "Robots"; 
	   myMovies[8][1] = "2005"; 
	   myMovies[8][2] = "20th Century Fox";
	   
	   myMovies[9][0] = "Monsters Inc."; 
	   myMovies[9][1] = "2001"; 
	   myMovies[9][2] = "Pixar";
	   
	   printMovies(myMovies, arraySize);
	   
    }
    
    public static void printMovies(String[][] myMovies, int arraySize){
        
        System.out.println();
        
        for (int i = 0; i < arraySize; i++){
            
            for (int f = 0; f < 3; f++){
                
                System.out.printf("%10s",myMovies[i][f]);
                
            }
            
            System.out.println();
            
        }
        
    }
    
}
