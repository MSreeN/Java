package Collections;

import java.util.List;
import java.util.TreeSet;

public class TreeSetDemo {
  public static void main(String[] args) {
    TreeSet<Integer> ts = new TreeSet<>(List.of(5, 10, 29, 48, 48, 29));
    System.out.println(ts.ceiling(11));
    System.out.println(ts.floor(9));
    System.out.println(ts);
  }
}
