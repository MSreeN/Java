package Collections.Map;

import java.util.WeakHashMap;

class Temp{
  public String toString(){
    return "temp";
  }

  public void finalize(){
    System.out.println("final method called");
  }
}

public class WeakHashMapDemo {
  public static void main(String[] args) throws InterruptedException {
    Temp t = new Temp();
    WeakHashMap weakHashMap = new WeakHashMap<>();
    weakHashMap.put(t, t.hashCode());
    t = null;
    System.gc();
    Thread.sleep(3000);
    System.out.println(weakHashMap);
  }
}
