public class MonitorWOsync extends Thread {
    public static void main(String args[]) {
        MyData md= new MyData();
        Two t = new Two(md);
        One o = new One(md);
        o.start();
        t.start();
    }
}

class One extends Thread{
    MyData md;
    One(MyData mdt){
        md = mdt;
    }

    public void run(){
        md.display("HelloWorld");
    }
}

class Two extends Thread{
    MyData mm;
    public Two(MyData m){
        mm = m;
    }
    public void run(){
        mm.display("Welcome");
    }
}

///Monitor class, managing those objects to access the critical should be done in this code/class.
class MyData{
    public void display(String name){
        for(int i =0; i< name.length();i++){
            System.out.println(name.charAt(i));
        }
    }
}
