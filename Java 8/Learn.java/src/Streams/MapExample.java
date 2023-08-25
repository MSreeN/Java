package Streams;

import data.StudentDataBase;

import java.util.List;
import java.util.stream.Collectors;

public class MapExample {

    public static void main(String[] args) {
        System.out.println(getDistinctActivities());
    }

    public static List<String> getNamesList(){
        return StudentDataBase.getAllStudents().stream().map(com.learnJava.data.Student::getName).collect(Collectors.toList());
    }

    public static List<String> getActivities(){
        return StudentDataBase.getAllStudents().stream().flatMap(s -> s.getActivities().stream())
                .collect(Collectors.toList());
    }

    public static List<String> getDistinctActivities(){
        return StudentDataBase.getAllStudents().stream().flatMap(student -> student.getActivities().stream())
                .distinct()
                .collect(Collectors.toList());
    }

}
