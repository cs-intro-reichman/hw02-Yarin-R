
/**
 *  Simulates the formation of a family in which the parents decide 
 *  to have children until they have at least one child of each gender.
 */
public class OneOfEach {
	// main(string[]) - the entry point of a Java program.
    // args - args contains the supplied command-line
    // arguments as an array of String objects.
	public static void main (String[] args) {
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
			// printing the gender and changing the boolean variables accordingly.
			if (gender > 0.5){
				System.out.print("b");
				atLeastOneBoy = true;
				children ++;
			}
			else{
				System.out.print("g");
				atLeastOneGirl = true;
				children ++;
			}
			// Printing a " " to make sure that the output is the same as the question asks.
			System.out.print(" ");
		}
		// Printing a enter to make sure that the output is the same as the question asks.
		System.out.println();
		// Printing the number children exactly as the question asks.
		System.out.println("You made it... and you now have " + children + " children.");
	}
}
