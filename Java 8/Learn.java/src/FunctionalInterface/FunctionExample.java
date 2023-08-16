package FunctionalInterface;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public class FunctionExample {
    private static Function<String, String> upperFunction = name -> name.toUpperCase();
    private static Function<String, String> concatFunction = name -> name.concat("concat");

    private static Function<List<com.learnJava.data.Student>, Map<String, Double>> studentGradeMap = students ->{
        Map<String, Double> studentMap = new HashMap<>();
        students.forEach( student -> {
            if(PredicateExample.filterByGpa.test(student)) studentMap.put(student.getName(), student.getGpa())
        });
        return studentMap;
    };
    public static void main(String[] args) {
//        System.out.println(upperFunction.andThen(concatFunction).apply("java"));

    }
}
