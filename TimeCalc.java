public class TimeCalc {
    public static void main(String[] args) {
        // נקבל את הקלטים משורת הפקודה
        String time = args[0];          // לדוגמה "10:30"
        int minutesToAdd = Integer.parseInt(args[1]);  // לדוגמה 4055

        // נפריד את השעה והדקות מהזמן שנכנס
        int colonIndex = time.indexOf(":");            // מוצא את המיקום של ':'
        String hoursString = time.substring(0, colonIndex);
        String minutesString = time.substring(colonIndex + 1);

        // נהפוך את המחרוזות למספרים
        int hours = Integer.parseInt(hoursString);
        int minutes = Integer.parseInt(minutesString);

        // נמיר הכול לדקות
        int totalMinutes = (hours * 60) + minutes + minutesToAdd;

        // נחשב כמה שעות שלמות יש עכשיו
        int totalHours = totalMinutes / 60;

        // נחשב את השעה החדשה לפי 24 שעות (כי אחרי 24 זה מתאפס)
        int newHours = totalHours % 24;

        // נחשב את הדקות החדשות
        int newMinutes = totalMinutes - (totalHours * 60);

        // נדאג להוסיף 0 אם צריך (כדי לקבל פורמט 2 ספרות)
        String newHoursStr;
        String newMinutesStr;

        if (newHours < 10) {
            newHoursStr = "0" + newHours;
        } else {
            newHoursStr = "" + newHours;
        }

        if (newMinutes < 10) {
            newMinutesStr = "0" + newMinutes;
        } else {
            newMinutesStr = "" + newMinutes;
        }

        // נציג את התוצאה
        System.out.println(newHoursStr + ":" + newMinutesStr);
    }
}
