public class BeadedJean extends BasicJean{

	// instance variables - replace the example below with your own
	private int numBeads;
	private String pattern;

	public BeadedJean(int np, int nb){

		// initialise instance variable
		
		numBeads = nb;

	}

    public void design()

    {

        if (numBeads == 10)

           pattern = "circle";

        else if (numBeads == 20)

            pattern = "heart";

        else if (numBeads == 30)

            pattern = "spiral";

        else 

            pattern = "random";

    }


    public String toString()

    {

        return "This pair of Jeans uses " + numBeads + " beads in a " + pattern;

    }

}

