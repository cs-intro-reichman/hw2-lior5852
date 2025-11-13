// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
        // נקבל את הקלט - כמה איברים לחשב
        int terms = Integer.parseInt(args[0]);

        // נגדיר משתנה שישמור את הסכום
        double sum = 0.0;

        // נשתמש בלולאה פשוטה כדי לעבור על כל האיברים
        int i = 0;
        while (i < terms) {

            // המונה הוא תמיד 1, והמכנה הולך כמו 1,3,5,7,9...
            double denominator = (2 * i) + 1;

            // אם i זוגי – נוסיף את השבר, אם אי-זוגי – נוריד אותו
            if (i % 2 == 0) {
                sum = sum + (1.0 / denominator);
            } else {
                sum = sum - (1.0 / denominator);
            }

            i = i + 1; // נעבור לאיבר הבא
        }

        // אחרי שסיימנו, נכפיל את הסכום ב-4 כדי לקבל קירוב ל-pi
        double approxPi = sum * 4;

        // נדפיס את התוצאות
        System.out.println("pi according to Java: " + Math.PI);
        System.out.println("pi, approximated:     " + approxPi);
		}
}
