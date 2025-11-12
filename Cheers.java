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
public class Cheers {
    public static void main(String[] args) {

        String word = args[0];
        int times = Integer.parseInt(args[1]);

        String upperWord = word.toUpperCase();
        String lettersWithAn = "AEFHILMNORSX";

        // הדפסת שורות "Give me ..."
        for (int i = 0; i < upperWord.length(); i++) {
            char letter = upperWord.charAt(i);
            if (lettersWithAn.indexOf(letter) != -1) {
                System.out.println("Give me an " + letter + ": " + letter + "!");
            } else {
                System.out.println("Give me a " + letter + ": " + letter + "!");
            }
        }

        System.out.println(); // שורה ריקה לפני השאלה
        System.out.println("What does that spell?");

        // רק אם יש יותר מחזרה אחת – שורה ריקה נוספת
        if (times > 1) {
            System.out.println();
        }

        // הדפסת המילה באותיות גדולות times פעמים
        for (int j = 0; j < times; j++) {
            System.out.println(upperWord + "!!!");
        }
    }
}

