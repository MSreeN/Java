package FunctionalInterface;

import data.StudentDataBase;

import java.util.List;
import java.util.function.BiConsumer;

public class BiConsumerExample {
    public static void main(String[] args) {
        printNameActivities();
    }

    public static void printNameActivities(){
        BiConsumer<String, List<String>> nameActivity = (name, activities) -> System.out.println(name + " "+activities);
        StudentDataBase.getAllStudents().forEach(student -> nameActivity.accept(student.getName(), student.getActivities()));
    }
}
