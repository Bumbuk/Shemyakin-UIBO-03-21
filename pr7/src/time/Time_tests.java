package time;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.function.DoubleToIntFunction;

public class Time_tests {
    public static void main(String[] args) throws InterruptedException {
        String date_s = "11 June 2028 year";
        System.out.println(date_s);

        Date date1 = new Date();
        System.out.println(date1);

        Date date2 = new Date(123123123);
        System.out.println(date2);

        System.out.println((date1.getTime() > date2.getTime()) ? "date1 позже date2": "date1 раньше date2");

        System.out.println(date1.before(date2));
        System.out.println(date1.after(date2));

        date1 = new Date();
        //Thread.sleep(2000); //Если приостановим работу программу то дата2 увеличится и колво мс будет разная
        date2 = new Date();
        System.out.println(date1.getTime());
        System.out.println(date2.getTime());
        System.out.println(date1.equals(date2));

        System.out.println(date1.getHours());

        Calendar calendar = new GregorianCalendar(2023,Calendar.OCTOBER,18);
        Date date = calendar.getTime();
        System.out.println(date);
        calendar.set(Calendar.HOUR, 10);
        calendar.set(Calendar.MILLISECOND,10);
        System.out.println(calendar.getTime());

        calendar.add(Calendar.MONTH,-2);
        System.out.println(calendar.getTime());

        calendar.roll(Calendar.MONTH,-20); //Не меняя год просто изменив значения
        System.out.println(calendar.getTime());

        System.out.println("Year - "+ calendar.get(Calendar.YEAR));

        GregorianCalendar cannes = new GregorianCalendar(216, Calendar.AUGUST,2);
        cannes.set(Calendar.ERA,GregorianCalendar.BC);
        DateFormat df = new SimpleDateFormat("dd MMM yyy GG");
        System.out.println(df.format(cannes.getTime()));

        SimpleDateFormat formater = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        date = new Date();
        System.out.println(formater.format(date));

        String strDate = "Fri, October 18, 2023";
        SimpleDateFormat formatter = new SimpleDateFormat("EEE, MMMM d, yyyy", Locale.ENGLISH);
        try{
            Date dates = formatter.parse(strDate);
            System.out.println(formatter.format(dates));
        }
        catch (ParseException e){
            e.printStackTrace();
        }
    }
}
