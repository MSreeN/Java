public class Lambda {
    public static void main(String[] args) {
        Demo d = new Demo();
        d.display();

    }
}

interface MyLambda {
    public void Lambda();

}

class Demo {

    void display() {
        callLambda cl = new callLambda();
        cl.callRef(()-> {System.out.println("Hello");});
    }
}

class callLambda{
    void callRef(MyLambda ml){
        ml.Lambda();
    }
}

// class Myl implements MyLambda{
// public void Lambda(){

// }
// public void display(){System.out.println("sam");}
// }
