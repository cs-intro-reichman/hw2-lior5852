//feedback

/*
Great work boaz!
*/


// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
        // נקבל את הקלטים
        String word = args[0];
        int times = Integer.parseInt(args[1]);

        // רשימת אותיות שדורשות "an"
        String lettersWithAn = "AEFHILMNORSX";

        // לולאה שעוברת על כל אות במילה
        int i = 0;
        while (i < word.length()) {
            char current = word.charAt(i);
            char upper = Character.toUpperCase(current); // כדי לבדוק אם ב-AEFH...

            if (lettersWithAn.indexOf(upper) != -1) {
                System.out.println("Give me an " + upper + ": " + upper + "!");
            } else {
                System.out.println("Give me a " + upper + ": " + upper + "!");
            }

            i = i + 1;
        }

        // שורה ריקה לפני המשפט
        System.out.println();
        System.out.println("What does that spell?");

        // לולאה שחוזרת על המילה באותיות גדולות
        int j = 0;
        while (j < times) {
            System.out.println(word.toUpperCase() + "!!!");
            j = j + 1;
        }
        
        }
}
