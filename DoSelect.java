import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class DoSelect {
    public static void main(String[] args) {
        // Batch b = new Batch();
        // String str = "BA7A20151222";
        // System.out.println(b.lengthCheck(str));
        // System.out.println(b.printDate(str));

    }
}

// class Batch {
//     public boolean lengthCheck(String str) {
//         if (str.length() == 12) {
//             return true;
//         } else {
//             return false;
//         }
//     }

//     public boolean batchNumberCheck(String str) {
//         String batch = str.substring(0, 4);
//         if (batch.matches("[A-Z][A-Z][0-9][A-Z]")) {
//             return true;
//         } else {
//             return false;
//         }
//     }

//     public boolean yearCheck(String str) {
//         String year = str.substring(4, 8);
//         int year1 = Integer.valueOf(year);
//         if (year1 >= 2015 && year1 <= 2020) {
//             return true;

//         } else
//             return false;
//     }

//     public boolean monthCheck(String str) {
//         String month = str.substring(8, 10);
//         int month1 = Integer.valueOf(month);
//         if (month1 > 0 && month1 < 13) {
//             return true;
//         } else
//             return false;
//     }

//     public boolean dayCheck(String str) {
//         String day = str.substring(10);
//         int day1 = Integer.valueOf(day);
//         if (day1 > 0 && day1 < 32) {
//             return true;
//         } else
//             return false;
//     }

//     public String printBatchNumber(String str) {
//         if (batchNumberCheck(str) == true && yearCheck(str) == true && monthCheck(str) == true
//                 && dayCheck(str) == true) {
//             return str;
//         } else
//             return null;
//     }

//     public String printDate(String str) {
//         if (yearCheck(str) == true && monthCheck(str) == true && dayCheck(str) == true) {
//             String day = str.substring(10);
//             String month = str.substring(8,10);
//             String year = str.substring(4, 8);
//             return day+"/"+month+"/"+year;
//         } else
//             return null;
//     }
// }
class Country{
    HashMap<String, String> placeList = new HashMap<>();
    public ArrayList<String> startWith(char startChar) {
        ArrayList<String> al = new ArrayList<>();
        char c= Character.toLowerCase(startChar);
        for (String string : placeList.keySet()) {
            char first = Character.toLowerCase(string.charAt(0));
            
            if(first == c){
                al.add(string);
            }
        }
        Collections.sort(al);
        return al;
    }

    public String maximumPlaceVisit(){
        for (String string : placeList.keySet()) {
            
        }
        
    }
}