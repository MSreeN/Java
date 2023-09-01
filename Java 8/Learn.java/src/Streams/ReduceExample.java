package Streams;

import com.sun.jdi.IntegerType;
import data.StudentDataBase;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ReduceExample {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,3, 5, 7);
//        System.out.println(multiplication(list));
        System.out.println(topStudent());
    }

    public static Optional<com.learnJava.data.Student> topStudent(){
        return StudentDataBase.getAllStudents().stream()
                .reduce((s1,s2) -> s1.getGpa()>s2.getGpa() ? s1 : s2);
    }

    public static int multiplication(List<Integer> integerList){
        return integerList.stream().reduce(1, (acc, cVal) -> acc*cVal);
    }
}
