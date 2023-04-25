package Generics;

import javax.print.attribute.IntegerSyntax;

public class GenericMethods {
  // static <T>void display(T... list){
  //   for(T ele: list){
  //     System.out.println(ele);
  //   }
  // }
  static void fun(MyArray obj){
    obj.display();
  }

  static<T> void display(T t){
    System.out.println(t);
  }


  public static void main(String[] args) {
    // display(10,20);
    MyArray<String> ma = new MyArray(); 
    display(Integer.valueOf(55));
    ma.append("hello");
    ma.append("world");
    fun(ma);
  }
}
