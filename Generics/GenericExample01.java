package Generics;

class Data<T>{
  T obj;

  public T getObj() {
    return obj;
  }

  public void setObj(T obj) {
    this.obj = obj;
  }
  
}


public class GenericExample01 {
  public static void main(String[] args) {
    Data<Integer> d = new Data();
    d.setObj(10);
    System.out.println(d.getObj());
  }
}
