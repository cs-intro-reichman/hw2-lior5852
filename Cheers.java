//feedback

/*
Great work boaz!
*/


// Prints a crowd cheering output.
// Prints a crowd cheering output.
// Prints a crowd cheering output.
public class Cheers {
    public static void main(String[] args) {
        String word = args[0];
        int times = Integer.parseInt(args[1]);

        // אותיות שדורשות "an"
        String lettersWithAn = "AEFHILMNORSX";

        // מעבר על כל אות במילה
        for (int i = 0; i < word.length(); i++) {
            char upper = Character.toUpperCase(word.charAt(i));
            boolean useAn = (lettersWithAn.indexOf(upper) != -1);

            if (useAn) {
                // 👇 רווח כפול אחרי הנקודתיים
                System.out.println("Give me an " + upper + ":  " + upper + "!");
            } else {
                System.out.println("Give me a " + upper + ":  " + upper + "!");
            }
        }

        // שורה ריקה אחת
        System.out.println();

        // השאלה
        System.out.println("What does that spell?");

        // הדפסות חוזרות של המילה באותיות גדולות
        String shout = word.toUpperCase();
        for (int j = 0; j < times; j++) {
            System.out.println(shout + "!!!");
        }
    }
}
