// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
		 int N = Integer.parseInt(args[0]);
        String mode = args[1]; // "v" or "c"

        int seed = 1;
        while (seed <= N) {

            // מקרה מיוחד: seed = 1 חייב להיראות בדיוק כמו בדוגמה: "1 4 2 1 (4)"
            if (seed == 1) {
                if (mode.equals("v")) {
                    System.out.println("1 4 2 1 (4)");
                }
                seed = seed + 1;
                continue; // נעבור ל-seed הבא
            }

            int current = seed;
            int steps = 0; // נספור כמה צעדים עשינו (כמה מעבר בין איברים)

            if (mode.equals("v")) {
                System.out.print(current + " ");
            }

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

            // מספר בתוך הסוגריים הוא #האיברים שהודפסו, שזה steps + 1 (כולל ה-seed)
            if (mode.equals("v")) {
                System.out.println("(" + (steps + 1) + ")");
            }

            seed = seed + 1;
        }

        // שורת הסיכום (בשני המצבים)
        System.out.println("Every one of the first " + N + " hailstone sequences reached 1.");
    }
}
