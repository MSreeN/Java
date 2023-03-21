package Collections;

import java.util.LinkedList;
import java.util.List;

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
    return "name= " + name + ", distance= " + distance;
  }
  
}

public class LinkedListChallange {
  public static void main(String[] args) {
    LinkedList<Place> placesToVisit = new LinkedList<>();
    Place vijayawada = new Place("vijayawada", 500);
    addPlace(vijayawada, placesToVisit);
    System.out.println(placesToVisit);
  }

  private static void addPlace(Place place, List<Place> list){
    if(list.contains(place)){
      return; 
    }
    list.add(place);
  }
}
