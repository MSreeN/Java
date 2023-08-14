package FunctionalInterface;

import data.StudentDataBase;
import com.learnJava.data.Student;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {
   private static Consumer<Student> studentName = student -> System.out.print(student.getName());
   private static Consumer<Student> studentActivities = student -> System.out.println(student.getActivities());
    public static void main(String[] args) {
        Consumer<String> consumer = (s) -> System.out.println(s.toUpperCase());

//        consumer.accept("hello");
        Consumer<com.learnJava.data.Student> studentConsumer = (student) -> System.out.println(student.getName());
        List<Student> students = StudentDataBase.getAllStudents();
//        students.forEach(studentConsumer);
//        printNameActivities();
        gradeFiltering();
    }

    public static void printNameActivities(){
        StudentDataBase.getAllStudents().forEach(studentName.andThen(studentActivities));
    }

    public static void gradeFiltering(){
        Consumer<Student> gradeFilter = student ->{
            if(student.getGradeLevel() > 2) studentName.andThen(studentActivities).accept(student);
        };
        StudentDataBase.getAllStudents().forEach(gradeFilter);
    }

}
