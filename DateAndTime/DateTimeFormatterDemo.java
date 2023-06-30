package DateAndTime;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatterDemo {
  public static void main(String[] args) {
    LocalDateTime ldt = LocalDateTime.now();
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yy");
    System.out.println("Formatted Date---"+dtf.format(ldt));
    DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("h: m: s ");
    LocalTime lt = LocalTime.now();
    String formattedTime = dtf2.format(lt);
    System.out.println(formattedTime);
  }
}

  // String s = "eLePhanT";
  // StringBuffer sb = new StringBuffer("");
  // char c[] = s.toCharArray();
  // List<Character> l = Arrays.asList(c);
  // l.stream().forEach((each) ->{
  //   if((int) each < 97){
  //     int cur = (int) each;
  //     cur+=32;
  //     char las = (char) cur;
  //     sb.append(las);
  //   }
  //   else if((int) each > 96){
  //     int cur = (int) each;
  //     cur-=32;
  //     char las = (char) cur;
  //     sb.append(las);
  //   }
  // });
  // System.out.println(sb);