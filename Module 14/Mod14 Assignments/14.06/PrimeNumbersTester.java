/**
 * Write a description of class PrimeNumbersTester here.
 * 
 * @author David Johnson
 * @version
 * 2/4/15  
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrimeNumbersTester{

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter the number you want to calculate to.");
        int high = in.nextInt();
        
        PrimeNumbers var = new PrimeNumbers(high);
        
        List<Integer> primeNumbers = var.getPrimeNumbers();
        
        System.out.println("The primes are: " + primeNumbers);
    
    }
    
}