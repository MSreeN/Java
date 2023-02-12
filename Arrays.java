import java.util.Random;
import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) throws IndexOutOfBoundsException {
        // FInding second largest
        // int a[] = new int[5];
        // Random r = new Random();
        // for(int i = 0; i< 5;i++){
        // a[i] = r.nextInt(50);
        // }
        // for(int x : a){
        // System.out.print(x+" ");
        // }
        // System.out.println();
        // // int max1 = 0,max2= 0;
        // // for(int i : arr){
        // // if (i>max2){
        // // if(i>max1){
        // // max2 = max1;
        // // max1 = i;// 867
        // // }
        // // else{
        // // max2 = i;//86
        // // }
        // // }
        // // }
        // // System.out.println(max2);
        // // Rotation of array
        // // int temp = a[0];

        // // for(int i =0;i<a.length;i++){
        // // if(i == a.length-1){
        // // a[i] = temp;

        // // }
        // // else{
        // // a[i] = a[i+1];
        // // }
        // // }
        // // for(int x : a){
        // // System.out.println(x);
        // // }
        // // insertion and shifting
        // // Scanner s = new Scanner(System.in);
        // // int element = s.nextInt();
        // // int index = s.nextInt();
        // // for(int i =a.length-1; i>=index; i--){

        // // a[i] = a[i-1];
        // // }
        // // a[index-1] = element;
        // // for (int i : a) {
        // // System.out.println(i);
        // // }
        // // deletion and shifting
        // // Scanner s = new Scanner(System.in);
        // // // int element = s.nextInt();
        // // int index = s.nextInt();
        // // int n = 5;
        // // for(int i =index-1; i<n ;i++){

        // // a[i] = a[i+1];
        // // }
        // // // a[index-1] = element;
        // // for (int i : a) {
        // // System.out.println(i);
        // // }

        // //reverse copying an array
        // // int b[] = new int[5];
        // // for(int i = a.length-1, j = 0; i>=0;i--,j++){
        // // b[j] = a[i];
        // // }
        // // for (int j : b) {
        // // System.out.print(j+" ");
        // // }

        // //increasing array size and change referencing pointer
        // int b[] = new int[2*a.length];
        // for(int i = 0;i<a.length;i++){
        // b[i] = a[i];
        // }
        // a = b;
        // b = null;
        // System.out.println("After changing pointer");
        // for (int i : a) {
        // System.out.print(i+" ");
        // }
        /////////////// SEcond largest number in an array.
        Random r = new Random();
        int arr[] = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(50);
        }

        for (int i : arr) {
            // System.out.print(i + " ");
        }

        int max1 = 0, max2 = 0;
        for (int i : arr) {
            if (i > max1) {
                max2 = max1;
                max1 = i;
            } else if (max2 < i) {
                max2 = i;
            }

        }
        // System.out.println("------");
        // System.out.println(max1 + " " + max2);

        ////////// Rotating array

        int rShift[] = new int[10];
        for (int i = 0; i < rShift.length; i++) {
            rShift[i] = r.nextInt(50);
            // System.out.print(rShift[i]+" ");
        }
        int firstVar = rShift[rShift.length - 1];
        // for (int i = 0; i < rShift.length; i++) {
        // if(i<rShift.length-1){
        // rShift[i] = rShift[i+1];
        // }
        // else
        // {
        // rShift[rShift.length-1] = firstVar;
        // }

        // }
        // // System.out.println("");
        // for (int i : rShift) {
        // // System.out.print(i+ " ");
        // }
        ////////////////////////////////////////////////////////
        ////// second approach
        for (int i = rShift.length - 1; i > 0; i--) {
            rShift[i] = rShift[i - 1];
        }
        rShift[0] = firstVar;
        // System.out.println("");
        for (int i : rShift) {
            // System.out.print(i+" ");
        }
        /////////////////////////////////////////////////////
        ///////////// insert an element
        // int insertArr[] = new int[10];
        // for (int i = 0; i < 9; i++) {
        // insertArr[i] = r.nextInt(50);
        // System.out.print(insertArr[i]+ " ");
        // }
        // Scanner s = new Scanner(System.in);
        // int element = s.nextInt();
        // int index = s.nextInt();

        // for(int i = insertArr.length-1; i>index; i--){
        // insertArr[i] = insertArr[i-1];
        // }
        // insertArr[index] = element;

        // for (int i : insertArr) {
        // System.out.print(i+" ");
        // }
        // s.close();

        /////////////////////////////////////////////////////////////
        //////////////// deleting an element form an array

        int delArr[] = new int[10];
        for (int i = 0; i < delArr.length; i++) {
            delArr[i] = r.nextInt(50);
            // System.out.print(delArr[i]+ " ");
        }

        // int delEle = s.nextInt();
        Scanner s = new Scanner(System.in);
        // int delInd = s.nextInt();

        // for(int i = delInd+1; i<delArr.length; i++){
        // delArr[i-1] = delArr[i];
        // }

        for (int i : delArr) {
            // System.out.print(i+" ");
        }
        s.close();

        //////////////////// 2 dimensional arrays

        // int twoDim[][] = {{1,2,3},{},{}};
        // // twoDim[0] = {1,2,3}
        // twoDim[1] = new int[3];
        // twoDim[2] = new int[3];

        // // for (int i = 0; i < twoDim.length; i++) {
        // // for (int j = 0; j < twoDim[i].length; j++) {
        // // twoDim[i][j] = r.nextInt(50);
        // // }
        // // }

        // for (int is[] : twoDim) {
        // for (int ele : is) {
        // System.out.print(ele+" ");
        // }
        // System.out.println("");
        // }

        int arr1[][] = { { 3, 5, 9 }, { 7, 6, 2 }, { 4, 3, 5 } };
        int arr2[][] = { { 1, 0, 0 }, { 0, 1, 0 }, { 0, 0, 1 }, { 1, 1, 1 } };
        int arr3[][] = new int[arr1.length][arr1[0].length];

        // for (int i = 0; i < arr1.length; i++) {
        // ///accessing array one elements

        // for (int j = 0; j < arr1[i].length; j++) {
        // arr3[i][j] = arr1[i][j] + arr2[i][j];
        // }
        // }

        // for (int[] is : arr3) {
        // for (int is2 : is) {
        // System.out.print(is2 + " ");
        // }
        // System.out.println("");
        // }

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr3.length; j++) {
                arr3[i][j] = 0;
                for (int k = 0; k < arr3.length; k++) {
                    arr3[i][j] += arr1[i][k] * arr2[k][j];
                }
            }
        }
        // java.util.Arrays.sort(arr3);
        for (int[] is : arr3) {
            // java.util.Arrays.sort(is);
            for (int is2 : is) {
                // System.out.print(is2 + " ");
            }
            // System.out.println("");
        }
        int arrr[] = {3,2,1};
        int rev[] = reverseArr(arrr);
        for (int i : rev) {
            System.out.println(i);
        }
    }

    static int reverse(int number){
        int rem = 0;
        int res = 0;
        while(number > 0){
            rem = number% 10;
            number /= 10;
            res*=10;
            res += rem;
        }
        return res;
    }

    static int[] reverseArr(int[] a){
        int b[] = new int[a.length];
        for(int i = a.length-1,j = 0; i>=0 && j<a.length; i--, j++){
            b[j] = a[i];
        }
        return b;
    }
}
