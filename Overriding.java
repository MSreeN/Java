public class Overriding {
    public static void main(String[] args) {
        Sub s = new Sub();
        s.display();
        // s.dis();
        // Sub su = new Sub();
        // su.display();
        
    }
}

class Super {
    void display() {
        System.out.println("Super display");
    }


}

class Sub extends Super {
    @Override
    void display() {
        System.out.println("sub display");
    }
    void dis(){
        System.out.println("non common method");
        
    }
}
