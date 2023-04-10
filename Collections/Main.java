package Collections;

public class Main {
  public static void main(String[] args) {
    Theatre theatre = new Theatre("Olympian", 8, 12);
    theatre.getSeats();
    theatre.reserveSeat("H08");
    theatre.reserveSeat("H08");
    theatre.reserveSeat("A01");
    theatre.reserveSeat("A01");
    theatre.getTheatreName();
    theatre.reserveSeat("D04");
    theatre.reserveSeat("D04");
  }
}
