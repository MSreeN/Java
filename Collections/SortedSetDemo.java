package Collections;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetDemo {
  public static void main(String[] args) {
    SortedSet s = new TreeSet<>();
    s.add(5);
    s.add(6);
    s.add(3);
    System.out.println(s.first()); 
    System.out.println(s.tailSet(3));
  }
}
