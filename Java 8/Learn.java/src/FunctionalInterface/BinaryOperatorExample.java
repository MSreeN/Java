package FunctionalInterface;

import java.util.Comparator;
import java.util.function.BinaryOperator;

public class BinaryOperatorExample {
    public static void main(String[] args) {
        Comparator<Integer> comparator = (a, b) -> a.compareTo(b);
        BinaryOperator<Integer> binaryOperator  = BinaryOperator.maxBy(comparator);
        BinaryOperator<Integer> minBy = BinaryOperator.minBy(comparator);
        System.out.println(minBy.apply(7,1));
        System.out.println(binaryOperator.apply(8,6));
    }
}
