package Collections;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.Map.Entry;

public class TreeMapDemo {
  public static void main(String[] args) {
    TreeMap<Integer, String> tm = new TreeMap<>();
    tm.put(1,"b");
    tm.put(4, "b");
    
    System.out.println(tm.keySet());
    // System.out.println(tm);
    Entry<Integer, String> e = tm.firstEntry();
    System.out.println(e);
    for(Map.Entry<Integer, String> m: tm.entrySet()){
      System.out.println(m);
    }
  }
}
