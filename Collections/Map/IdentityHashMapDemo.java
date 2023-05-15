package Collections.Map;

import java.util.IdentityHashMap;

public class IdentityHashMapDemo {
  public static void main(String[] args) {
    IdentityHashMap identityHashMap = new IdentityHashMap<>();
    identityHashMap.put("a", 1);
    identityHashMap.put(new String("a"), 2);
    //Since single reference will point to these two 10's in the literal pool, Identity hash map won't allow for duplicate keys.
    identityHashMap.put(10,"one");
    identityHashMap.put(10, "two");
    System.out.println(identityHashMap);
  }
}
