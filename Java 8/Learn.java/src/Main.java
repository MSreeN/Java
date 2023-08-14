import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        //comparator using anonymous class
        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        };
//        System.out.println(comparator.compare(16,9));


        ////comparator using lambda expression

        Comparator<Integer> comparator1 = (a, b) -> a.compareTo(b);
//        System.out.println(comparator1.compare(6,5));
    }
}