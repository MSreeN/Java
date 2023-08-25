package FunctionalInterface;

import data.StudentDataBase;
import com.learnJava.data.Student;

import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

class Sort implements Comparator<Student>{

    @Override
    public int compare(Student o1, Student o2) {
        return o1.getGradeLevel() - o2.getGradeLevel();
    }
}

public class ConsumerExample {
   private static Consumer<Student> studentName = student -> System.out.print(student.getName());
   private static Consumer<Student> studentActivities = student -> System.out.println(student.getActivities());
   private static Consumer<String> andThenTest1 = string -> System.out.println(string.toUpperCase());
   private static Consumer<String> andThenTest2 = string -> System.out.println(string.concat(" second consumer"));
    public static void main(String[] args) {
        Consumer<String> consumer = (s) -> s.toUpperCase();

//        consumer.accept("hello");
        Consumer<com.learnJava.data.Student> studentConsumer = (student) -> System.out.println(student.getName());
        List<Student> students = StudentDataBase.getAllStudents();
//        students.forEach(studentConsumer);
//        printNameActivities();
        gradeFiltering();
        //findings: java is first passed to first consumer and then second, not like output of first consumer is passed to second
        andThenTest1.andThen(andThenTest2).accept("java");
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
