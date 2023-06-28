package DateAndTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;

public class LocalDateTimeDemo {
  public static void main(String[] args) {
    LocalDateTime ldt = LocalDateTime.now();
    // System.out.println(ldt);
    // System.out.println(ldt.getMonthValue());
    //ZonedDateTime: contains info about time date and time zone information, offset info
    //OffsetDateTime: it will ony contain offset info, date , time, no zone info
    //OffsetTime: just for time
    //ZoneId: by using this class you can specify the id of particular zone
    
    ZonedDateTime zdt = ZonedDateTime.now();
    System.out.println(zdt);
    //2023-06-28T18:24:06.238846700+05:30[Asia/Calcutta]
  }
}
