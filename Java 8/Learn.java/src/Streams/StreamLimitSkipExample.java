package Streams;

import javax.swing.text.html.Option;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamLimitSkipExample {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(5, 6, 7, 8, 9, 10);
        Optional<Integer> limit = skip(nums);
        if(limit.isPresent()){
            System.out.println(limit.get());
        }
        else System.out.println("list is empty");
    }

    public static Optional<Integer> limit(List<Integer> nums){
        return nums.stream().limit(5)
                .reduce((acc, cVal) -> acc+cVal);

    }

    public static Optional<Integer> skip(List<Integer> nums){
        return nums.stream().skip(3).reduce((acc,cVal) -> acc+cVal);
    }


}
