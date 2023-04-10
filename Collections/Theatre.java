package Collections;

import java.util.ArrayList;
import java.util.List;

public class Theatre {
  private final String theatreName;
  private List<Seat> seats = new ArrayList<>();

  public Theatre(String theatreName, int numRows, int seatsPerRow){
    this.theatreName = theatreName;
    int lastRow = 'A'+ (numRows - 1);
    for(char row = 'A'; row <= lastRow; row++){
      for(int seatNum = 1; seatNum <= seatsPerRow; seatNum++){
        Seat seat = new Seat(row + String.format("%02d", seatNum));
        seats.add(seat);
      }
    }

  }
  public void getTheatreName() {
    System.out.println(this.theatreName);
  }
  public boolean reserveSeat(String seatNum){
    Seat requestedSeat = null;
    for(Seat seat: seats){
      if(seat.getSeatNumber().equals(seatNum)){
        requestedSeat = seat;
        break;
      } 
    }
    if(requestedSeat == null){
      System.out.println("There is no seat "+ seatNum);
      return false;
    }
    else{
      
      return requestedSeat.reserve();
    }
  }
  public void getSeats(){
    for(Seat seat : seats){
      System.out.println(seat.getSeatNumber());
    }
  }
}

class Seat implements Comparable<Seat>{
  private final String seatNumber;
  private boolean reserved = false;
  
  public Seat(String seatNumber){
    this.seatNumber = seatNumber;
  }

  //Overriding compareTo method of Comparable interface 
  public int compareTo(Seat seat){
    return 0;
  }

  public String getSeatNumber() {
    return seatNumber;
  }

  public boolean reserve(){
    if(!this.reserved){
      this.reserved = true;
      System.out.println("Please Pay");
      System.out.println("Seat " +seatNumber+ " reserved");
      return true;
    }
    else{
      System.out.println("Seat is already taken");
      return false;
    }
  }

  public boolean cancel(){
    if(this.reserved){
      this.reserved = false;
      System.out.println("Reservation of seat "+ seatNumber+ " cancelled.");
      return false;
    }
    else{
      return true;
    }
  }
}
