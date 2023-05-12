package Collections.Map;

import java.util.HashMap;
import java.util.Map;

class Temp{
  public void finalize(){
    System.out.println("final method");
  }

  public String toString(){
    return "temp";
  }
}

public class HashMapDemo {
  public static void main(String[] args) throws InterruptedException{
    Map map = new HashMap();
    map.put("Bio", 99);
    map.put("English", 90);
    map.put(new String("Bio"), 111);
    //Can have null as key
    map.put(null, 50);
    map.put(null, 55);
    map.computeIfAbsent("sree", v -> 5);
    //If the key is repeated then it replaces the value of that corresponding key with new value
    // map.put("Bio", 100);
    map.clear();
    Temp t = new Temp();
    map.put(t, t.hashCode());
    t = null;
    System.gc();
    System.out.println("--------------");
    System.out.println(map);
    Thread.sleep(3000);
    System.out.println(map);
  }
}
