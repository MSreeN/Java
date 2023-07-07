package DateAndTime;

import java.util.ArrayList;

public class Challenge {
  public static void main(String[] args) throws NoNextEle{
    ArrayList<String> samp = new ArrayList<>();
    ArrayList<String> result = new ArrayList<>();
    for (int i = 0; i <= 10; i++) {
      samp.add(Integer.toBinaryString(i));
    }

    for (String ele : samp) {
      // System.out.println(ele);
    }
    // System.out.println("-------------");

    for (String ele : samp) {
      int count = 0;
      for (int i = 0; i < ele.length() - 1; i++) {
        if(i == ele.length()-1) throw new NoNextEle("No next element");
        else{
          if (ele.charAt(i) == ele.charAt(i + 1)) {
            count++;
          } else {
            continue;
          }
        }
        }
      if (count < 1) {
        result.add(ele);
      }
    }

    for (String ele : result) {
      System.out.println(ele);
    }
  }
}

class NoNextEle extends Exception{
  NoNextEle(String str){
    super(str);
  }
}