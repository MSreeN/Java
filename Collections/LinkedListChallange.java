package Collections;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

class Place{
  private String name;
  private int distance;
  
  public Place(String name, int distance) {
    this.name = name;
    this.distance = distance;
  }
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public int getDistance() {
    return distance;
  }
  public void setDistance(int distance) {
    this.distance = distance;
  }
  @Override
  public String toString() {
    return "\nname= " + name + ", distance= " + distance;
  }


  
}



public class LinkedListChallange {
  public static void main(String[] args) {
    Scanner s =  new Scanner(System.in);
    LinkedList<Place> placesToVisit = new LinkedList<>();
    Place vijayawada = new Place("d", 500);
    addPlace(vijayawada, placesToVisit);
    addPlace(new Place("c", 400), placesToVisit);
    addPlace(new Place("b", 4), placesToVisit);
    addPlace(new Place("a", 1), placesToVisit);

    System.out.println(placesToVisit);
    printMenu();
    boolean quitLoop = false;
    boolean forward = false;
    ListIterator<Place> li = placesToVisit.listIterator();
    while(!quitLoop){
      if(!li.hasPrevious()){
        System.out.println("Originating : "+ li.next());
        forward = true;
      }
      if(!li.hasNext()){
        System.out.println("Final : " + li.previous());
        forward = false;
      }
      String userOption = s.nextLine().toUpperCase().substring(0,1);
      switch(userOption){
        case "F": 
        if(!forward){
          forward = true;
          if(li.hasNext()){li.next();
          }
        }
        System.out.println("User wants to go forward");
        if(li.hasNext()) System.out.println(li.next());
        break;
        case "B" : 
        if(forward){
          forward = false;
          if(li.hasPrevious()) li.previous();
        }
        System.out.println("User wants to go backward");
        if(li.hasPrevious()) System.out.println(li.previous());
        break;
        default : quitLoop = true;
      }
    }
  }

  private static void addPlace(Place place, List<Place> list){
    if(list.contains(place)){
      // System.out.println("duplicate record found "+ place);
      return; 
    }
    for (Place place2 : list) {
      if(place.getName().equalsIgnoreCase(place2.getName())){
        // System.out.println("duplicate record found "+ place);
        return;
      }
    }
    ListIterator<Place> listIterator = list.listIterator();
    while(listIterator.hasNext()){
      Place curPlace = listIterator.next();
      if(place.getDistance() < curPlace.getDistance()){
        listIterator.previous();
        listIterator.add(place);
        return;
      }
    }
    list.add(place);
  }

  private static void printMenu(){
    System.out.println("Available actions (select word or letter)\n (F)orward \n (B)ackward\n (L)ist places\n (M)enu\n (Q)uit:");

  }
}
