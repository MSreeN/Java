package FunctionalInterface;

public class UnaryOperator {
    public static void main(String[] args) {
        //input and output type of below unaryOperator is of type string
        java.util.function.UnaryOperator<String> unaryOperator = s -> s.toUpperCase();
        System.out.println(unaryOperator.apply("hello"));
    }
}
