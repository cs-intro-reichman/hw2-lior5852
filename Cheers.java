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
public class Cheers {
    public static void main(String[] args) {
        String word = args[0];
        int times = Integer.parseInt(args[1]);

        String upperWord = word.toUpperCase();
        String anLetters = "AEFHILMNORSX";

        for (int i = 0; i < upperWord.length(); i++) {
            char ch = upperWord.charAt(i);

            String article;
            if (anLetters.indexOf(ch) != -1) {
                article = "an";
            } else {
                // special-case: "a  U" (two spaces before U)
                article = (ch == 'U') ? "a " : "a";
            }

            // build the "Give me ..." line
            if (ch == 'U' && article.equals("a ")) {
                // exactly: "Give me a  U: U!"
                System.out.println("Give me a  " + ch + ": " + ch + "!");
            } else {
                System.out.println("Give me " + article + " " + ch + ": " + ch + "!");
            }
        }

        System.out.println("What does that spell?");

        for (int i = 0; i < times; i++) {
            System.out.println(upperWord + "!!!");
        }
    }
}
