public class CheckedExc {
    void method1(){
        try{
            throw new ExceptionClass();
        }

        catch(ExceptionClass e){
            e.printStackTrace();
        }
    }

    void method2(){
        method1();
    }
    public static void main(String[] args) {
        CheckedExc c = new CheckedExc();
        c.method2();
    }
}

class ExceptionClass extends Exception{
    public String toString(){
        return "Overriding to string";
    }
}