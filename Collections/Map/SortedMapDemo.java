package Collections.Map;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMapDemo {
  public static void main(String[] args) {
    SortedMap sortedMap = new TreeMap<>();
    sortedMap.put(3, "Hello");
    sortedMap.put(5, "world");
    sortedMap.put(1,"welcome");
    System.out.println(sortedMap);
  }
}
