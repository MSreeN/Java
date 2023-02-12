public class StaticInnerClass {
    public static void main(String[] args) {
        Outer.Inner i = new Outer().new Inner();
        i.innerMethod();

    }

}

class Outer {
    void outerMethod() {
        System.out.println("Outer method");
    }

    int x = 90;
    int y = 901;

    class Inner {
        void innerMethod() {
            System.out.println(y);
            System.out.println("Inner Method");
        }

    }

    Inner i = new Inner();
    
    

}