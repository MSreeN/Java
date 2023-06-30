package DateAndTime;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoField;

public class ChronoFieldsDemo {
  public static void main(String[] args) {
    LocalDate ld =  LocalDate.now();
    LocalTime lt = LocalTime.now();
    System.out.println("Local Date "+ld);
    System.out.println(ld.get(ChronoField.DAY_OF_WEEK));
  }
}
