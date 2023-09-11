package Streams;

import com.sun.jdi.IntegerType;

import java.util.*;

public class StreamMinMaxExample {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(6,7,8,9,10);
        System.out.println(findMaxValue(nums));
        List<Integer> num = new ArrayList<>();
        Optional<Integer> opt = findMaxValueOptional(nums);
        if(opt.isPresent()){
            System.out.println(opt.get());
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
}
