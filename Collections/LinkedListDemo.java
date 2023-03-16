package Collections;

import java.util.LinkedList;

public class LinkedListDemo {
  public static void main(String[] args) {
    LinkedList<String> placesToVisit = new LinkedList<>();
    placesToVisit.add("hyd");
    placesToVisit.add(3, "bza");
    System.out.println(placesToVisit);
  }
}
