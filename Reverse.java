/**
 * Prints a given string, backward. Then prints the middle character in the string.
 * The program expects to get one command-line argument: A string.
 */
public class Reverse {
	// main(string[]) - the entry point of a Java program.
    // args - args contains the supplied command-line
    // arguments as an array of String objects.
	public static void main (String[] args){
		// Gets the length of the string that was given by the user.
		int len = args[0].length();
		// Declaring an empty string that will contain the string that we got from the user backwards.
		String revSting = "";
		// Inserting the backward string to the new string char by char.
		for(int i = len - 1; i >= 0; i--){
			revSting += args[0].charAt(i);
		}
		// Printng the new reverse string.
		System.out.println(revSting);
		// Printing the middle character of the new string.
		System.out.println("The middle character is " + revSting.charAt(len / 2));
	}
}
