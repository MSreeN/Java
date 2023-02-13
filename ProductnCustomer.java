

// // import java.util.Arrays;
// // import java.util.Scanner;

// // public class ProductnCustomer {
// //     public static void main(String[] args) {
// //         Subject subs[] = new Subject[3];
// //         subs[0] = new Subject("101", "DS", 100.0);
// //         subs[1] = new Subject("102", "java", 100.0);
// //         subs[2] = new Subject("103", "Python", 100.0);
// //         for (Subject subject : subs) {
// //             System.out.println(subject);
// //         }
// //         // Student s = new Student("1", "Sree", "cse");
// //         // System.out.println(s.getDept());
// //         // System.out.println(s.getName());
// //         // System.out.println(s.getRollNo());
// //         // System.out.println(s.getSubjects());

// //         // Subject s2[] = new Subject[2];
// //         // s.setSubjects(s2);
// //         // s2 = s.getSubjects();
// //         // for (Subject subject : s2) {
// //         // System.out.println(subject);
// //         // }

// //         Student s1 = new Student("1", "Sree", "Cse", subs);
// //         Student s2 = new Student("2", "Mahesh", "It", subs);

// //         System.out.println(s1);
// //         System.out.println(s2);
// //     }
// // }

// // class Subject {
// //     private String subid;
// //     private String name;
// //     private Double maxMarks;
// //     private Double marksObtain;

// //     // public Double getMaxMarks() {
// //     // return maxMarks;
// //     // }

// //     // public void setMaxMarks(Double maxMarks) {
// //     // this.maxMarks = maxMarks;
// //     // }

// //     // public Double getMarksObtain() {
// //     // return marksObtain;
// //     // }

// //     // public void setMarksObtain(Double marksObtain) {
// //     // this.marksObtain = marksObtain;
// //     // }

// //     // public String getSubid() {
// //     // return subid;
// //     // }

// //     // public String getName() {
// //     // return name;
// //     // }

// //     public Subject(String subid, String name) {
// //         this.subid = subid;
// //         this.name = name;
// //     }

// //     public Subject(String subid, String name, Double maxMarks, Double marksObtain) {
// //         this.subid = subid;
// //         this.name = name;
// //         this.maxMarks = maxMarks;
// //         this.marksObtain = marksObtain;
// //     }

// //     Boolean isQualify(Double m) {
// //         return m >= maxMarks;
// //     }

// //     @Override
// //     public String toString() {
// //         return "Subject [maxMarks=" + maxMarks + ", name=" + name + ", subid=" + subid + "]";
// //     }

// //     public Subject(String subid, String name, Double maxMarks) {
// //         this.subid = subid;
// //         this.name = name;
// //         this.maxMarks = maxMarks;
// //     }

// // }

// // class Student {
// //     private String rollNo;
// //     private String name;
// //     private String dept;
// //     private Subject subjects[];

// //     public String getRollNo() {
// //         return rollNo;
// //     }

// //     public String getName() {
// //         return name;
// //     }

// //     public String getDept() {
// //         return dept;
// //     }

// //     // public Subject[] getSubjects() {
// //     // return subjects;
// //     // }

// //     // public void setSubjects(Subject... s) {
// //     // subjects = new Subject[s.length];
// //     // for (int i = 0; i < s.length; i++) {
// //     // subjects[i] = s[i];
// //     // }
// //     // }

// //     @Override
// //     public String toString() {
// //         return "Student [dept=" + dept + ", name=" + name + ", rollNo=" + rollNo + ", subjects="
// //                 + Arrays.toString(subjects) + "]";
// // //     }

// // //     public Student(String rollNo, String name, String dept, Subject[] subjects) {
// // //         this.rollNo = rollNo;
// // //         this.name = name;
// // //         this.dept = dept;
// // //         this.subjects = subjects;
// // //     }

// // // }
// // class Subject {

// //     private String subid;

// //     private String name;

// //     private int maxMarks;

// //     private int marksObt;

// //     public Subject(String id, String name, int maxMarks) {

// //         subid = id;

// //         this.name = name;

// //         this.maxMarks = maxMarks;

// //     }

// //     public Subject(String id, String name, int maxMarks, int marks) {

// //         subid = id;

// //         this.name = name;

// //         this.maxMarks = maxMarks;

// //         setMarksObt(marks);

// //     }

// //     public String getSubID() {

// //         return subid;

// //     }

// //     public String getName() {

// //         return name;

// //     }

// //     public int getMaxMarks() {

// //         return maxMarks;

// //     }

// //     public int getMarksObt() {

// //         return marksObt;

// //     }

// //     public void setMarksObt(int marks) {

// //         marksObt = marks;

// //     }

// //     boolean isQualified() {

// //         return marksObt >= maxMarks * 0.4;

// //     }

// //     public String toString() {

// //         System.out.println("Subject:");

// //         return "SubjectId:" + subid + "\nName:" + name + "\nMax Marks:"

// //                 + maxMarks + "\nMarks obtained:" + marksObt + "\n";

// //     }

// // }

// // class Student {

// //     private int rollNo;

// //     private String name;

// //     private String dept;

// //     private Subject[] subjects;

// //     public Student(int roll, String name, String dept) {

// //         rollNo = roll;

// //         this.name = name;

// //         this.dept = dept;

// //         subjects = new Subject[0];

// //     }

// //     public Student(int roll, String name, String dept, Subject[] subs) {

// //         rollNo = roll;

// //         this.name = name;

// //         this.dept = dept;

// //         setSubjects(subs);

// //     }

// //     public int getRollNo() {

// //         return rollNo;

// //     }

// //     public String getName() {

// //         return name;

// //     }

// //     public String getDept() {

// //         return dept;

// //     }

// //     public Subject[] getSubjects() {

// //         return subjects;

// //     }

// //     public void setSubjects(Subject... s) {

// //         subjects = new Subject[s.length];

// //         for (int i = 0; i < s.length; i++)

// //         {

// //             subjects[i] = s[i];

// //         }

// //     }

// //     public String toString() {

// //         System.out.println("Student Details");

// //         System.out.println("RollNo:" + rollNo + "\nName:" + name + "\nDept:" + dept);

// //         if (subjects.length == 0)
// //             System.out.println("No Subjects");

// //         else {

// //             for (Subject s : subjects) {

// //                 System.out.println(s);

// //             }

// //         }

// //         return "";

// //     }

// // }

// // public class ProductnCustomer {

// //     public static void main(String args[]) {

// //         // TODO Auto-generated method stub

// //         Subject s[] = new Subject[2];

// //         s[0] = new Subject("s101", "DS", 100);

// //         s[1] = new Subject("s102", "Algos", 100);

// //         for (Subject ss : s)
// //             System.out.println(ss);

// //         Student stud1 = new Student(1, "Jack", "CS");

// //         Student stud2 = new Student(1, "Ben", "IT", s);

// //         System.out.println(stud1);

// //         System.out.println(stud2);

// //     }

// // }


// // class Product{
// //     private String itemNo;
// //     private String name;
// //     private float price;
// //     private int qty;
// //     public String getItemNo() {
// //         return itemNo;
// //     }
// //     public String getName() {
// //         return name;
// //     }
// //     public void setName(String name) {
// //         this.name = name;
// //     }
// //     public void setPrice(float price) {
// //         this.price = price;
// //     }
// //     public void setQty(int qty) {
// //         this.qty = qty;
// //     }
// //     public float getPrice() {
// //         return price;
// //     }
// //     public int getQty() {
// //         return qty;
// //     }
    
// //     public Product(String itemNo, String name) {
// //         this.itemNo = itemNo;
// //         this.name = name;
// //     }
// //     public Product(String itemNo, String name, float price, int qty) {
// //         this.itemNo = itemNo;
// //         this.name = name;
// //         this.price = price;
// //         this.qty = qty;
// //     }
    
// // }

// // class Customer{
// //     private String custId;
// //     private String name;
// //     private String address;
// //     private String phNo;
// //     public String getCustId() {
// //         return custId;
// //     }
// //     public String getName() {
// //         return name;
// //     }
// //     public String getAddress() {
// //         return address;
// //     }
// //     public String getPhNo() {
// //         return phNo;
// //     }
// //     public void setName(String name) {
// //         this.name = name;
// //     }
// //     public void setAddress(String address) {
// //         this.address = address;
// //     }
// //     public void setPhNo(String phNo) {
// //         this.phNo = phNo;
// //     }
// //     public Customer(String custId, String name, String phNo) {
// //         this.custId = custId;
// //         this.name = name;
// //         this.phNo = phNo;
// //     }
    
    
// // }

// class ProductCustomer{
//     public static void main(String[] args) 
//     {
//         Subject subs[]=new Subject[3];
//         subs[0]=new Subject("s101","DS",100);
//         subs[1]=new Subject("s102","Algorithms",100);
//         subs[2]=new Subject("s103","Operating Systems",100);
        
//         for(Subject s:subs)
//             System.out.println(s);
//     }
// }


// // class Subject{
// //     private String subId;
// //     private String name;
// //     private float maxMarks;
// //     private float marksObtain;
// //     public String getSubId() {
// //         return subId;
// //     }
// //     public String getName() {
// //         return name;
// //     }
// //     public float getMaxMarks() {
// //         return maxMarks;
// //     }
// //     public float getMarksObtain() {
// //         return marksObtain;
// //     }
// //     public void setMaxMarks(float maxMarks) {
// //         this.maxMarks = maxMarks;
// //     }
// //     public void setMarksObtain(float marksObtain) {
// //         this.marksObtain = marksObtain;
// //     }
    
// //     public Subject(String subId, String name) {
// //         this.subId = subId;
// //         this.name = name;
// //     }
// //     public Subject(String subId, String name, float maxMarks) {
// //         this.subId = subId;
// //         this.name = name;
// //         this.maxMarks = maxMarks;
// //     }
// //     public Subject(String subId, String name, float maxMarks, float marksObtain) {
// //         this.subId = subId;
// //         this.name = name;
// //         this.maxMarks = maxMarks;
// //         this.marksObtain = marksObtain;
// //     }

// //      public boolean isQualified(){
// //         return marksObtain>=maxMarks/10*4;
// //      }
// //     @Override
// //     public String toString() {
// //         return "Subject [subId=" + subId + ", name=" + name + ", marksObtain=" + marksObtain + "]";
// //     }

     
// // }




// class Subject
// {
//     private String subID;
//     private String name;
//     private int maxMarks;
//     private int marksObtains;
    
//     public Subject(String subID,String name,int maxMarks)
//     {
//         this.subID=subID;
//         this.name=name;
//         this.maxMarks=maxMarks;
//     }
    
//     public String getSubID(){return subID;}
//     public String getName(){return name;}
//     public int getMaxMarks(){return maxMarks;}
//     public int getMarksObtains(){return marksObtains;}
    
//     public void setMaxMarks(int mm)
//     {
//         maxMarks=mm;
//     }
    
//     public void setMarksObtain(int m)
//     {
//         marksObtains=m;
//     }
    
//     boolean isQualified()
//     {
//         return marksObtains>=maxMarks/10*4;
//     }
    
//     public String toString()
//     {
//         return"\n SubjectID: "+subID+"\n Name "+name+"\n MarksObtained "+marksObtains;
//     }
    
// }



class Subject
{
    private String subID;
    private String name;
    private int maxMarks;
    private int marksObtains;
    
    public Subject(String subID,String name,int maxMarks)
    {
        this.subID=subID;
        this.name=name;
        this.maxMarks=maxMarks;
    }
    
    public String getSubID(){return subID;}
    public String getName(){return name;}
    public int getMaxMarks(){return maxMarks;}
    public int getMarksObtains(){return marksObtains;}
    
    public void setMaxMarks(int mm)
    {
        maxMarks=mm;
    }
    
    public void setMarksObtain(int m)
    {
        marksObtains=m;
    }
    
    boolean isQualified()
    {
        return marksObtains>=maxMarks/10*4;
    }
    
    public String toString()
    {
        return"\n SubjectID: "+subID+"\n Name "+name+"\n MarksObtained "+marksObtains;
    }
    
}

class ProductCustomer {

    public static void main(String[] args) 
    {
        Subject subs[]=new Subject[3];
        subs[0]=new Subject("s101","DS",100);
        subs[1]=new Subject("s102","Algorithms",100);
        subs[2]=new Subject("s103","Operating Systems",100);
        
        for(Subject s:subs)
            System.out.println(s);
    }
}

class Student{
    private String rollNo;
    private String name;
    private String dept;
    private Subject[] subjects;
    public String getRollNo() {
        return rollNo;
    }
    public String getName() {
        return name;
    }
    public String getDept() {
        return dept;
    }
    public Subject[] getSubjects() {
        return subjects;
    }
    public void setDept(String dept) {
        this.dept = dept;
    }
    public void setSubjects(Subject[] subjects) {
        this.subjects = subjects;
    }

    
}