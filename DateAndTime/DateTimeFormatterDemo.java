package DateAndTime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatterDemo {
  public static void main(String[] args) {
    LocalDateTime ldt = LocalDateTime.now();
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yy");
    System.out.println("Formatted Date---"+dtf.format(ldt));
  }
}
