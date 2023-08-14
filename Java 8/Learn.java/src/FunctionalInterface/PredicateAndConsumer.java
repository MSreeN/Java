package FunctionalInterface;

import data.StudentDataBase;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class PredicateAndConsumer {
    Predicate<com.learnJava.data.Student> checkGrades  = student -> student.getGradeLevel() >=3;
    Predicate<com.learnJava.data.Student> checkGpa = student -> student.getGpa() >=3.9;

    BiConsumer<String, List<String>> printNameActivities = (name, student) -> System.out.println(name +" "+ student);

     Consumer<com.learnJava.data.Student> studentConsumer = student -> {
        if(checkGrades.and(checkGpa).test(student)) {
            printNameActivities.accept(student.getName(), student.getActivities());
        }
    };

    public  void printNameActivities(){
        StudentDataBase.getAllStudents().forEach(studentConsumer);
    }


    public static void main(String[] args) {

        new PredicateAndConsumer().printNameActivities();

    }
}
