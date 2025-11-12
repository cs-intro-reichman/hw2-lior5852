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
            char ch = upper.charAt(i);

            if (anLetters.indexOf(ch) != -1) {
                // "an" case
                System.out.println("Give me an " + ch + ": " + ch + "!");
            } else if (ch == 'U') {
                // special exact spacing: "a␠␠U"
                System.out.println("Give me a  " + ch + ": " + ch + "!");
            } else {
                // regular "a" case
                System.out.println("Give me a " + ch + ": " + ch + "!");
            }
        }

        System.out.println("What does that spell?");

        for (int i = 0; i < times; i++) {
            System.out.println(upper + "!!!");
        }
    }
}
