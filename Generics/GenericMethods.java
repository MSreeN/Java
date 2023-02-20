package Generics;

public class GenericMethods {
  // static <T>void display(T... list){
  //   for(T ele: list){
  //     System.out.println(ele);
  //   }
  // }
  static void fun(MyArray obj){
    obj.display();
  }
  public static void main(String[] args) {
    // display(10,20);
    MyArray<String> ma = new MyArray(); 
    ma.append("hello");
    ma.append("world");
    fun(ma);
  }
}
