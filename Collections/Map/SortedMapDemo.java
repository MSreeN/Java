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
    System.out.println(sortedMap.tailMap(5));
    System.out.println(sortedMap.keySet());
    System.out.println(sortedMap.values());
    System.out.println(sortedMap.entrySet());
  }
}
