
public class Generics {
    // T data[] = (T[]) new Object[3];
    // public static void main(String[] args) {
    // Generics<String> g = new Generics<>();
    // g.data[0] = "hello";

    // }

    static void fun(MyArr<? extends Object> m){
        //    m.append(50);
    }
    public static void main(String[] args) {
        MyArr<Integer> m = new MyArr<>();
        fun(m);

    }
}

class MyArr<T>
{
    
    @SuppressWarnings("Unchecked")
    T arr[] = (T[]) new Object[5];
    int length = 0;


    public void append(T v) {
        arr[length++] = v;

    }

    public void display() {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }
}
class One<T>{}
class My<T> extends One<T>{

}