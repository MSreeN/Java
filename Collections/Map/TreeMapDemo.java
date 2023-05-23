package Collections.Map;

import java.util.Comparator;
import java.util.TreeMap;

public class TreeMapDemo {
  public static void main(String[] args) {
    TreeMap treeMap = new TreeMap<>(Comparator.reverseOrder());
    treeMap.put("d", 1);
    treeMap.put("a", 5);
    treeMap.put("z",8);
    treeMap.put("k",1);
    System.out.println(treeMap);
  }
}
