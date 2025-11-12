//feedback

/*
Great work boaz!
*/


// Prints a crowd cheering output.
// Prints a crowd cheering output.
// Prints a crowd cheering output.
// Prints a crowd cheering output.
public class Cheers {
    public static void main(String[] args) {
        // [0] הוא המילה, [1] הוא מספר הפעמים
        String word = args[0];
        int times = Integer.parseInt(args[1]);

        // אותיות שדורשות "an" באנגלית: A, E, F, H, I, L, M, N, O, R, S, X
        String lettersWithAn = "AEFHILMNORSX";

        // --- שלב 1: איות המילה ---
        for (int i = 0; i < word.length(); i++) {
            char upper = Character.toUpperCase(word.charAt(i));
            // בדיקה אם האות דורשת "an"
            boolean useAn = (lettersWithAn.indexOf(upper) != -1);

            if (useAn) {
                // הדפסה עם רווח יחיד אחרי הנקודתיים
                System.out.println("Give me an " + upper + ": " + upper + "!");
            } else {
                // הדפסה עם רווח יחיד אחרי הנקודתיים
                System.out.println("Give me a " + upper + ": " + upper + "!");
            }
        }

        // --- שלב 2: הצעקה ---
        
        // **********************************
        // מחיקת השורה הריקה המיותרת, כי היא לא מופיעה בפלט הנדרש
        // System.out.println(); 
        // **********************************

        // השאלה
        System.out.println("What does that spell?");

        // הדפסות חוזרות של המילה באותיות גדולות
        String shout = word.toUpperCase();
        for (int j = 0; j < times; j++) {
            System.out.println(shout + "!!!");
        }
    }
}