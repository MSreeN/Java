package Streams;

import com.sun.jdi.IntegerType;

import javax.swing.text.html.Option;
import java.util.*;

public class StreamMinMaxExample {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(6,7,8,9,10);
        System.out.println(findMaxValue(nums));
        List<Integer> num = new ArrayList<>();
        Optional<Integer> opt = findMaxValueOptional(nums);
        Optional<Integer> opt2 = findMinValue(nums);
        if(opt2.isPresent()){
            System.out.println(opt2.get());
        }
        else{
            System.out.println("List is empty");
        }
    }

    public static int findMaxValue(List<Integer> nums){
        return nums.stream()
                .reduce(0,(acc, cVal) -> cVal > acc ? cVal : acc);
    }

    public static Optional<Integer> findMaxValueOptional(List<Integer> nums){
        return nums.stream()
                .reduce((acc, cVal) -> cVal > acc ? cVal : acc);
    }

    public static Optional<Integer> findMinValue(List<Integer> num){
        return num.stream()
                .reduce((acc, cVal) -> cVal > acc ? acc : cVal);
    }
}
