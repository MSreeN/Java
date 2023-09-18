package Streams;

import java.util.stream.Stream;

public class StreamOfGenerateIterate {
    public static void main(String[] args) {
        ofMethod().forEach( System.out::println);
    }

    public static Stream ofMethod(){
        return Stream.of("hello", "world");
    }


}
