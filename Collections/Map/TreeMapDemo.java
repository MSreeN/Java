package Collections.Map;

import java.util.Comparator;
import java.util.TreeMap;

public class TreeMapDemo {
  public static void main(String[] args) {
    TreeMap treeMap = new TreeMap<>(Comparator.reverseOrder());
    treeMap.put(5, "hello");
    treeMap.put(1, "world");
    treeMap.put(3, "wel");
    System.out.println(treeMap);
  }
}
