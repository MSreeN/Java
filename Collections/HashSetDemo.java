package Collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.ListIterator;

class HashSetCls{

}

public class HashSetDemo {
  public static void main(String[] args) {
    ArrayList al = new ArrayList<>(10);
    al.add(10);
    LinkedHashSet lhs = new LinkedHashSet<>();
    lhs.add(5);
    lhs.add(15);
    HashSet<Integer> hs = new HashSet<>(lhs);
    System.out.println(hs.size());
    // hs.add(10);
    // hs.add(5);
    // hs.add(10);
    // hs.add(6);
    Iterator<Integer> i = hs.iterator();
    // while(i.hasNext()){
    //   // System.out.println(i.next());
    // }
  }
}
