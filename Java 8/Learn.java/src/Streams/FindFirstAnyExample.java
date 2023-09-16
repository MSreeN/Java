package Streams;

import com.learnJava.data.Student;
import data.StudentDataBase;

import java.util.Optional;

public class FindFirstAnyExample {
    public static void main(String[] args) {
        System.out.println(findAny());
    }

    public static Optional<Student> findFirst(){
        return StudentDataBase.getAllStudents().stream()
                .filter(s -> s.getGpa() > 3.8)
                .findFirst();
    }

    public static Optional<Student> findAny(){
        return StudentDataBase.getAllStudents().stream()
                .filter(s -> s.getGpa() > 3.8)
                .findAny();
    }
}
