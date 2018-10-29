import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.lang.String;
import java.util.Calendar;

public class getDate {
    public static void main(String[] args) {
        String today;
        String yesterday;
        String dates;
        DateFormat dateFormat;
        Calendar date = Calendar.getInstance();

        dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        today = dateFormat.format(date.getTime());


        date.add(Calendar.DATE, -1);
        yesterday = dateFormat.format(date.getTime());

        dates = today + ", " + yesterday;
        System.out.println(dates);
    }
}
