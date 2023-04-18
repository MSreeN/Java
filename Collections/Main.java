package Collections;

import java.util.ArrayList;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    Theatre theatre = new Theatre("Olympian", 8, 12);
    // theatre.getSeats();
    // theatre.reserveSeat("H08");
    // theatre.reserveSeat("H08");
    // theatre.reserveSeat("A01");
    // theatre.reserveSeat("A01");
    // theatre.getTheatreName();
    // theatre.reserveSeat("D04");
    // theatre.reserveSeat("D04");
    // theatre.reserveSeat("B05");
    // theatre.reserveSeat("B07");
    // theatre.reserveSeat("B05");
    // printList(theatre.seats);

    
    //shallow copy of seats in theatre class, references in the seatCopy point to same objects that references in the seats point to.
    List<Theatre.Seat> seatCopy = new ArrayList<>(theatre.seats);
    // printList(seatCopy);
    seatCopy.get(1).reserve();
    if(theatre.reserveSeat("A02")){
      System.out.println("Please Pay");
    }
    else{
      System.out.println("Seat already reserved");
    }
  }

  public static void printList(List<Theatre.Seat> list){
    for(Theatre.Seat seat : list){
      System.out.print(" "+ seat.getSeatNumber());
      System.out.print(",");

    }
  }
}
