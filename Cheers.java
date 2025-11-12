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
public class Cheers {
    public static void main(String[] args) {

        // קלטים
        String word = args[0];
        int times = Integer.parseInt(args[1]);

        // כל האותיות מודפסות באותיות גדולות
        String upperWord = word.toUpperCase();

        // האותיות שדורשות "an"
        String lettersWithAn = "AEFHILMNORSX";

        // הדפסת שורות ה-"Give me..."
        for (int i = 0; i < upperWord.length(); i++) {
            char letter = upperWord.charAt(i);

            if (lettersWithAn.indexOf(letter) != -1) {
                System.out.println("Give me an " + letter + ":  " + letter + "!");
            } else {
                System.out.println("Give me a " + letter + ":  " + letter + "!");
            }
        }

        // שורה ריקה לפני השאלה
        System.out.println();
        System.out.println("What does that spell?");

        // רק אם יש חזרות – שורה ריקה לפני ההדפסה
        if (times > 0) {
            System.out.println();
        }

        // הדפסת המילה באותיות גדולות times פעמים
        for (int j = 0; j < times; j++) {
            System.out.println(upperWord + "!!!");
        }
    }
}
