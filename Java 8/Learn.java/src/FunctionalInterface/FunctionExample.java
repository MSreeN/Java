package FunctionalInterface;

import java.util.function.Function;

public class FunctionExample {
    private static Function<String, String> upperFunction = name -> name.toUpperCase();
    private static Function<String, String> concatFunction = name -> name.concat("concat");
    public static void main(String[] args) {
        System.out.println(upperFunction.andThen(concatFunction).apply("java"));
    }
}
