package Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamLimitSkipExample {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(5, 6, 7, 8, 9, 10);
        System.out.println(skip(nums));
    }

    public static List<Integer> limit(List<Integer> nums){
        return nums.stream().limit(5).collect(Collectors.toList());
    }

    public static List<Integer> skip(List<Integer> nums){
        return nums.stream().skip(3).collect(Collectors.toList());
    }


}
