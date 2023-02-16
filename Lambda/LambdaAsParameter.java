package Lambda;
//This code is not working , throwing NoSuchMethodError exception, run the in onlineGDBa and worked fine
interface MyLamb {
  abstract void display();
}

class Refe{
  public void call(MyLamb m){
    m.display();
  }
}

class Demo{
  public void method1(){
    Refe f = new Refe();
    f.call(() -> {
      System.out.println("hello");
    });
  }
    
  
}

public class LambdaAsParameter {
  public static void main(String[] args) {
    Demo d = new Demo();
    d.method1();
  }
}
