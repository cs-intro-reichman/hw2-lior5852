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
public class Cheers {
    public static void main(String[] args) {
        String word = args[0];
        int times = Integer.parseInt(args[1]);
        String upperWord = word.toUpperCase();
        String lettersWithAn = "AEFHILMNORSX";

        for (int i = 0; i < upperWord.length(); i++) {
            char letter = upperWord.charAt(i);

            if (lettersWithAn.indexOf(letter) != -1) {
                System.out.println("Give me an " + letter + ": " + letter + "!");
            } else if (letter == 'U') {
                System.out.println("Give me a  " + letter + ": " + letter + "!");
            } else {
                System.out.println("Give me a " + letter + ": " + letter + "!");
            }
        }

        System.out.println("What does that spell?");

        for (int j = 0; j < times; j++) {
            System.out.println(upperWord + "!!!");
        }
    }
}
