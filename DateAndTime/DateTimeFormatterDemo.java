package DateAndTime;

import java.lang.reflect.Array;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class DateTimeFormatterDemo {
  public static void main(String[] args) {
    LocalDateTime ldt = LocalDateTime.now();
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yy");
    System.out.println("Formatted Date---"+dtf.format(ldt));
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
    
  }
}
