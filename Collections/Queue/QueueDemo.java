package Collections.Queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {
  public static void main(String[] args) {
    
    Queue<Integer> q = new PriorityQueue<>();
    q.add(9);
    q.add(8);
    q.add(6);
    
    
    System.out.println(q);
  }
}
