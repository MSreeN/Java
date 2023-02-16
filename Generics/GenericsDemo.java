package Generics;

public class GenericsDemo<T> {


  //*********By using Generics we can have generalized array and while creating object we can mention type of that object. It will only store the type of data that we mentioned.
  // ********Generics is for Objects.

  //We are creating an array of type Generic and storing of type Objects in it and casting those objects to type Generic. 
  //We are using of type Object because it can hold any type of object, If t is of type string then we can only store objects of type string because we are type casting it back to string and we are using object of type object because we don't know what type of data we are going to store here and since object of type Object can store any type of object we are using Object here.
  //If we try to store Integer Object in data then it gives us compile time error because Integer Object cannot be converted into String, the error which we didn't get by casting manually and the error which we got during runtime. 
  //Objects of type String can only be stored in data because reference of type String.
  //If the T is of type Object then it will allow any type of Object. It is something that we did manually like this
                // Object obj = new String("hello");
                // obj = new Integer(5);
                // String s = (String)obj;
  //In the above three lines theres no type safety, there's nothing that checks type of object that are being stored.
  //Ex: In the below example we want to make sure that type of object that are going to be stored in the array are of same type.(below code should be inside main method)
  // Object obj[] =  new Object[3];
  // obj[0] = "hii";
  // obj[1] = "hello";
  // obj[2] = 10; 
  // for(Object o: obj){
  //   o = (String)o;
  //   System.out.println(o);
  // }
  //When i try to type cast integer to string i will get runtime error which i do not know till the program runs.
  

  T data[] =(T[]) new Object[3];
  public static void main(String[] args) {
    
    //Storing String object with Object reference
    
    // Object obj = new String("hello");
    
    // obj is now holding Integer object and we did that mistakenly and we don't want to do this, but compiler didn't warn us because objects are checked at runtime.
    //we need something to tell us that we cant store integer object and that's where Generics comes into picture.
    
    // obj = new Integer(5);
    
    //When we try to cast the obj back to string it throws runtime error because obj is now holding integer object which cannot be casted to string
    
    // String s = (String)obj;
    
     
    //So we typically want an array which will hold any type of object, when we want string it should hold only string objects not other than that, and same with integer. To do that we should use generics and make the class of type generic(<T>). 
    
    // If Integer is specified instead of string then data array will store only objects of type integer.
    GenericsDemo<String> gd = new GenericsDemo<>();
    gd.data[0] = new String("hello");

    //Below line will throw us an compile time error.
    
    // gd.data[1] = Integer.valueOf(10);
  }
}
