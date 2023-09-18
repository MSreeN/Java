package Streams;

import java.util.function.Supplier;
import java.util.stream.Stream;

public class StreamOfGenerateIterate {
    public static void main(String[] args) {
//        ofMethod().forEach( System.out::println);
//        iterateMethod().limit(10).forEach(System.out::println);
        generate().limit(10).forEach(System.out::println);
    }

    public static Stream ofMethod(){
        return Stream.of("hello", "world");
    }

    public static Stream iterateMethod(){
        return Stream.iterate( 1, x->x*2);
    }

    public static Stream generate(){
        return Stream.generate(new Supplier<Object>() {

            @Override
            public Object get() {
                return Math.ceil(Math.random()* 5);
            }
        });
    }

}
