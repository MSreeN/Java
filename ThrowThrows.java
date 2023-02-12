public class ThrowThrows {
    public static void main(String[] args)throws Exception {
        // Exec e = new Exec();
        // e.method();
        Thr t =new Thr();
        try{
            t.throwing();
        }
        catch(MyException e){
            System.out.println(e);
            
        }
    }
}
// class Exec extends Exception{
//     void method()throws Exception{
    
//         int a = method2(-10, 6);
//         System.out.println(a);
        

//     }
//     @override
//     public String toString(){
//         return "Negative numbers are not accepted";
//     }

//     int method2(int a, int b) throws MyExcept{
//         if(b < 0 || a < 0){throw new MyExcept("This is my own exception");}
//         int c = (a * b) ;
//         return c;
//     }
// }

// class MyExcept extends Exception{
//     String str;
//     MyExcept(String str){
//         this.str = str;
//         getMessage();
//     }
//     public String getMessage(){
//         return str;
//     }
// }

class MyException extends Exception{
    MyException(String str){
        System.out.println(str);
    }
}

class Thr{
    void throwing() throws Exception{
        throw new MyException("Throwing");
    }
}