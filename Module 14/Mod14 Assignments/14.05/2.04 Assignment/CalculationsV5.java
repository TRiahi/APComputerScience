/**
 * The Calculations class performs addition, subtraction,
 * multiplication, division, and modulus operations on integers and
 * decimals.
 * 
 * �FLVS 2007
 * @author Bill Jordan; A.Ross
 * @version 01/19/07; 06/24/12
 */

class Calculations{
    
    private int iAdditionNum1 = 25;
    
    Calculations(int iAdd){
    
        iAdditionNum1 = iAdd;
        
    }
    
    public int getiAdd(){
        
        return iAdditionNum1;
        
    }

}

public class CalculationsV5
{
    public static void main(String[ ] args)
    {
        // Addition
        Calculations var = new Calculations(25);
        int iAdditionNum1 = var.getiAdd();
        
        int iAdditionNum2 = 9;
        
        double dAdditionNum1 = 43.21;
        double dAdditionNum2 = 3.14;
        
        System.out.println( "Addition" );
        System.out.print( iAdditionNum1 + " plus " + iAdditionNum2 + " equals " );
        System.out.println( iAdditionNum1 + iAdditionNum2 );
        System.out.print( dAdditionNum1 + " plus " + dAdditionNum2 + " equals " );
        System.out.println( dAdditionNum1 + dAdditionNum2 );
        System.out.println();
        
        // Subtraction
        int iSubtractionNum1 = 16;
        int iSubtractionNum2 = 9;
        int iSubtractionNum3 = 25;
        
        double dSubtractionNum1 = 3.14;
        double dSubtractionNum2 = 5.0;
        
        System.out.println( "Subtraction" );
        System.out.print( iSubtractionNum1 + " minus " + iSubtractionNum2 + " minus " +  iSubtractionNum3 + " equals ");
        System.out.println( iSubtractionNum1 - iSubtractionNum2 - iSubtractionNum3 );
        //STOPPED HERE FOR TODAY ON 2.04 ASSIGNMENT
        System.out.print( dSubtractionNum1 + dSubtractionNum2 );
        System.out.println( 3.14 - 5.0 );
        System.out.println();
        
        // Multiplication
        
        int iMultiplicationNum1 =  25;
        int iMultiplicationNum2 = 9;
        
        System.out.println( "Multiplication" );
        System.out.print( iMultiplicationNum1 + " times " +  iMultiplicationNum2 + " equals "); 
        System.out.println( iMultiplicationNum1 * iMultiplicationNum2 );
        System.out.println( 3.14 * 5.0 * 5.0 );
        System.out.println();
        
        // Division
        int iDivisionNum1 = 9;
        int iDivisionNum2 = 25;
        
        System.out.println( "Division" );
        System.out.print( iDivisionNum1 + " divided by " + iDivisionNum2 + " equals ");
        System.out.println( iDivisionNum1 / iDivisionNum2);
        System.out.println( 43.21 / 5.0 );
        System.out.println();
         
        // Modulus operator
        int iModulusNum1 = 16;
        int iModulusNum2 = 9;
        
        System.out.println( "Modulus" );
        System.out.print( iModulusNum1 + " modulus " +  iModulusNum2 + " equals " );
        System.out.println( iModulusNum1 % iModulusNum2 );
        System.out.println( 5.0 % 3.14 );
        System.out.println();
        
        // 2.02 Lab Equations
        System.out.println( "2.02 Lab Equations" );
        // 15 divided by 2.5 times -2 plus 10 / 5
        System.out.println( "15 divided by 2.5 times -2 plus 10 / 5: " + ( 15 / 2.5 * -2 + 10 / 5 ) );
        // 234 minus (234 divided by 6 modulus 12) + 3
        System.out.println( "234 minus (234 divided by 6 modulus 12) + 3: " + ( 234 - ( 234 / 6 % 12 ) + 3 ) );
        // (46.2 divided by 11) minus 3 plus 24 modulus (17 minus 2 times 3)
        System.out.println( "(46.2 divided by 11) minus 3 plus 24 modulus (17 minus 2 times 3): " + ( ( 46.2 / 11 ) - 3 + 24 % ( 17 - 2 * 3 ) ) );
        // 480 divided by 10 divided by 12 plus 200 *.5 minus 20 modulus 8
        System.out.println( "480 divided by 10 divided by 12 plus 200 *.5 minus 20 modulus 8: " + ( 480 / 10 / 12 + 200 * .5 - 20 % 8 ) );
        
       // 2.03 Additional int Equations
       System.out.println();
       System.out.println( "2.03 Additional int Equations" );
       
       int iNum1 = 40;
       int iNum2 = 30;
       int iNum3 = 20;
       int iNum4 = 10;
       
       System.out.print( iNum1+ " plus " + iNum2 + " minus " + iNum3 + " times " + iNum4 + " equals: " );
       System.out.println( iNum1 + iNum2 - iNum3 * iNum4 );
       System.out.print( iNum1+ " modulus " + iNum2 + " minus " + iNum3 + " divided by " + iNum4 + " equals: " );
       System.out.println( iNum1 % iNum2 - iNum3 / iNum4 );
        //2.04 Additional double Equations
        
               
    } // end of main method
} // end of class