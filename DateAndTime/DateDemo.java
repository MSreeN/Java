package DateAndTime;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class DateDemo {
  public static void main(String[] args) {
    System.out.println(System.currentTimeMillis()/1000/60/60/24/365);
    Date date = new Date();
    System.out.println(date);
    GregorianCalendar gc =  new GregorianCalendar();
    System.out.println(gc.isLeapYear(2024));
    System.out.println(date.getDay());
    System.out.println(gc.get(Calendar.DAY_OF_WEEK));
    gc.setTimeZone(TimeZone.getTimeZone("America/Los_Angeles"));
    System.out.println(gc.getTimeZone());
    System.out.println(gc.getTimeZone().getID());
  }
}
