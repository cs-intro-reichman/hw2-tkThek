// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
	    String string = args[0].toUpperCase();
        int noOfTimes = Integer.parseInt(args[1]);

        // Stores
        String specialCases = "AEFHILMNORSX";

        // Analyses the inputted string character by character.
        String aAn = "";
        for (int i = 0; i < string.length(); i++) {

        // Checks whether the character at index i matches any characters from specialCases,
        // then prints "Give me" + aAn accordingly.
        // "break;" is crucial here as, otherwise, unless string.charAt(i) == "X", aAn = " a "
        // (it goes over every letter from specialCases but does not stop until the last).
            for (int j = 0; j < specialCases.length(); j++) {
                 if (string.charAt(i) == specialCases.charAt(j)) {
                    aAn = " an ";
                    break;
                 } else {
                    aAn = " a  ";
                 }
            }
            System.out.println("Give me" + aAn + string.charAt(i) + ": " + string.charAt(i) + "!");
        }

        // Prints the final part of the output.
        System.out.println("What does that spell?");
        for (int i = 0; i < noOfTimes; i++) {
                System.out.println(string + "!!!");
        }
        }
}
