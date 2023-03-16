package Collections;

import java.util.LinkedList;

public class LinkedListDemo {
  public static void main(String[] args) {
    LinkedList<String> placesToVisit = new LinkedList<>();
    placesToVisit.add("hyd");
    placesToVisit.add(0, "bza");
    placesToVisit.addFirst("bangalore");
    System.out.println(placesToVisit);
  }
}
