
// // interface Camera{
// //     void click();
// //     void record();
// // }

// // interface MusicPlayer{
// //     void play();
// //     void pause(); 
// // }

// // class Phone {
// //     void call(){}
// //     void sms(){} 
// // }

// // class SmartPhone extends Phone implements Camera, MusicPlayer{
// //     public void click(){}
// //     public void record(){}
// //     public void play(){}
// //     public void pause(){}  
// // }

// // interface Member {
// //     // void callBack();
// // }

// // class Store {
// //     Member m[] = new Member[5];
// //     int count = 0;

// //     void register(Member mem) {
// //         m[count++] = mem;
// //     }

// //     void inviteSale() {
// //         for (int i = 0; i < count; i++) {

// //         }
// //     }
// // }

// // class Customer implements Member {
// //     String name;

// //     public Customer(String name) {
// //         this.name = name;
// //     }

// //     public void callBack() {
// //         System.out.println("ok!" + name);
// //     }
// // }

// // class Workers implements Member {
// //     String name;

// //     public Workers(String name) {
// //         this.name = name;
// //     }
// //     // public void callBack(){
// //     // System.out.println("ok" + name);
// //     // }
// // }

// // public class Interfaces {
// //     public static void main(String[] args) {
// //         Store s = new Store();
// //         Customer c1 = new Customer("Sree");
// //         Customer c2 = new Customer("Mahesh");
// //         s.register(c1);
// //         s.register(c2);

// //         Workers w1 = new Workers("one");
// //         Workers w2 = new Workers("Two");
// //         s.register(w1);
// //         s.register(w2);
// //         s.inviteSale();
// //         for (Member string : s.m) {
// //             System.out.println(string);
// //         }

// //     }
// // }

// interface a {
//     int A = 10;

//     // public void method1();
//     static void method4() {

//         System.out.println("method static");
//     }

// }

// interface b extends a {
//     private void mm() {
//         System.out.println("private method");
//     }

//     // void method3();
//     default void m5() {
//         // mm();
//         System.out.println("default");
//     }
// }

// // interface c extends a,b{
// // void method2();
// // }

// // class A {
// // static void dis() {
// // System.out.println("static");
// // }
// // }

// class Abc implements b {
//     // public void m5() {
//     // System.out.println("def over");
//     // }
//     public static void staticMethod() {
//         System.out.println("Static inner method");
//     }

//     class Inner {
//         public void m5() {
//             System.out.println("Inner default");
//         }

//         int x = 10;
//     }

//     Inner in = new Inner();
//     // public Inner in = i;

//     void innerObj() {
//         // Inner i = new Inner();
//         // i.m5();
//     }

// }

// class Interfaces {
//     public static void main(String[] args) {

//         Abc.Inner i = new Abc().new Inner();
//         i.m5();

//     }

// }

// // class A{
// // protected void method(){

// // }

// // }

// // class B extends A{
// // public void method(){

// // }
// // }

// class Interface {
//     public static void main(String[] args) {
//         Sample s = new Sample();
//         s.display();
//     }
// }

// interface i {
//     void interfaceMethod();
// }

// class Sample {
//     int x= 10;
//     void display() {
//         int y = 90;
//         i in = new i() {
//             public void interfaceMethod() {
//                 System.out.println("interface object i.e, ananymous obect is created");
//                 System.out.println(y);
//             }
//         };
//         in.interfaceMethod();
//     }

// }

interface IMember {
    public void callBack();
}

class Customer implements IMember {
    String name;

    Customer(String name) {
        this.name = name;
    }

    @Override
    public void callBack() {
        System.out.println(this.name + " will visit");
    }
    
   
}

class Store{
    IMember mem[] = new IMember[100];
    int count = 0;
    void register(IMember m){
        mem[count++] = m;
    }

    void inviteSale(){
        for (int i = 0; i <= count; i++) {
                mem[i].callBack();
        }
    }
}

class Member{
    public static void main(String[] args) {
        // Customer c1 = new Customer("sree");
        // Store s  = new Store();
        // s.register(c1);
        // s.inviteSale();

        
        
        Sample s = new Sample();
        I1.meth2();
    }
}

interface I1{
    void  meth1();
    public static void meth2(){
        System.out.println("static method inside i1");
    }

    default void meth3(){
        System.out.println("default method inside i1");
    }
}

interface I2 extends I1{
    void meth4();
}

class Sample implements I2{
    public void meth1(){};
    static void meth2(){
        System.out.println("static method inside class");
    }
    public void meth3(){
        System.out.println("default method inside class");
    }

    public void meth4(){};
}