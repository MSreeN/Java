package DateAndTime;

import java.time.LocalDate;
import java.time.Month;
import java.time.ZoneId;

public class LocalDateDemo {
  public static void main(String[] args) {
    LocalDate ld = LocalDate.now();
    System.out.println(ld); 
    LocalDate ld1 = LocalDate.of(2001,Month.OCTOBER, 25);
    System.out.println(ld1);
  }
}
