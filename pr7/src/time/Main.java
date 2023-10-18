package time;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println("Шемякин Егор Николаевич "+date );

        Calendar date1 = new GregorianCalendar(2023,Calendar.AUGUST,20);
        System.out.println(date.equals((date1.getTime())));

        Calendar calendar = new GregorianCalendar(2023, Calendar.AUGUST,14);
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        Student student = new Student(calendar.getTime(),df);
        System.out.println(student.toString());

        String str = "2023 October 14 18:40";
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy MMMM d HH:mm", Locale.ENGLISH);
        try {
            Date date11 = dateFormat.parse(str);
            System.out.println(dateFormat.format(date11));
        }
        catch (ParseException e){
            e.printStackTrace();
        }
        
    }
}
