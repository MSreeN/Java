package DateAndTime;

import java.sql.Date;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoField;

public class ChronoFieldsDemo {
  public static void main(String[] args) {
    LocalDate ld =  LocalDate.now();
    LocalTime lt = LocalTime.now();
    System.out.println("Local Date "+ld);
    System.out.println(ld.get(ChronoField.DAY_OF_WEEK));
    System.out.println(ld.get(ChronoField.DAY_OF_MONTH));
    System.out.println("Local Time "+lt);
    System.out.println(lt.get(ChronoField.HOUR_OF_DAY));
    System.out.println(lt.get(ChronoField.AMPM_OF_DAY));
    java.util.Date date = new java.util.Date();
    LocalDateTime ldt = LocalDateTime.now();
    System.out.println(ldt.getDayOfWeek());
    System.out.println(date);
  }
}
