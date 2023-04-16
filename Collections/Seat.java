package Collections;

public class Seat implements Comparable<Seat>{
  private final String seatNumber;
  private boolean reserved = false;
  
  public Seat(String seatNumber){
    this.seatNumber = seatNumber;
  }

  //Overriding compareTo method of Comparable interface 
  public int compareTo(Seat seat){
    return this.getSeatNumber().compareTo(seat.getSeatNumber());
  }

  public String getSeatNumber() {
    return seatNumber;
  }

  public boolean reserve(){
    if(!this.reserved){
      this.reserved = true;
      System.out.println("Please `");
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