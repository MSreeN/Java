public class Wrapper {
  public static void main(String[] args) {
    // String s = "10";
    // System.out.println(s + 10);
    // int i = Integer.valueOf(s);
    // System.out.println(i + 10);
    int i = 100; //primitive data type
    Integer i1 = Integer.valueOf( i);// this is boxing, we are creating a class and storing i in it and attaching a reference i1 to it.
    Integer i2 = i;// This is auto boxing ;
    int ii = i1.intValue(); // This is unboxing, we are getting i value out of object i1
    int iii = i1;// This is auto unboxing
    System.out.println(i+" "+ii+" "+iii+" "+i1+" "+i2);
  }
}
