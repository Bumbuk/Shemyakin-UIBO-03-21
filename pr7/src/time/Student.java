package time;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Student {
    Date birth = new Date();
    DateFormat df = new SimpleDateFormat();

    public Student(Date birth, DateFormat df) {
        this.birth = birth;
        this.df = df;
    }

    @Override
    public String toString() {
        return "День рождения - " + df.format(birth);
    }
}
