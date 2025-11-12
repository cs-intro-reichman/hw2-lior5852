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
public class Cheers {
    public static void main(String[] args) {
        String word = args[0];
        int times = Integer.parseInt(args[1]);
        String upperWord = word.toUpperCase();
        String lettersWithAn = "AEFHILMNORSX";

        // הדפסת השורות של ה-"Give me..."
        for (int i = 0; i < upperWord.length(); i++) {
            char letter = upperWord.charAt(i);

            // אם האות דורשת "an"
            if (lettersWithAn.indexOf(letter) != -1) {
                System.out.println("Give me an " + letter + ": " + letter + "!");
            } 
            // אם זו אחת האותיות שדורשות שני רווחים אחרי a (כמו U, C, O)
            else if (letter == 'U' || letter == 'C' || letter == 'O') {
                System.out.println("Give me a  " + letter + ": " + letter + "!");
            } 
            // אחרת – a רגיל
            else {
                System.out.println("Give me a " + letter + ": " + letter + "!");
            }
        }

        // בלי שורה ריקה כאן!!
        System.out.println("What does that spell?");
        
        // רק אם times > 0 מדפיסים את המילה
        if (times > 0) {
            for (int j = 0; j < times; j++) {
                System.out.println(upperWord + "!!!");
            }
        }
    }
}
