package FunctionalInterface;

import data.StudentDataBase;

import java.util.List;
import java.util.function.Predicate;

public class PredicateExample {
    static Predicate<Integer> isEven  = a -> a%2 == 0;
    static Predicate<Integer> isOdd = a->{
        System.out.printf("second predicate");
        return a%2 !=0;
    };

    static Predicate<com.learnJava.data.Student> filterByGrade = student -> student.getGradeLevel()>=3;
    static Predicate<com.learnJava.data.Student> filterByGpa = student -> student.getGpa()>=3.9;

    public static void main(String[] args) {
//        predicateAndNegate();
//        predicateOr();
        filterStudent();
    }

    public static void predicateAndNegate(){
//        System.out.println(isEven.and(isOdd).negate().test(9));
        System.out.println(isEven.and(isOdd).test(8));
    }

    public static void predicateOr(){
        System.out.println(isEven.or(isOdd).test(3));
    }

    public static void filterStudent(){
        List<com.learnJava.data.Student> allStudents = StudentDataBase.getAllStudents();
        allStudents.forEach(student -> {
            if(filterByGrade.or(filterByGpa).test(student)){
                System.out.println(student);
            }
        });
    }

}
