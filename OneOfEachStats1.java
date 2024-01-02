/**
 *  Computes some statistics about families in which the parents decide 
 *  to have children until they have at least one child of each gender.
 *  The program expects to get one command-line argument: an int value
 * 	that determines how many families to simulate.
 */
public class OneOfEachStats1 {
	// main(string[]) - the entry point of a Java program.
    // args - args contains the supplied command-line
    // arguments as an array of String objects.
	public static void main (String[] args) {
		// Gets the number of times to run the simulation from the user (converted from string to integer).
		int timesToRun = Integer.parseInt(args[0]);
		// Declaring the variables that will be used to count each category in the question.
		int twoChildren = 0;
		int threeChildren = 0;
		int fourOrMore = 0;
		// Declaring the variables that will be used to count the over-all number of chldren and 
		// to calculate the most common group of the above 3.
		int sumChildren = 0;
		int maxChildren = 0;
		// Running the simulation as much times as the number we got from the user.
		for(int i = 0; i < timesToRun; i++) {
			// Boolean variables for recording if there is at ;east 1 boy and 1 girl.
			Boolean atLeastOneGirl = false;
			Boolean atLeastOneBoy = false;
			// Declaring a gender variable which will be determined by the random methood in a few lines.
			double gender = 0.0;
			// Declaring a variable that will be used to count the number of children in this specific run.
			int children = 0;
			// Generating children until there is at least one of each gender.
			while (!(atLeastOneBoy && atLeastOneGirl)) {
				// Generating a random number from 0 to 1 to determine which gender is added.
				gender = Math.random();
				// Checking if the number that was generated means a boy or a girl,
				// changing the boolean variables accordingly.
				if (gender > 0.5){
					atLeastOneBoy = true;
					children ++;
				}
				else{
					atLeastOneGirl = true;
					children ++;
				}
			}
			// countng each children group.
			if(children == 2){
				twoChildren ++;
			}
			if(children == 3){
				threeChildren ++;
			}
			if(children >= 4){
				fourOrMore ++;
			}
			// Adding the sum of the children in this run to the sum of the over-all children.
			sumChildren += children;
		}
		// Printing the avarage children to get at least one of each gender exactly as the question asks.
		System.out.println("Average: " + ((double)sumChildren / (double)timesToRun) + " children to get at least one of each gender.");
		// Printing the number of each children group exactly as the question asks.
		System.out.println("Number of families with 2 children: " + twoChildren);
		System.out.println("Number of families with 3 children: " + threeChildren);
		System.out.println("Number of families with 4 or more children: " + fourOrMore);
		// Calculating the most common children group.
		maxChildren = Math.max(twoChildren, Math.max(threeChildren, fourOrMore));
		// Printing which group is the most common exactly as the question asks.
		if (maxChildren == twoChildren) {
			System.out.println("The most common number of children is 2.");
		}
		else if(maxChildren == threeChildren) {
			System.out.println("The most common number of children is 3.");
		}
		else {
			System.out.println("The most common number of children is 4 or more.");
		}
	}
}
