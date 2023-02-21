package Collections;

import java.util.ArrayDeque;

public class ArrayDequeDemo {
  public static void main(String[] args) {
    ArrayDeque<Integer> dq = new ArrayDeque();
    dq.offerFirst(5);
    dq.offerFirst(6);
    dq.offerLast(8);
    dq.pollFirst();
    dq.pollLast();
    dq.pollFirst();
    System.out.println(dq.isEmpty());
    System.out.println(dq.contains(5));
    System.out.println(dq);
  }
}
