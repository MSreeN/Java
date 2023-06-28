package DateAndTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.MonthDay;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Set;

public class LocalDateTimeDemo {
  public static void main(String[] args) {
    LocalDateTime ldt = LocalDateTime.now();
    // System.out.println(ldt);
    // System.out.println(ldt.getMonthValue());
    // ZonedDateTime: contains info about time date and time zone information,
    // offset info
    ZonedDateTime zdt = ZonedDateTime.now(ZoneId.of("America/Los_Angeles"));
    Set<String> availableZoneIds = ZoneId.getAvailableZoneIds();
    System.out.println(availableZoneIds);
    System.out.println("ZonedDateTime----" + zdt);
    // 2023-06-28T18:24:06.238846700+05:30[Asia/Calcutta]

    // OffsetDateTime: it will ony contain offset info, date , time, no zone info
    OffsetDateTime odt = OffsetDateTime.now();
    System.out.println("offsetDateTime-----" + odt);
    /// with withHour method you can directly change the hour, its not like you add
    /// the hour to the previous hour,it returns new object with changed hour
    OffsetDateTime odt1 = odt.withHour(1);
    odt1.withDayOfMonth(20);
    odt1.withDayOfYear(20);
    System.out.println("offsetDateTime----" + odt1);

    // OffsetTime: just for time
    // ZoneId: by using this class you can specify the id of particular zone

    // ZoneId: you can set and get the zone information
    // ----- ZonedDateTime zdt =
    // ZonedDateTime.now(ZoneId.of("America/Los_Angeles"));
    // Set<String> availableZoneIds = ZoneId.getAvailableZoneIds();
    // System.out.println(availableZoneIds);

    // MonthDay: just month and day information
    MonthDay md = MonthDay.now();
    System.out.println("MOnthDat------"+md);
    //with atYear method you can add year to that MonthDay object and it returns localDate object
    LocalDate ld =  md.atYear(2032);
    System.out.println("LocalDate added to monthDat---"+ld);
  }
}
