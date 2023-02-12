public class GenericsRough {
    static void fun(MyClass<?> m){
        
    }
    public static void main(String[] args) {
        MyClass<String> m = new MyClass<>();
        fun(m);
    }
    // C<Integer> c = new C<>();
}

class A{}
class B{}
interface C{}
class MyClass<T>{}