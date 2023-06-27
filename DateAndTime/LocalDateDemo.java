package DateAndTime;

import java.time.LocalDate;
import java.time.Month;
import java.time.ZoneId;

public class LocalDateDemo {
  public static void main(String[] args) {
    LocalDate ld = LocalDate.now();
    System.out.println(ld); 
    LocalDate ld1 = LocalDate.of(2001,Month.OCTOBER, 25);
    ld1 = LocalDate.ofEpochDay(5);
    System.out.println(ld1);
    System.out.println(ld1.getDayOfMonth());
    LocalDate cp = ld1.plusDays(10);

    System.out.println(cp);
  }
}
