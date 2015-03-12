
/**
 * class TestListing2
 * 
 * @author R. Enger 
 * @version 6/25/2007
 */
public class TestListing2
{
	public static void main(String[] args)
	{
	   String[][] houses = new String[5][5];
	   
	   
	   houses[0] = new houses("123 Any Street", "St. Cloud", "FL", "34769", 79000);
	   houses[1] = new HouseListing("456 Cherry Lane", "St. Cloud", "FL", "34772", 110000);
	   houses[2] = new HouseListing("1892 Ocean Blue", "Kissimmee", "FL", "34647", 212000);
	   houses[3] = new HouseListing("339 Curry Ave", "Kissimee", "FL", "34647", 88000);
	   houses[4] = new HouseListing("612 Orange Street", "Orlando", "FL", "32196", 451000);	   
	   
	   System.out.println("Before sorting: \n");
	   for(int i = 0; i < houses.length; i++)
	      System.out.println(houses[i] );
	   
	   houses = insertionSort(houses);
	      
	   System.out.println("\nAfter sorting: \n");
	   for(int i = 0; i < houses.length; i++)
	      System.out.println(houses[i] );
	}
   
  

} // end of class
