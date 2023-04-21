package Collections;

import java.util.Stack;

public class StackDemo {
  public static void main(String[] args) {
    Stack s = new Stack<>();
    s.add(10);
    s.add(20);
    s.add(6);
    s.add(3);
    s.add(23);

    System.out.println(s.get(0));
  }
}
