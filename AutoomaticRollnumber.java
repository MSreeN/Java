

import java.time.LocalDate;
import java.time.Year;
import java.util.Calendar;
import java.util.Date;


public class AutoomaticRollnumber {
    public static void main(String[] args) {
        
    
        StudentId s1= new StudentId("Sree","rjy");
        s1.studentDetails();
        StudentId s2 = new StudentId("Mahesh","hyd");
        s2.studentDetails();
    }
    
}

class StudentId{
    private String rollno;
    private String name;
    private String city; 
    static private int count = 1;
    void studentDetails(){
        System.out.println(rollno);
        System.out.println(this.name);
        System.out.println(this.city);
        
    }
    private String getId(){
        Date d=new Date();
        // LocalDate year= LocalDate();
        int year = Year.now().getValue();
        String roll = "aec"+year+String.valueOf(count++);
        return roll;
    }
    StudentId(String name, String city){
        rollno = getId();
        this.name = name;
        this.city = city;
    }
}
