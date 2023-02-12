public class StuTeacherMonitor {
    public static void main(String[] args) {
        WhiteBoard wb = new WhiteBoard();
        Teacher t = new Teacher(wb);
        StudentOne so = new StudentOne("Khyathi",wb);
        StudentOne st = new StudentOne("Mahesh",wb);
        StudentOne sth = new StudentOne("Naga",wb);
        StudentOne sf = new StudentOne("Sree",wb);
        t.start();
        so.start();
        st.start();
        sth.start();
        sf.start();
    }
}

class WhiteBoard{
    private String text;
    int noOfStudents = 0;
    int count = 0;
    synchronized public void write(String s) {
        while (count !=0){
            try {
                wait();
            } catch (Exception e) {
                
            }
        }
        System.out.println("Teacher is writing ");
        text = s;
        System.out.println(text);
        count = noOfStudents;
        // System.out.println(count);
        notifyAll();
    }
    synchronized public String read() {
        // System.out.println(count);
        while (count == 0){
            try {
                wait();
            } catch (Exception e) {
                
            }
        }
        // System.out.println(Thread.currentThread().getName()+" is reading "+text);
        count--;
        // System.out.println(Thread.currentThread().getName()+" done reading");
        // System.out.println(count);
        if (count == 0) {
            notify();
        }
        return text;
    }
    public void attendance() {
        noOfStudents++;
    }

}

class Teacher extends Thread{
    String words[] = {"java1","java2","java3","java4","java5","end"};
    WhiteBoard wb;
    public Teacher(WhiteBoard w){
        wb = w;
    }
    public void run(){
        for (int i = 0; i < words.length; i++) {
            wb.write(words[i]);
        }
        

    }
}

class StudentOne extends Thread{
    WhiteBoard wb;
    String name;
    public StudentOne(String name,WhiteBoard w){
        super(name);
        this.name  = name;
        wb = w;
        wb.attendance();
        
    }
    public void run(){
        // System.out.println(name+" is reading");
        String text;
        do {
            text = wb.read();
            System.out.println(name+" is reading "+text);
            System.out.flush();
        } while (text !="java5");
        // System.out.println(name+" is done reading");
         }
}












// class WhiteBoard
// {
//     String text;
//     int numberOfStudents=0;
//     int count=0;
//     public void attendance()
//     {
//         numberOfStudents++;
//     }
    
//     synchronized public void write(String t)
//     {
//         System.out.println("Teacher is Writing " +t);
//         while(count!=0)
//                 try{wait();}catch(Exception e){}
//         text=t;
//         count=numberOfStudents;
//         notifyAll();

//     }
//     synchronized public String read()
//     {
        
//         while(count==0)
//                 try{wait();}catch(Exception e){}
            
//         String t=text;
//         count--;
//         if(count==0)
//                 notify();
//         return t;
//     }
    
// }
// class Teacher extends Thread
// {
//     WhiteBoard wb;
    
//     String notes[]={"Java is language","It is OOPs","It is Platform Independent","It supports Thread","end"};
    
//     public Teacher(WhiteBoard w)
//     {
//         wb=w;
//     }
    
//     public void run()
//     {
//         for(int i=0;i<notes.length;i++)
//             wb.write(notes[i]);
//     }          
    
// }

// class StudentOne extends Thread
// {
//     String name;
//     WhiteBoard wb;
//     public StudentOne(String n,WhiteBoard w)
//     {
//         name=n;
//         wb=w;
//     }
    
//     public void run()
//     {
//         String text;
//         wb.attendance();
                
//         do
//         {
//             text=wb.read();
//             System.out.println(name + " Reading " + text);
//             System.out.flush();
//         }while(!text.equals("end"));
//     }
    
// }


// public class StuTeacherMonitor 
// {
//     public static void main(String[] args) 
//     {
//         WhiteBoard wb=new WhiteBoard();
//         Teacher t=new Teacher(wb);
        
//         StudentOne s1=new StudentOne("1. John",wb);
//         StudentOne s2=new StudentOne("2. Ajay",wb);
//         StudentOne s3=new StudentOne("3. Kloob",wb);
//         StudentOne s4=new StudentOne("4. Smith",wb);
        
//         t.start();
        
//         s1.start();
//         s2.start();
//         s3.start();
//         s4.start();
        
//     }   
// }