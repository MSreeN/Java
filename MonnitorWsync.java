public class MonnitorWsync {
    public static void main(String args[]) {
        MyDataW md= new MyDataW();
        TwoW t = new TwoW(md);
        OneW o = new OneW(md);
        o.start();
        t.start();
    }
}

class OneW extends Thread{
    MyDataW md;
    OneW(MyDataW mdt){
        md = mdt;
    }

    public void run(){
        md.display("HelloWorld");
    }
}

class TwoW extends Thread{
    MyDataW mm;
    public TwoW(MyDataW m){
        mm = m;
    }
    public void run(){
        mm.display("Welcome");
    }
}
class MyDataW{
    public synchronized void display(String name){
        
            for(int i =0; i< name.length();i++){
                System.out.println(name.charAt(i));
        }
    }
}
