package Collections.Map;

import java.util.IdentityHashMap;

public class IdentityHashMapDemo {
  public static void main(String[] args) {
    IdentityHashMap identityHashMap = new IdentityHashMap<>();
    identityHashMap.put("a", 1);
    identityHashMap.put(new String("a"), 2);
    System.out.println(identityHashMap);
  }
}
