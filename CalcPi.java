// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) {

		// Asks the user for the number of terms to the approximation.
		int noOfTimes = Integer.parseInt(args[0]);

		// Runs the approximation with noOfTimes terms.
		double sum = 0.0;
		for (int i = 0; i < noOfTimes; i++) {
			double term = 1.0 / ((2*i) + 1); // 1/(2n+1)
			if (i % 2 == 0) { // Alternative to the rather slow Math.pow().
				sum += term;
			} else {
				sum -= term;
			}
		}
		System.out.println("pi according to Java: " + Math.PI);
		System.out.println("pi, approximated:     " + sum*4); // As the sum converges to pi/4.
	}
}
