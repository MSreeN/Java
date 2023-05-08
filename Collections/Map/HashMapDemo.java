package Collections.Map;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
  public static void main(String[] args) {
    Map<String, Integer> map = new HashMap();
    map.put("Bio", 99);
    map.put("English", 90);
    System.out.println(map);
  }
}
