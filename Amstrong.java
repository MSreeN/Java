import java.util.Scanner;

public class Amstrong {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int st = s.nextInt();
        // int fact = 1;
        // for(int i =n;i>=1; i--){
        //     fact = fact*i;
        // }
        // System.out.println(fact);
        // --------------------------------------------
        // while(n!=0){
        //     int rem = n%10;
        //     n = n/10;
        //     System.out.println(rem);
        // }
        // -----------------------------------------
        // String st = String.valueOf(n);
        // System.out.println(st.length());
        // ----------------------------------
        //     int pal = 0;
        //     while(st!=0){
        //         pal += Math.pow((st % 10), 3);
        //         st = st/10; 
        //     }     
        //     System.out.println(pal);
        //     if(pal == st){
        //         System.out.println("y");
        //     }
        // ---------------------------------------
        //    int ans =0; 
        //    int st1= st;
        // while(st!=0){
        //         int rem = st%10;
        //         st = st/10;
                
        //         ans *=10;
        //         ans += rem;
        //     }
        //     // System.out.println(ans);
        //     if(st1 == ans){
        //         System.out.println("Yes");
        //     }
// ----------------------------------------------------
//         String st1 = String.valueOf(st);
//         for(int i = 0; i< st1.length();i++){
//             char c = st1.charAt(i);
//             switch(c){
//                 case '0':
//                 System.out.print("Zero ");
//                 break;
//                 case '1':
//                 System.out.print("One ");
//                 break;
//                 case '2':
//                 System.out.print("Two ");
//                 break;
//                 case '3':
//                 System.out.print("Three ");
//                 break;
//             }

        // }
    int a = 0;
    int b = 1;
    System.out.print(a+" " +b);
    for(int i =0;i<st-2;i++){
        int c = a+b;
        a = b;
        b = c;
        System.out.print(" "+c+" ");
    }
    }
}
