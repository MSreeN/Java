// public class Patterns {
//     public static void main(String[] args) {
//         // int s = 1;
//         // for(int i= 1;i<=5;i++){
//         //     for(int j = 5;j>=1;j--){

//         //         if(j>i){
//         //          System.out.print(" ");   
//         //         }
//         //         else{
//         //             System.out.print("*");
//         //         }

//         //     }
//         //     System.out.println();
//         // }
//         for(int i = 1;i<=5;i++){
//             for(int j = 5;j>=1;j--){
//                 if(j>i){
//                     System.out.print(" ");
//                 }
//                 else{
//                     System.out.print("*");
//                 }

//             }
//             for(int k = 1; k<i;k++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//         for(int i = 1;i<=5;i++){
//             for(int j = 1;j<=5;j++){
//                 if(j<=i){
//                     System.out.print(" ");
//                 }
//                 else{
//                     System.out.print("*");
//                 }

//             }
//             for(int k = 4; k>i;k--){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }

class Patterns {
    public static void main(String[] args) {
        // int count = 0;

        // for (int i = 1; i <= 5; i++) {

            
        //     for (int j = 1; j <=5; j++) {
        //     if((j+i) <= 5){
        //     System.out.print(" ");
        //     }
        //     else{
        //     System.out.print("*");
        //     }
        //     }
        //     // count =
        //     for (int k = 1; k <= (i - 1); k++) {
        //         System.out.print("*");
        //     }
        //     System.out.println(" ");
        // }

        // for(int i = 1; i<= 4; i++){
        //     for(int j = 1; j<=4; j++){
        //         if(i>j){
        //             System.out.print(" ");
        //         }
        //         else{
        //             System.out.print("*");
        //         }
        //     }

        //     for(int k = 1; k<=4-i+1; k++){
        //         System.out.print("*");
            // }
            // System.out.println("");
        // }
//first half
        //     *
        //    **
        //   ***
        //  ****
        // *****
        for (int i = 1; i <= 5; i++) {
            for(int j = 1; j<=5; j++){
                if(i+j <= 5){

                    System.out.print(" ");
                }
                else{
                    System.out.print("*");
                }
            }


            // *
            // **
            // ***
            // ****
            for (int j = 1; j <= (i-1); j++) {
                System.out.print("*");
            }
            
            System.out.println("");


        }
//second half
        
        for (int i = 1; i <=5; i++) {
            for(int j = 1; j<= 5; j++){
                if(i>j){
                    System.out.print(" ");
                }
                else{
                    System.out.print("*");
                }
            }

            for(int j = 1; j<= 4-i+1;j++){
                System.out.print("*");
            }
            
            System.out.println("");
        }

    }
}
