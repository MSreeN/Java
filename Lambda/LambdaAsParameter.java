package Lambda;
//This code is not working , throwing NoSuchMethodError exception, run the in onlineGDBa and worked fine
interface MyLamb {
  abstract void display();
}

class Demo{
  public void method1(){
    MyLamb ml = () -> {
      System.out.println("hello");
    };
    ml.display();
  }
}

public class LambdaAsParameter {
  public static void main(String[] args) {
    Demo d = new Demo();
    d.method1();
  }
}
