/**
 *  Gets a command-line argument (int), and prints all the divisors of the given number.
 */
public class Divisors {
	// main(string[]) - the entry point of a Java program.
    // args - args contains the supplied command-line
    // arguments as an array of String objects.
	public static void main (String[] args) {
		// Gets a number form the user (converted from string to integer).
		int num = Integer.parseInt(args[0]);
		// Checking what are teh divisors of the number that was given by the user.
		for(int i = 1; i <= num; i++){
			// Checking if is a divisor of the number that was given by the user.
			if ((num % i) == 0 ) {
				// Prining all of the divisors of the number that was given by the user.
				System.out.println(i);
			}
		}
	}
}
