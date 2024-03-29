package Collections;

import java.util.ArrayList;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LinkedListDemo {
  public static void main(String[] args) {
    LinkedList<String> placesToVisit = new LinkedList<>();

    placesToVisit.add("hyd");
    placesToVisit.add(0, "bza");
    placesToVisit.addFirst("bangalore");
    placesToVisit.addAll(new ArrayList<String>(List.of("hello")));
    
    // String first  = placesToVisit.element();
    // System.out.println(first);
    ListIterator<String> li = placesToVisit.listIterator();
    // while(li.hasNext()){
    //   // System.out.println(li.next());
    // }
    placesToVisit.push("nuz");
    placesToVisit.add("elr");
    placesToVisit.offer("last");
    placesToVisit.offer("sm");
    placesToVisit.offer("aa");
    // System.out.println(placesToVisit);
    placesToVisit.remove();
    // System.out.println(placesToVisit.isEmpty());
    int ind = placesToVisit.indexOf("hello");
    // System.out.println(ind);
    // System.out.println(placesToVisit.contains("bangalore"));
    // System.out.println(placesToVisit);

    // list iterator
    System.out.println(placesToVisit);
    ListIterator<String> iterator = placesToVisit.listIterator(1);
    String previousTown = placesToVisit.getFirst();
    while(iterator.hasNext()){
      var town = iterator.next();
      try{
        System.out.println("from --->" +previousTown + " to ---->" +town);
        previousTown = town;
        
      }
      catch(Exception e){
        System.out.println(e);
      }
    }
    
  }
}
