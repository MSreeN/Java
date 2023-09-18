package Streams;

import java.util.stream.Stream;

public class StreamOfGenerateIterate {
    public static void main(String[] args) {
//        ofMethod().forEach( System.out::println);
        iterateMethod().limit(10).forEach(System.out::println);
    }

    public static Stream ofMethod(){
        return Stream.of("hello", "world");
    }

    public static Stream iterateMethod(){
        return Stream.iterate( 1, x->x*2);
    }
}
