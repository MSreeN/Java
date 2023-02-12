// import java.util.Scanner;

// class Cylinder {
//     public Double radius;
//     public Double height = 1.0;

//     // public Double area() {
//     // return length * height;
//     // }

//     public double getRadius() {
//         return radius;
//     }

//     public void setRadius(Double radius) {
//         this.radius = radius;
//     }

//     public double getHeight() {
//         return height;
//     }

//     public void setHeight(Double height) {
//         this.height = height;
//     }

//     public void setDimensions(Double height, Double radius) {
//         this.height = height;
//     }

//     // public Double perimeter() {
//     // return 2 * (radius * height);
//     // }

//     // public boolean isSquare() {
//     // if (radius == height) {
//     // return true;
//     // } else {
//     // return false;
//     // }
//     // }

//     public Cylinder(Double radius, Double height) {
//         this.radius = radius;
//         this.height = height;
//     }

//     public Cylinder() {
//         radius = 0.0;
//         height = 0.0;
//     }

//     public Cylinder(Double radius) {
//         this.radius = radius;
//         // this.height = 1.0;
//     }
// }

// public class DataHiding {
//     public static void main(String[] args) {
//         Scanner s = new Scanner(System.in);

//         // Double l = s.nextDouble();
//         // Double b = s.nextDouble();

//         Cylinder dh = new Cylinder(5.0);
//         // dh.radius = 0.0;
//         // dh.height = 0.0;
//         // System.out.println(dh.area());

//         // dh.setheight(50);
//         // dh.setLength(20);
//         // System.out.println(dh.area());
//         System.out.println(dh.radius + " " + dh.height);
//     }
// }
// import java.util.Arrays;
// import java.util.Scanner;

// public class ProductnCustomer {
//     public static void main(String[] args) {
//         Subject subs[] = new Subject[3];
//         subs[0] = new Subject("101", "DS", 100.0);
//         subs[1] = new Subject("102", "java", 100.0);
//         subs[2] = new Subject("103", "Python", 100.0);
//         for (Subject subject : subs) {
//             System.out.println(subject);
//         }
//         // Student s = new Student("1", "Sree", "cse");
//         // System.out.println(s.getDept());
//         // System.out.println(s.getName());
//         // System.out.println(s.getRollNo());
//         // System.out.println(s.getSubjects());

//         // Subject s2[] = new Subject[2];
//         // s.setSubjects(s2);
//         // s2 = s.getSubjects();
//         // for (Subject subject : s2) {
//         // System.out.println(subject);
//         // }

//         Student s1 = new Student("1", "Sree", "Cse", subs);
//         Student s2 = new Student("2", "Mahesh", "It", subs);

//         System.out.println(s1);
//         System.out.println(s2);
//     }
// }

// class Subject {
//     private String subid;
//     private String name;
//     private Double maxMarks;
//     private Double marksObtain;

//     // public Double getMaxMarks() {
//     // return maxMarks;
//     // }

//     // public void setMaxMarks(Double maxMarks) {
//     // this.maxMarks = maxMarks;
//     // }

//     // public Double getMarksObtain() {
//     // return marksObtain;
//     // }

//     // public void setMarksObtain(Double marksObtain) {
//     // this.marksObtain = marksObtain;
//     // }

//     // public String getSubid() {
//     // return subid;
//     // }

//     // public String getName() {
//     // return name;
//     // }

//     public Subject(String subid, String name) {
//         this.subid = subid;
//         this.name = name;
//     }

//     public Subject(String subid, String name, Double maxMarks, Double marksObtain) {
//         this.subid = subid;
//         this.name = name;
//         this.maxMarks = maxMarks;
//         this.marksObtain = marksObtain;
//     }

//     Boolean isQualify(Double m) {
//         return m >= maxMarks;
//     }

//     @Override
//     public String toString() {
//         return "Subject [maxMarks=" + maxMarks + ", name=" + name + ", subid=" + subid + "]";
//     }

//     public Subject(String subid, String name, Double maxMarks) {
//         this.subid = subid;
//         this.name = name;
//         this.maxMarks = maxMarks;
//     }

// }

// class Student {
//     private String rollNo;
//     private String name;
//     private String dept;
//     private Subject subjects[];

//     public String getRollNo() {
//         return rollNo;
//     }

//     public String getName() {
//         return name;
//     }

//     public String getDept() {
//         return dept;
//     }

//     // public Subject[] getSubjects() {
//     // return subjects;
//     // }

//     // public void setSubjects(Subject... s) {
//     // subjects = new Subject[s.length];
//     // for (int i = 0; i < s.length; i++) {
//     // subjects[i] = s[i];
//     // }
//     // }

//     @Override
//     public String toString() {
//         return "Student [dept=" + dept + ", name=" + name + ", rollNo=" + rollNo + ", subjects="
//                 + Arrays.toString(subjects) + "]";
//     }

//     public Student(String rollNo, String name, String dept, Subject[] subjects) {
//         this.rollNo = rollNo;
//         this.name = name;
//         this.dept = dept;
//         this.subjects = subjects;
//     }

// }// import java.util.Arrays;
import java.util.Arrays;
import java.util.Scanner;

public class DataHiding {
    public static void main(String[] args) {
        Subject subs[] = new Subject[3];
        subs[0] = new Subject("101", "DS", 100.0);
        subs[1] = new Subject("102", "java", 100.0);
        subs[2] = new Subject("103", "Python", 100.0);
        for (Subject subject : subs) {
            System.out.println(subject);
        }
        // Student s = new Student("1", "Sree", "cse");
        // System.out.println(s.getDept());
        // System.out.println(s.getName());
        // System.out.println(s.getRollNo());
        // System.out.println(s.getSubjects());

        // Subject s2[] = new Subject[2];
        // s.setSubjects(s2);
        // s2 = s.getSubjects();
        // for (Subject subject : s2) {
        // System.out.println(subject);
        // }

        Student s1 = new Student("1", "Sree", "Cse", subs);
        Student s2 = new Student("2", "Mahesh", "It", subs);

        System.out.println(s1);
        System.out.println(s2);
    }
}

class Subject {
    private String subid;
    private String name;
    private Double maxMarks;
    private Double marksObtain;

    // public Double getMaxMarks() {
    // return maxMarks;
    // }

    // public void setMaxMarks(Double maxMarks) {
    // this.maxMarks = maxMarks;
    // }

    // public Double getMarksObtain() {
    // return marksObtain;
    // }

    // public void setMarksObtain(Double marksObtain) {
    // this.marksObtain = marksObtain;
    // }

    // public String getSubid() {
    // return subid;
    // }

    // public String getName() {
    // return name;
    // }

    public Subject(String subid, String name) {
        this.subid = subid;
        this.name = name;
    }

    public Subject(String subid, String name, Double maxMarks, Double marksObtain) {
        this.subid = subid;
        this.name = name;
        this.maxMarks = maxMarks;
        this.marksObtain = marksObtain;
    }

    Boolean isQualify(Double m) {
        return m >= maxMarks;
    }

    @Override
    public String toString() {
        return "Subject [maxMarks=" + maxMarks + ", name=" + name + ", subid=" + subid + "]";
    }

    public Subject(String subid, String name, Double maxMarks) {
        this.subid = subid;
        this.name = name;
        this.maxMarks = maxMarks;
    }

}

class Student {
    private String rollNo;
    private String name;
    private String dept;
    private Subject subjects[];

    // public String getRollNo() {
    // return rollNo;
    // }

    // public String getName() {
    // return name;
    // }

    // public String getDept() {
    // return dept;
    // }

    public Subject[] getSubjects() {
        return subjects;
    }

    public void setSubjects(Subject... s) {
        subjects = new Subject[s.length];
        for (int i = 0; i < s.length; i++) {
            subjects[i] = s[i];
        }
    }

    @Override
    public String toString() {
        return "Student [dept=" + dept + ", name=" + name + ", rollNo=" + rollNo + ", subjects="
                + Arrays.toString(subjects) + "]";
    }

    public Student(String rollNo, String name, String dept, Subject[] subjects) {
        this.rollNo = rollNo;
        this.name = name;
        this.dept = dept;
        setSubjects(subjects);
    }

}