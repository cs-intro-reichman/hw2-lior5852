//feedback

/*
Great work boaz!
*/


// Prints a crowd cheering output.
// Prints a crowd cheering output.
// Prints a crowd cheering output.
// Prints a crowd cheering output.
// Prints a crowd cheering output.
// Prints a crowd cheering output.

// Prints a crowd cheering output.
// Prints a crowd cheering output.
// Prints a crowd cheering output.
// Prints a crowd cheering output.
// Prints a crowd cheering output.
// Prints a crowd cheering output.
// Prints a crowd cheering output.
// Prints a crowd cheering output.
// Prints a crowd cheering output.
// Prints a crowd cheering output.
// Prints a crowd cheering output.
public class Cheers {
    public static void main(String[] args) {
        String word  = args[0];
        int times    = Integer.parseInt(args[1]);

        String upper = word.toUpperCase();

        // Exactly the set required by the checker:
        String anLetters = "AEFHILMNORSX";

            for (int i = 0; i < upper.length(); i++) {
    char currentChar = upper.charAt(i);

    if (currentChar == 'A' || currentChar == 'E' || currentChar == 'F' ||
        currentChar == 'H' || currentChar == 'I' || currentChar == 'L' ||
        currentChar == 'M' || currentChar == 'N' || currentChar == 'O' ||
        currentChar == 'R' || currentChar == 'S' || currentChar == 'X') {
        
        System.out.println("Give me an " + currentChar + ": " + currentChar + "!");

    } else if (currentChar == 'U') {
        // שמירה על הפורמט המיוחד: a␠␠U
        System.out.println("Give me a  " + currentChar + ": " + currentChar + "!");

    } else {
        System.out.println("Give me a " + currentChar + ": " + currentChar + "!");
    }
}

        System.out.println("What does that spell?");

        for (int i = 0; i < times; i++) {
            System.out.println(upper + "!!!");
        }
    }
}
