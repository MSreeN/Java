public class VariableArgs {
    // static void method(int y,String...x){
    //     for (int i = 0; i < x.length; i++) {
    //         System.out.println(y+"."+x[i]);
    //         y++;
    //     }
    // }
    // public static void main(String[] args) {
    //     method(10,"a","b","c","d","e","f","g");
        
    // }

    //max of numbers using var args
    static int max(int...x){
        int temp = 0;
        if(x.length == 0) return Integer.MIN_VALUE;
        temp = x[0];
        for (int i : x) {
            if(i>temp) temp = i;
        }
        return temp;
    }
    public static void main(String[] args) {
        System.out.println(max(2,3));
    }

    // calculating discount and if shortcut

    // static int discount(int...x){
    //     int sum = 0;
    //     for (int i : x) {
    //         sum+= i;
    //     }
    //     if(sum>0 & sum<= 500) return 10;

    // }
}
