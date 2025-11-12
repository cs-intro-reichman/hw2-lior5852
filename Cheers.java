//feedback

/*
Great work boaz!
*/


// Prints a crowd cheering output.
// Prints a crowd cheering output.
// Prints a crowd cheering output.
// Prints a crowd cheering output.
// Prints a crowd cheering output.
public class Cheers {
    public static void main(String[] args) {
        String word = args[0];
        int times = Integer.parseInt(args[1]);

        String lettersWithAn = "AEFHILMNORSX";

        for (int i = 0; i < word.length(); i++) {
            char upper = Character.toUpperCase(word.charAt(i));
            boolean useAn = (lettersWithAn.indexOf(upper) != -1);

            if (useAn) {
                System.out.println("Give me an " + upper + ":  " + upper + "!");
            } else {
                System.out.println("Give me a " + upper + ":  " + upper + "!");
            }
        }

        System.out.println();
        System.out.println("What does that spell?");

        // 👇 רק אם יש חזרות – שורה ריקה לפני ההדפסות
        if (times > 0) {
            System.out.println();
        }

        String shout = word.toUpperCase();
        for (int j = 0; j < times; j++) {
            System.out.println(shout + "!!!");
        }
    }
}
