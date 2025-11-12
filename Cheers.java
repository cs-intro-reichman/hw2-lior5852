//feedback

/*
Great work boaz!
*/


// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
   // נקבל את שני הקלטים מהפקודה
        String word = args[0];               // לדוגמה RUNI
        int times = Integer.parseInt(args[1]); // לדוגמה 5

        // נהפוך את המילה לאותיות גדולות, ליתר ביטחון
        word = word.toUpperCase();

        // רשימת אותיות שדורשות "an" במקום "a"
        String lettersWithAn = "AEFHILMNORSX";

        // נשתמש בלולאה כדי לעבור על כל אות במילה
        int i = 0;
        while (i < word.length()) {
            char currentChar = word.charAt(i);

            // נבדוק אם האות הנוכחית נמצאת ברשימת האותיות שדורשות "an"
            int index = lettersWithAn.indexOf(currentChar);

            if (index != -1) {
                // כלומר כן נמצאה – נשתמש ב-an
                System.out.println("Give me an " + currentChar + ": " + currentChar + "!");
            } else {
                // אחרת נשתמש ב-a
                System.out.println("Give me a " + currentChar + ": " + currentChar + "!");
            }

            i = i + 1; // עוברים לאות הבאה
        }

        // אחרי שסיימנו את כל האותיות
        System.out.println("What does that spell?");

        // נדפיס את המילה N פעמים
        int j = 0;
        while (j < times) {
            System.out.println(word + "!!!");
            j = j + 1;
                }
        }
}
