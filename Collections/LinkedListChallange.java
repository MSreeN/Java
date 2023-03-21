package Collections;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

class Place  {
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
    LinkedList<Place> placesToVisit = new LinkedList<>();
    Place vijayawada = new Place("vijayawada", 500);
    addPlace(vijayawada, placesToVisit);
    addPlace(new Place("vijayawada", 500), placesToVisit);
    addPlace(new Place("eluru", 400), placesToVisit);
    addPlace(new Place("vizag", 4), placesToVisit);
    addPlace(new Place("bangalore", 1), placesToVisit);

    System.out.println(placesToVisit);
  }

  private static void addPlace(Place place, List<Place> list){
    if(list.contains(place)){
      System.out.println("duplicate record found "+ place);
      return; 
    }
    for (Place place2 : list) {
      if(place.getName().equalsIgnoreCase(place2.getName())){
        System.out.println("duplicate record found "+ place);
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
}
