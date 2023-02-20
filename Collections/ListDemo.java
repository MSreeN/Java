package Collections;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {
  public static void main(String[] args) {
    ArrayList<Integer> al1 = new ArrayList<>(10);
    ArrayList<Integer> al2 = new ArrayList<>(List.of(5,6,7));
    al1.add(6);
    al1.addAll(1, al2);
    // al1.add(2,5);
    al1.forEach(ele -> System.out.println(ele));
  }
}
