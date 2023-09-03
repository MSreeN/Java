package Streams;

import com.sun.jdi.IntegerType;
import data.StudentDataBase;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ReduceExample {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,3, 5, 7);
        List<Character> charList = Arrays.asList('a', 'b', 'C');
//        System.out.println(multiplication(charList));
        System.out.println(topStudent());
    }

    public static Optional<com.learnJava.data.Student> topStudent(){
//        return StudentDataBase.getAllStudents().stream()
//                .reduce((s1,s2) -> s1.getGpa()>s2.getGpa() ? s1 : s2);
        return StudentDataBase.getAllStudents().stream()
                .reduce((s1,s2) ->{
                   if(s1.getGradeLevel() > s2.getGradeLevel()) return s1;
                   else  return s2;
                });
    }

    public static int multiplication(List<Integer> integerList){
        return integerList.stream().reduce(1, (acc, cVal) -> acc*cVal);

    }
}
