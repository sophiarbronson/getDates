import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.lang.String;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;



//main needs to be static, when static, nothing else works.


public class getDate {
    public static String date1;
    public static String dates = "";
    public static DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
    public static Calendar date;
    public static Scanner reader = new Scanner(System.in);
    public static String full;
    public static String tomorrow;
    public static String yesterday;
    public static Date Choice;
    public static String input;

    public static void main(String[] args) throws ParseException {
        System.out.println("Todays date? yes, no:");
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
        System.out.println("Date (format 'yyyy-mm-dd':");
        date1 = reader.nextLine();

        dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        tomorrow = dateFormat.format(date.getTime());

        dates = date1 + ", " + tomorrow;
        System.out.println("Selected date and the day after:");
        System.out.println(date1);
    }
    private static void dateToday() {
        date = Calendar.getInstance();
        dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        date1 = dateFormat.format(date.getTime());

        date.add(Calendar.DATE, -1);
        yesterday = dateFormat.format(date.getTime());

        dates = date1 + ", " + yesterday;
        System.out.println("Today and yesterdays dates:");
        System.out.println(dates);
    }
}
