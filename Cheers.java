//feedback

/*
Great work boaz!
*/


// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
   // קלטים
        String word = args[0];
        int times = Integer.parseInt(args[1]);

        // נהפוך לאותיות גדולות
        word = word.toUpperCase();

        // אותיות שדורשות "an"
        String lettersWithAn = "AEFHILMNORSX";

        // לולאה על כל אות במילה
        int i = 0;
        while (i < word.length()) {
            char current = word.charAt(i);

            if (lettersWithAn.indexOf(current) != -1) {
                System.out.println("Give me an " + current + ": " + current + "!");
            } else {
                System.out.println("Give me a " + current + ": " + current + "!");
            }

            i = i + 1;
        }

        // 👇 שורה ריקה לפני המשפט
        System.out.println();

        // 👇 המשפט הראשון
        System.out.println("What does that spell?");

        // 👇 שורה ריקה אחרי המשפט
        System.out.println();

        // לולאה שחוזרת times פעמים
        int j = 0;
        while (j < times) {
            System.out.println(word + "!!!");
            j = j + 1;
        }
        }
}
