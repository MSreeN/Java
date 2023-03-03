package Collections;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class ListDemo {
  public static void main(String[] args) {
    // ArrayList<String> al = new ArrayList<>();
    // al.add("hello");
    // al.add("b");
    // al.add("a");
    // al.sort(Comparator. naturalOrder());
    // // System.out.println(al);
    // Integer[] arr = {1,2,3};
    // var al1 = Arrays.asList(arr);
    // al1.set(0,5);
    // System.out.println(al1); 

    //challenge
    ArrayList<String> groceryList = new ArrayList<>();
    Scanner s = new Scanner(System.in);
    boolean stillUsing = true;
    while(stillUsing){
      System.out.println("----------------------------------------");
      System.out.println("0 - to shutdown \n1 - to add item(s) to list (comma delimited list) \n2 - to remove any items (comma delimited list)");
      String userOption = s.nextLine();
      if(userOption.equals("1")){
  
        String add = s.nextLine();
        String[] addItems = add.split(",");
        groceryList.addAll(Arrays.asList(addItems));
        groceryList.sort(Comparator.naturalOrder());
        System.out.println(groceryList);
      }
      else if(userOption.equals("2")){
        String remove = s.nextLine();
        String[] removeItems = remove.split(",");
        for(String ele: removeItems){
          if(groceryList.contains(ele)){
            groceryList.remove(ele);
          }
        }
        groceryList.sort(Comparator.naturalOrder());
        System.out.println(groceryList);
      }
      else if(userOption.equals("0")){
        stillUsing = false;
      }
      else{
        System.out.println("Selected option doesn't exist!");
      }
    }
    
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

  //   LinkedList<Integer> li1 = new LinkedList<>();
  //   LinkedList<Integer> li2 = new LinkedList<>(List.of(3, 4, 6));
  //   li1.add(5);
  //   li1.add(6);
  //   li1.addAll(0, li2);
  //   for (ListIterator<Integer> li = li1.listIterator(); li.hasNext();) {
  //     if (li.hasPrevious()) {
  //       System.out.println("previous element is " + li.previous());
  //       li.next();
  //     }
  //     System.out.println(li.next());
  //   }
  //   System.out.println(li1);
  }
}
