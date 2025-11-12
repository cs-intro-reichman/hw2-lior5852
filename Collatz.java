// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
// נקבל את הקלטים מהפקודה
        int N = Integer.parseInt(args[0]);  // עד איזה מספר לבדוק
        String mode = args[1];              // "v" או "c"

        // נבדוק את כל המספרים מ-1 עד N
        int seed = 1;
        while (seed <= N) {

            int current = seed;
            int steps = 0;

            // אם במצב verbose נדפיס את הרצף
            if (mode.equals("v")) {
                System.out.print(current + " ");
            }

            // נריץ את הרצף עד שמגיעים ל-1
            while (current != 1) {
                if (current % 2 == 0) {
                    current = current / 2;
                } else {
                    current = (3 * current) + 1;
                }

                steps = steps + 1;

                if (mode.equals("v")) {
                    System.out.print(current + " ");
                }
            }

            // נדפיס את מספר הצעדים בסוף השורה (רק אם verbose)
            if (mode.equals("v")) {
                System.out.println("(" + (steps + 1) + ")");
            }

            seed = seed + 1;
        }

        // בסוף נדפיס את השורה המסכמת
        System.out.println("Every one of the first " + N + " hailstone sequences reached 1.");
	}
}
