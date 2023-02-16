package Generics;

class Parent<T>{
  T var;

  public T getVar() {
    return var;
  }

  public void setVar(T var) {
    this.var = var;
  }
  
}

//If i didn't specify the generic type of Parent class then the generic type of child class will be set to parent class.
// class Child<T> extends Parent<T>

//We can have two diff type of generic for child and parent.
class Child<T> extends Parent<String>{
  T childVar;

  public T getChildVar() {
    return childVar;
  }

  public void setChildVar(T childVar) {
    this.childVar = childVar;
  }
  
}

public class GenericSubClasses {
  public static void main(String[] args) {
    Child<Integer> c = new Child<>();
    c.setChildVar(10);
    c.setVar("hello");
  }
}
