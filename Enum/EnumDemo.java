package Enum;


import java.util.Random;

public class EnumDemo {
  public static void main(String[] args) {
    DayOfTheWeek dow = DayOfTheWeek.SUN;

    System.out.println(dow.name());
    DayOfTheWeek[] val = DayOfTheWeek.values();
    Random random = new Random();
    for(int i = 0; i<5; i++){
      int randNum = random.nextInt(7);
        switch(randNum){
          case 0 -> System.out.println("monday");
          case 1 -> System.out.println("tues");
          
        }
      }
    }
  }

