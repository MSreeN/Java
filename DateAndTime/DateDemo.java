package DateAndTime;

import java.util.Date;

public class DateDemo {
  public static void main(String[] args) {
    System.out.println(System.currentTimeMillis()/1000/60/60/24/365);
    Date date = new Date();
    System.out.println(date);
  }
}
