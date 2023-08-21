package Streams;

import data.StudentDataBase;

import java.util.stream.Collectors;

public class StreamExample {
    public static void main(String[] args) {
        System.out.println(StudentDataBase.getAllStudents().stream().filter(student -> student.getGpa()>3).collect(Collectors.toMap(com.learnJava.data.Student)));
    }
}
