public class Static {
    public static void main(String[] args) {
        Stat.Inner i = new Stat.Inner();
        Stat.Inner.name();
        // StaticBlock sb = new StaticBlock();
        // StaticBlock sb1 = new StaticBlock();
    }
}

class Stat {
    int a = 0;
    static int b;
    static class Inner{
        public static void name() {
            System.out.println(b);
        }
        Inner(){
            b = 10;
        }
    }
    void display(){
        System.out.println("Outer method");
    }
    // Stat(){
    //     b= 10;
    // } 
}

// ----------------------static block
//   class StaticBlock{
//     final int A;
//     static{
//         A = 10;
//         System.out.println(a);
//     }
//     //   System.out.println("after first static");
//     static{
//         A= 100;
//         System.out.println(a);
//     }
//     //   System.out.println("initialized a after second static block");
//   }