// import java.util.Scanner;

// class Snake {
//     public String camelToSnake(String str) {
//         String newStr = "";
//         for (int i = 0; i < str.length(); i++) {
//             if (i > 0) {
//                 if (Character.isUpperCase(str.charAt(i))) {
//                     newStr += "_";
//                     newStr += str.charAt(i);
//                 } else {
//                     newStr += str.charAt(i);
//                 }
//             } else {
//                 newStr += str.charAt(i);
//             }
//         }
//         return newStr.toLowerCase();
//     }
// }

// public class SnakeCase {
//     public static void main(String[] args) {

//         Scanner scanner = new Scanner(System.in);
//         while (scanner.hasNext()) {
//             String inp = scanner.next();
//             Snake s = new Snake();
//             System.out.println(s.camelToSnake(inp));
//         }

//     }
// }

class Card {
    public String name;
    public String mobileNo;
    public String ID;

    public Card(String name, String mobileNo, String iD) {
        this.name = name;
        this.mobileNo = mobileNo;
        ID = iD;
    }

}

class Validator {
    public String checkMobileNo(Card details) throws InvalidMobileNumberException {
        if (details.mobileNo.matches("[6-9]\\d+") && details.mobileNo.length() == 10) {
            return "Mobile number is valid";
        } else {
            throw new InvalidMobileNumberException("Invalid mobile number");
        }
    }

    public String checkID(Card details) throws InvalidIDException {
        String s1 = String.valueOf(details.name.charAt(0)) + String.valueOf(details.name.charAt(1));
        if (details.ID.length() == 8 && details.ID.indexOf(s1) >= 0) {
            return "ID is valid ";
        } else {
            throw new InvalidIDException("Invalid Id");
        }

    }
}

class InvalidMobileNumberException extends Exception {
    public InvalidMobileNumberException(String str) {
        super(str);
    }
}

class InvalidIDException extends Exception {

    public InvalidIDException(String str) {
        super(str);
    }

}

/**
 * Source
 */
public class Source {

    public static void main(String[] args) {
        // Card c = new Card("Sree", "6638521548", "454545");
        // Validator validator = new Validator();
        // try {
        // System.out.println(validator.checkID(c));
        // } catch (InvalidIDException e) {

        // e.printStackTrace();
        // }
        // try {
        // System.out.println(validator.checkMobileNo(c));
        // } catch (InvalidMobileNumberException e) {

        // e.printStackTrace();
        // }
        int i;

        for(i = 1; i < 6; i++){
        
        if(i > 3)
        
        continue;
        
        }
        
        System.out.println(i);

    }
}
