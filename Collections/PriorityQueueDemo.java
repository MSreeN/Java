package Collections;

import java.util.Comparator;
import java.util.PriorityQueue;

class MyComp implements Comparator<Integer>{
  public int compare(Integer a , Integer b){
    if(a<b) return -1;
    if(a>b) return 1;
    return 0;
  }
}

public class PriorityQueueDemo {
  public static void main(String[] args) {
    PriorityQueue<Integer> pq = new PriorityQueue<>(new MyComp());
    pq.add(5);
    pq.add(8);
    pq.add(1);
    pq.add(2);
    pq.add(9);
    pq.remove();
    pq.forEach((ele) -> System.out.println(ele));
  }
}
