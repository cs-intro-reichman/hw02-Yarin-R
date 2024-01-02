/**
 *  Generates and prints random integers in the range [0,10),
 *  as long as they form a non-decreasing sequence.
 */
public class InOrder {
	// main(string[]) - the entry point of a Java program.
    // args - args contains the supplied command-line
    // arguments as an array of String objects.
	public static void main (String[] args) {
		// Declaring 2 numbers that one is always amaller the the other (to get inside the while)
		// and the other is a random generated number between 0 and 10.
		int gen1 = -1;
		int gen2 = (int)((Math.random() * 100) % 11);
		// Checking if the first generated number is smaller or equal to the second one.
		while (gen1 <= gen2) {
			gen1 = gen2;
			// Generating a second number.
			gen2 = (int)((Math.random() * 100) % 11);
			// Printing teh generated number is the same line as the others.
			System.out.print(gen1 + " ");
		}
	}
}
