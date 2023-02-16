package Lambda;

interface MyLamb {
  abstract void display(String str);
  //calling static method depends on the reference not the object
  // static void stat(){
  //   System.out.println("static from interface");
  // }
  // void display2();
}

abstract class My implements MyLamb {
  public void display() {
    System.out.println("overrided display");
  }
  // public static void stat(){
  //   System.out.println("static from class");
  // }
}

public class MyLambda {
  public static void main(String[] args) {
    //used separate class to override mylambda method.
    // My m = new My();
    // m.display();
    // m.stat();
    // this doesn't work if the MyLamb is not a functional interface
    MyLamb ml =
      (s) ->{
        System.out.println("overridden withe inner class " + s);
      };
    
    ml.display("param");
  }
}
