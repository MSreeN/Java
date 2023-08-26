package Streams;

import data.StudentDataBase;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MapExample {

    public static void main(String[] args) {
        System.out.println(sortedStudentsList());
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

    public static Long getCountAndSortedActivities(){
        return StudentDataBase.getAllStudents().stream().flatMap(s -> s.getActivities().stream())
                .distinct()
                .sorted()
                .count();
    }
    public static int compare(com.learnJava.data.Student s1, com.learnJava.data.Student s2){
        return -(s1.getGradeLevel() - s2.getGradeLevel());
    }


    public static List<com.learnJava.data.Student> sortedStudentsList(){
        return StudentDataBase.getAllStudents().stream().map(student -> student).sorted(MapExample::compare).collect(Collectors.toList());
    }
}
