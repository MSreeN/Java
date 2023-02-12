import java.util.Random;
import java.util.Arrays;
class TwoDim{
    public static void main(String[] args) {
        //Two dimensional array creation
    //     int[][] a =new int[5][];
    //     for(int i =0;i<a.length;i++){
    //         a[i] = new int[i+1];
    //     }

    //     for (int i[] : a) {
    //         for (int j : i) {
    //             System.out.print(j);
    //         }
    //         System.out.println();
    //     }
    Random r = new Random();
    int[] a[],b[], c[];
    a = new int[3][3];
    b = new int[3][3];
    c = new int[3][3];
    // for (int[] i : a) {
    //     for (int j = 0; j < i.length; j++) {
    //         a[][j] = r.nextInt(1,10);
    //     }
    // }
    for (int i=0 ; i < a.length; i++) {
        for (int j = 0; j < a[i].length; j++) {
            a[i][j] = r.nextInt(1, 10);
        }
        
    }
    for (int i[] : a) {
        for (int j : i) {
            System.out.print(j+" ");
        }
            System.out.println();
    }
    System.out.println("---------------------");
    for (int i=0 ; i < b.length; i++) {
        for (int j = 0; j < b[i].length; j++) {
            b[i][j] = r.nextInt(1, 10);
        }
        
    }
    for (int i[] : b) {
        for (int j : i) {
            System.out.print(j+ " ");
        }
    System.out.println();
    }
    for (int i=0; i < a.length; i++) {
        for (int j = 0; j < a[i].length; j++) {
            c[i][j] = a[i][j] * b[i][j];
        }
    }
    Arrays.sort(c);
    System.out.println("------------");
    for (int i[] : c) {
        for (int j : i) {
            System.out.print(j+" ");
        }
    System.out.println();
    }
    


    }
}