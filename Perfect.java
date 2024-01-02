/**
 *  Gets a command-line argument (int), and chekcs if the given number is perfect.
 */
public class Perfect {
	// main(string[]) - the entry point of a Java program.
    // args - args contains the supplied command-line
    // arguments as an array of String objects.
	public static void main (String[] args) {
		// Gets a number from the user (converted from string to integer).
		int num = Integer.parseInt(args[0]);
		// Declaring a string to be all of the number's divisors (every numebr is divisable by 1).
		String divisors = "1";
		// Declaring a variable to sum all of the number's divisors (every numebr is divisable by 1).
		int sum = 1;
		// Calculating all of the numbers divisors undil it's half.
		for(int i = 2; i <= num/2; i++){
			// Checking if i is a divisor of the number we got from the user.
			if (num % i == 0) {
				// Adding i to the string of divisors.
				divisors += " + " + i;
				// Adding i to the sum of the number's divisors.
				sum += i;
			}
		}
		// Checking if the nmber we got from the user is indeed a perfect number.
		if (sum == num) {
			// Printing a message to show tha the number is perfect with a proof as the question asks.
			System.out.println(num + " is a perfect number since " + num + " = " + divisors);
		}
		else{
			// Printing a message to show tha the number is not perfect as the question asks.
			System.out.println(num + " is not a perfect number");
		}
	}
}
