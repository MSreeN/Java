// import java.util.Scanner;

import java.util.*;
// import java.util.regex.Pattern;

public class ListDemo {

    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        ArrayList<Integer> alc = new ArrayList<>(List.of(50, 60, 70, 80));
        al.add(10);
        al.add(0, 1);
        al.addAll(1, alc);
        // System.out.println(al);
        // ListIterator<Integer> itr = al.listIterator();
        // while (itr.hasNext()) {
        //     if (itr.next() == 60) {
        //         itr.previous();
        //         System.out.println(itr.previous());
        //         itr.set(100);

        //         break;
        //     }
        // }
        // System.out.println(al);
        al.forEach(System.out::println);
        
    }
}
