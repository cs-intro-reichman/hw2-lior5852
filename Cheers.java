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

        // נוודא שהמילה באותיות גדולות
        word = word.toUpperCase();

        // אותיות שצריכות "an"
        String lettersWithAn = "AEFHILMNORSX";

        // לולאה ראשונה: הדפסות Give me...
        int i = 0;
        while (i < word.length()) {
            char current = word.charAt(i);

            // נבדוק אם האות נמצאת ברשימת an
            if (lettersWithAn.indexOf(current) != -1) {
                System.out.println("Give me an " + current + ": " + current + "!");
            } else {
                System.out.println("Give me a " + current + ": " + current + "!");
            }

            i = i + 1;
        }

        // 👇 שורה ריקה לפני "What does that spell?"
        System.out.println();

        System.out.println("What does that spell?");

        // לולאה שנייה: חזרה על המילה כמה פעמים
        int j = 0;
        while (j < times) {
            System.out.println(word + "!!!");
            j = j + 1;
        }       

        }
}
