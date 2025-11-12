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
public class Cheers {
    public static void main(String[] args) {

        String word = args[0];
        int times = Integer.parseInt(args[1]);

        String upperWord = word.toUpperCase();
        String lettersWithAn = "AEFHILMNORSX";

        // "Give me ..." lines
        for (int i = 0; i < upperWord.length(); i++) {
            char letter = upperWord.charAt(i);
            boolean useAn = (lettersWithAn.indexOf(letter) != -1);

            if (useAn) {
                System.out.println("Give me an " + letter + ": " + letter + "!");
            } else {
                System.out.println("Give me a " + letter + ": " + letter + "!");
            }
        }

        // exactly one blank line BEFORE the question
        System.out.println();
        System.out.println("What does that spell?");

        // ⚠️ NO blank line after the question (even if times > 0)

        for (int j = 0; j < times; j++) {
            System.out.println(upperWord + "!!!");
        }
    }
}
