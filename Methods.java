import java.math.BigInteger;

public class Methods {
    // int max(int a, int b){
    //     if(a > b){
    //         return a;
    //     }
    //     else{
    //         return b;
    //     }
    // }
    // public static void main(String[] args) {
    //     int a =1, b=11;
    //     Methods m = new Methods();
    //     int c= m.max(a, b);
    //     System.out.println(c);

    // prime and gcd of two nums
    // static int prime(int a){
    //     int count = 0;
    //     for (int i = 2; i < a; i++) {
    //         if(a%i == 0){
    //             count++;
    //         }

    //     }
    //     return count;
    // }
    // static int gcd(int a, int b){
    //     if (b==0) {
    //         return a;
    //     }
    //     else{
    //         return gcd(b, a%b);
    //     }
    // }
    // public static void main(String[] args) {
    //     int a = 35, b = 56;
    //     int gcd = gcd(a, b);
    //     int prime = prime(a);
    //     System.out.println(gcd);
    //     if (prime == 0) {
    //         System.out.println("Yes");
    //     }
    //     else{
    //         System.out.println("No");
    //     }
    // }

    //max elementf an array

//     int max(int a[]){
//         int temp = 0;
//         for (int i : a) {
//             if (i > temp) {
//                 temp = i;
//             }
//         }
//         return temp;
//     }
//     public static void main(String[] args) {
//         int a[] = {1,5,54,5,4,5};
//         Methods m =  new Methods();
//         int max = m.max(a);
//         System.out.println(max);
//     }

//reersing int and array by overloading method
    // static int reverse(int a){
    //     int res = 0;
    //     while(a!=0){
    //         int rem = a % 10;
    //         a = a/10;
    //         res *= 10;
    //         res +=  rem;
            
    //     }
    //     return res;
    // }

    // static int[] reverse(int a[]){
    //     // for (int i = 0; i < a.length; i++) {
    //     //     for (int j = a.length-1; j <= 0; j--) {
    //     //         a[j] = a[i];
    //     //     }
    //     int b[] = new int[a.length];
    //     for (int i = 0, j = a.length-1; i < a.length; i++,j--) {
    //         b[i] = a[j];
    //     }
        

        
    //     return b;
    // }
    // public static void main(String[] args) {
    //     int num = 123456;
    //     int[] arr = {1,2,3,4,5,6};
    //     int revNum = reverse(num);
    //     int[] revArray = reverse(arr);
    //     for (int i : revArray) {
    //         System.out.println(i);
    //     }
    //     System.out.println(revNum);
        
    // }

    //validating name and age of a person
    static boolean validate(String name){
        return name.matches("[a-zA-z\\s]+");
    }
    public static void main(String[] args) {
        String name = "Sree";
        boolean val = validate(name);
        System.out.println(val);
    }
}


