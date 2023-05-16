package Collections;

import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMapDemo {
  public static void main(String[] args) {
    NavigableMap navigableMap = new TreeMap<>();
    navigableMap.put(1, "hello");
    navigableMap.put(2, "world");
    navigableMap.put(3, "wel");
    navigableMap.put(4, "come");
    navigableMap.put(9, "home");
    System.out.println(navigableMap);
    System.out.println(navigableMap.ceilingEntry(6));
  }
}
