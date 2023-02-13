public class SingletonClass {
    public static void main(String[] args) {
        Singleton ref = Singleton.getInstance();
        ref.method();
    }
}


class Singleton{
    private int a;
    private int b;
    static private Singleton ref = null;

    private Singleton(){
        a= 10;
        b = 10;
    }
    void method(){
        System.out.println(a);
        System.out.println(b);
    }

    static public Singleton getInstance(){
        // this method should be static because we cannot create
        // object of this class coz constructor is private and if we make constructor as public 
        // then there will be more than one obj will be crated so 
        // there is only ow way to so this using static which helps to call this
        // method without creating object  and ref should also be static to access it in this method   
        if(ref == null){
            ref = new Singleton();
        }
        return ref;
    }
}