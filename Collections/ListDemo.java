package Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListDemo {
  public static void main(String[] args) {
    // ArrayList
    // ArrayList<Integer> al1 = new ArrayList<>();
    // ArrayList<Integer> al2 = new ArrayList<>(List.of(5, 6, 7, 8,9,10));
    // al1.add(6);
    // al1.addAll(0, al2);
    // // al1.add(2,5);

    // // al1.removeIf(n -> (n % 2 == 0));
    // al1.remove(3);
    // // System.out.println(al1);
    // // using for each loop, u can use var instead of Integer
    // // for (Integer integer : al2) {
    // // System.out.println(integer);
    // // }

    // // Foreach loop is in js
    // // al1.forEach(ele -> System.out.println(ele));

    // System.out.println(al1.contains(5));

    // // accessing arraylist elements using iterator
    // for (Iterator<Integer> ele = al1.iterator(); ele.hasNext();) {
    // System.out.println(ele.next());
    // }

    // System.out.println("using list iterator");
    // ListIterator<Integer> li = al1.listIterator();
    // while (li.hasNext()) {
    // // li.previous();
    // if (li.hasPrevious()) {
    // System.out.println("previous element is " + li.previous());
    // li.next();
    // } else {
    // System.out.println("no previous element");
    // }

    // System.out.println(li.next());
    // }

    ///////// Linked list

    LinkedList<Integer> li1 = new LinkedList<>();
    LinkedList<Integer> li2 = new LinkedList<>(List.of(3, 4, 6));
    li1.add(5);
    li1.add(6);
    li1.addAll(0, li2);
    for (ListIterator<Integer> li = li1.listIterator(); li.hasNext();) {
      if (li.hasPrevious()) {
        System.out.println("previous element is " + li.previous());
        li.next();
      }
      System.out.println(li.next());
    }
    System.out.println(li1);
  }
}
