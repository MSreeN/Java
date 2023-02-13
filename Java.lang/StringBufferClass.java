public class StringBufferClass {

  public static void main(String[] args) {
    StringBuf s = new StringBuf();
    Modifier1 m1 = new Modifier1("Modifier1", s);
    Modifier2 m2 = new Modifier2("modifier2", s);
    m1.start();
    m2.start();
  }

}
//checking the synchronized and non synchronized methods with multi threading
class StringBuf {
  StringBuilder s = new StringBuilder("hello");

  public void change(String str) {
    try{
      Thread.sleep(2000);
         }
    catch(InterruptedException e){
      System.out.println(e);
    }
    
    s.append(str);
  }

  // public void inserting(String str) {
  //   s.insert(6, str);
  // }
}

class Modifier1 extends Thread {
  String str;
  StringBuf sb;

  Modifier1(String str, StringBuf s) {
    this.str = str;
    sb = s;
  }

  public void run() {
    
    sb.change(str); 
    
    System.out.println(sb.s);
  }
}

class Modifier2 extends Thread {
  StringBuf sb;
  String str;

  Modifier2(String st, StringBuf s) {
    str = st;
    sb = s;
  }

  public void run() {
    sb.change(str);
    System.out.println(sb.s);
  }
}