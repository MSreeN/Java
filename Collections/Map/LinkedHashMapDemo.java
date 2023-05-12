package Collections.Map;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class LinkedHashMapDemo {
  public static void main(String[] args) {
    HashMap hashMap = new LinkedHashMap<>();
    hashMap.put("a", 1);
    hashMap.put("b", 2);
    hashMap.put("c", 3);
    hashMap.put("d", 4);
    System.out.println(hashMap);
  }
}
