package Collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
  public static void main(String[] args) {
    LinkedList<String> placesToVisit = new LinkedList<>();
    placesToVisit.add("hyd");
    placesToVisit.add(0, "bza");
    placesToVisit.addFirst("bangalore");
    placesToVisit.addAll(new ArrayList<String>(List.of("hello")));
    int ind = placesToVisit.indexOf("hello");
    System.out.println(ind);
    System.out.println(placesToVisit.contains("bangalore"));
    System.out.println(placesToVisit);
  }
}
