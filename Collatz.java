// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
		// Gets the seed from the user and c or v.
		int seed = Integer.parseInt(args[0]);
		String cv = args[1];

		int count = 1; // Counts No. of terms until it reaches 1.
		int timesReachedOne = 0; // Counts how many sequences reached 1 out of (seeds) seeds.
		int boundary = seed; // Variable to vary the seed from the input to 1.

		//
		for (int i = 0; i < boundary; i++) {
			if (cv.equals("v")) {
				System.out.print(seed + " ");
			}
			while (true) { // Finds the hailstone sequence of the seed.
				if (seed % 2 == 0) {
					seed = seed/2;
					count++;
					if (cv.equals("v")) { // Starts by printing the first term of the sequence if user inputs v.
						System.out.print(seed + " ");
					}
					if (seed == 1) {
						timesReachedOne++; // If, at any point, sequence reaches one, it is counted as a positive case.
						seed = boundary - (i+1); // Sets the next value to be looped as seed - 1 (Finds the sequence for
												 // seed -1).
							if (cv.equals("v")) {
								System.out.print("(" + count + ") "); // Prints the number of terms before 1 was reached.
								count = 1; // Resets the count for the next number (seed - 1).
								System.out.println(" "); // Sets it up for the new sequence to be printed in a new line.
								break;} else {
								count = 1; // Sets it up for the loop to run as intended if user input is c.
								break;
							}}

				// Works just as the previous part.
				} else {
					seed = 3 * seed + 1;
					count++;
					if (cv.equals("v")) {
						System.out.print(seed + " ");
					}
					if (seed == 1) {
						timesReachedOne++;
						seed = boundary - (i+1);
							if (cv.equals("v")) {
								System.out.print("(" + count + ") ");
								count = 1;
								System.out.println(" ");
								break;} else {
								count = 1;
								break;
							}
					}
				}
			}
			}
		// Prints the result in case the conjecture is true for numbers 1 to seed.
		if (timesReachedOne == boundary) {
			System.out.println(" ");
			System.out.println("Every one of the first " + boundary + " hailstone sequences reached 1.");
		}
		}

		}
