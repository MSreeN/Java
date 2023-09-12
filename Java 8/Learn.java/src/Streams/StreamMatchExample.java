package Streams;

import data.StudentDataBase;

import java.util.function.Predicate;

public class StreamMatchExample {
    public static void main(String[] args) {
        Predicate<com.learnJava.data.Student> studentPredicate = student -> student.getGpa()<=4;
        System.out.println(allMatch(studentPredicate));
    }

    public static Boolean anyMatch(Predicate<com.learnJava.data.Student> predicate){

        return StudentDataBase.getAllStudents().stream().anyMatch(predicate);
    }

    public static Boolean allMatch(Predicate<com.learnJava.data.Student> predicate){
        return StudentDataBase.getAllStudents().stream().allMatch(predicate);
    }
}
