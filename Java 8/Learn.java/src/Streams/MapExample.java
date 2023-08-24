package Streams;

import data.StudentDataBase;

import java.util.List;
import java.util.stream.Collectors;

public class MapExample {

    public static void main(String[] args) {
        System.out.println(getNamesList());
    }

    public static List<String> getNamesList(){
        return StudentDataBase.getAllStudents().stream().map(com.learnJava.data.Student::getName).collect(Collectors.toList());
    }
}
