package Generics;

class MyArray<T>{
  T data[] = (T[]) new Object[5];
  int length = 0;
  
  //Inserts t into data if any space available
  public void append(T t){
    //Checks if there's space available
    if(length<data.length){
      data[length++] = t;
      
    }
  }

  //displays the elements in data array
  public void display(){
    for(T el: data){
      System.out.println(el);
    }
  }


}

public class GenericExample02 {
  public static void main(String[] args) {
    MyArray<Integer> ma = new MyArray<>();
    ma.append(10);
    ma.display();
  }
}
