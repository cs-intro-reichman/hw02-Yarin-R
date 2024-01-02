/**
 *  Gets a command-line argument n (int), and prints an n-by-n damka board.
 */
public class DamkaBoard {
	// main(string[]) - the entry point of a Java program.
    // args - args contains the supplied command-line
    // arguments as an array of String objects.
	public static void main(String[] args) {
		// Gets a number to determine the size of the Damka board from the user (converted from string to integer).
		int len = Integer.parseInt(args[0]);
		// Declaring and empty row;
		String row = "";
		// Adding * to the row as the number that was given by the user.
		for (int i = len; i > 0; i--){
			if (i == 1) {
				row += "*";
			}
			else{
				row += "* ";
			}
		}
		// printing the rest of the rows in the way that was asked for in teh question.
		for (int i = 0; i < len; i++){
			if (i % 2 == 0) {
				System.out.println(row + " ");
			}
			else{
				System.out.println(" " + row);
			}
		}
	}
}
