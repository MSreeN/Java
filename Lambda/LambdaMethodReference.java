package Lambda;

interface MyLamb{
  public int display(String s, String s1);
}

public class LambdaMethodReference {
  // public static void reverse(String str){
  //   StringBuffer sb = new StringBuffer(str);
  //   sb.reverse();
  //   System.out.println(sb);
  // }
  public static void main(String[] args) {
    MyLamb ml = String::compareTo;
    System.out.println(ml.display("hello world","z"));
  }
}
