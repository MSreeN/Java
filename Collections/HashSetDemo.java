package Collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;

class HashSetCls{

}

public class HashSetDemo {
  public static void main(String[] args) {
    HashSet<Integer> hs = new HashSet<>(2);
    hs.add(10);
    hs.add(5);
    hs.add(10);
    hs.add(6);
    Iterator<Integer> i = hs.iterator();
    while(i.hasNext()){
      System.out.println(i.next());
    }
  }
}
