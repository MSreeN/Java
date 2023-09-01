package Streams;

import com.sun.jdi.IntegerType;

import java.util.Arrays;
import java.util.List;

public class ReduceExample {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,3, 5, 7);
        System.out.println(multiplication(list));
    }

    public static int multiplication(List<Integer> integerList){
        return integerList.stream().reduce(1, (acc, cVal) -> acc*cVal);
    }
}
