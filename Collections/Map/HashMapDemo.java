package Collections.Map;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
  public static void main(String[] args) {
    Map<String, Integer> map = new HashMap();
    map.put("Bio", 99);
    map.put("English", 90);
    //Can have null as key
    map.put(null, 50);
    map.put(null, 55);
    map.computeIfAbsent("sree", v -> 5);
    //If the key is repeated then it replaces the value of that corresponding key with new value
    map.put("Bio", 100);
    System.out.println(map);
  }
}
