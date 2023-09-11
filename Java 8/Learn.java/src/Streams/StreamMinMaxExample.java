package Streams;

import java.util.Arrays;
import java.util.List;

public class StreamMinMaxExample {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(6,7,8,9,10);
        System.out.println(findMaxValue(nums));
    }

    public static int findMaxValue(List<Integer> nums){
        return nums.stream()
                .reduce(0,(acc, cVal) -> cVal > acc ? cVal : acc);
    }
}
