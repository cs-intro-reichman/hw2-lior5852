//feedback

/*
Great work boaz!
*/


// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {   // נקבל את הקלטים
        String word = args[0];
        int times = Integer.parseInt(args[1]);

        // רשימת האותיות שדורשות "an"
        String lettersWithAn = "AEFHILMNORSX";

        // נריץ לולאה על כל אות
        for (int i = 0; i < word.length(); i++) {
            char current = word.charAt(i);
            char upper = Character.toUpperCase(current);

            if (lettersWithAn.indexOf(upper) != -1) {
                System.out.println("Give me an " + upper + ": " + upper + "!");
            } else {
                System.out.println("Give me a " + upper + ": " + upper + "!");
            }
        }

        // שורה ריקה אחת
        System.out.println();

        // המשפט
        System.out.println("What does that spell?");
        // אין שורה ריקה אחרי זה!

        // לולאה לחזרות
        for (int j = 0; j < times; j++) {
            System.out.println(word.toUpperCase() + "!!!");
        }   
        }
}
