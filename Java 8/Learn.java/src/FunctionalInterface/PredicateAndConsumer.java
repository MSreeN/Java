package FunctionalInterface;

import data.StudentDataBase;

import java.util.function.BiConsumer;
import java.util.function.Predicate;

public class PredicateAndConsumer {
    Predicate<com.learnJava.data.Student> checkGrades  = student -> student.getGradeLevel() >=3;
    Predicate<com.learnJava.data.Student> checkGpa = student -> student.getGpa() >=3.9;

    BiConsumer<String, com.learnJava.data.Student> printNameActivities = (name, student) -> System.out.println(name +" "+ student.getActivities());



    public static void main(String[] args) {



    }
}
