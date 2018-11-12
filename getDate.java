import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.lang.String;
import java.util.Calendar;
import java.util.Scanner;


public class getDate {
    public static String dates;
    public static SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
    public static Calendar date = Calendar.getInstance();
    public static Scanner reader = new Scanner(System.in);


    public static void main(String[] args) {
        String full;

        System.out.println("Today's date? yes, no:");
        full = reader.nextLine();

        do {
            if (full.contains("yes")) {
                System.out.println(full);
                dateToday();
            } else if (full.contains("no")) {
                System.out.println(full);
                dateChoice();
            } else {
                System.out.println("Please type yes or no");
                full = "";
            }
        } while (full.isEmpty());
    }
    private static void dateChoice() {
        String nextDate;
        String dateInString;

        System.out.println("Date Choice: (Format: yyyy-mm-dd)");
        dateInString = reader.nextLine();

        try {
            date.setTime(dateFormat.parse(dateInString));
        } catch (ParseException e) {
            e.printStackTrace();
        }

        date.add(Calendar.DAY_OF_YEAR, +1);
        nextDate = dateFormat.format(date.getTime());

        dates = dateInString + ", " + nextDate;
        System.out.println(dates);
    }
    private static void dateToday() {
        String date1;
        String yesterday;

        date1 = dateFormat.format(date.getTime());

        date.add(Calendar.DATE, -1);
        yesterday = dateFormat.format(date.getTime());

        dates = date1 + ", " + yesterday;
        System.out.println("Today and yesterdays dates:");
        System.out.println(dates);
    }
}
