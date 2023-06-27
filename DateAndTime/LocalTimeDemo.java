package DateAndTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalTimeDemo {
  public static void main(String[] args) {
    LocalTime lt = LocalTime.now();
    System.out.println(lt);
    LocalTime lt1 = lt.plusHours(1);
    System.out.println(lt1);
    System.out.println(lt1.isAfter(lt));

    LocalDateTime ldt = LocalDateTime.now();
    System.out.println(ldt);
    System.out.println(lt.getHour());
  }
}
