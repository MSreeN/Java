// public class Test {
//     public static void main(String[] args) {
//         Header h = new Header("personOne@gmail.com", "personTwo@gmail.com");
//         Email e = new Email(h, "Hii there hows you", "ThankYou");
//         EmailOperations eo = new EmailOperations();
//         System.out.println(eo.emailverify(e));
//         System.out.println(eo.bodyEncryption(e));
//         System.out.println(eo.greetingMessage(e));
//     }
// }

// class Email{
//     // Implement Email Class according to the specifiaction.
//         Header header;
//         String body;
//         String greetings;
//         Email(Header header, String body, String greetings){
//             this.header = header;
//             this.body = body;
//             this.greetings = greetings;
//         }
//     }
// class Header{
// // Implemet the Header Class according to the specifiaction.
//     String from;
//     String to;
//     Header(String from, String to){
//         this.from = from;
//         this.to = to;
//     }
// }
    
    
// class EmailOperations{
// // Implemet the Three methods specified in the specified.	
//     public int emailverify(Email e){
//         if(e.header.to.matches("[a-zA-z_][a-zA-Z]*@[a-zA-Z]+.[a-zA-z]+")){
//             if (e.header.from.matches("[a-zA-z_][a-zA-Z]*@[a-zA-Z]+.[a-zA-Z]+")) {
//                 return 2;
//             }
//             else{
//                 return 1;
//             }
//         }
//         else{
//             return 0;
//         }

//     }
//     public String bodyEncryption(Email e){
//         String s = "";
//         for (int i = 0; i < e.body.length(); i++) {
//             if (e.body.charAt(i) == ' ') {
//                 s += " ";
//             } 
//             else{
//                 if (Character.isUpperCase(e.body.charAt(i))) {
//                     // int in = e.body.charAt(i);
//                     // in += (3-97) % 26 +97;
//                     // char c = (char)(in);
//                     // s+= c;   
//                     s += (char)(((int) (e.body.charAt(i)) + 3-65)% 26 + 65);                 
//                 }
//                 else{
//                     // int in = e.body.charAt(i);
//                     // in += (3-65) % 26 +65;
//                     // char c = (char)(in);
//                     s += (char)(((int) (e.body.charAt(i)) + 3-97)% 26 + 97);
//                     // s+= c;
//                 }

//             }
//         // for (int i = 0; i < e.body.length(); i++)
//         // {
//         //     int charPosition = e.body.charAt(i);
//         //     int keyVal = (3 + charPosition) % 26;
//         //     char replaceVal = (char)keyVal;
//         //     s += replaceVal;
//         // }
        
        
//         }
//         return s;
//     }

//     public String greetingMessage(Email e) {
//         String s = "";
//         int ind = e.header.from.indexOf("@");
//         String name = e.header.from.substring(0, ind);
//         s+= e.greetings +" "+ name;
//         return s;
//     }



// }

class TransactionParty{
    String seller;
    String buyer;
    public TransactionParty(String seller, String buyer) {
        this.seller = seller;
        this.buyer = buyer;
    }
    
}

class Receipt{
    TransactionParty transactionParty;
    String productsQR;
    public Receipt(TransactionParty transactionParty, String productsQR) {
        this.transactionParty = transactionParty;
        this.productsQR = productsQR;
    }
    
}

class GenerateReceipt{
    public int verifyParty(Receipt r) {
        if(r.transactionParty.seller.matches("[a-zA-Z]+[a-zA-Z\\s'-]")){
            if(r.transactionParty.buyer.matches("[a-zA-Z]+[a-zA-Z\\s'-]")){
                return 2;
            }
            else{
                return 1;
            }
        }
        else{
            return 0;
        }
    }
    int GST;
    public String calcGST(Receipt r) {
        
        // int gstRate = 12;
        int p1c = Integer.valueOf(r.productsQR.substring(0, r.productsQR.indexOf(",")));
        int p1q = Integer.valueOf(r.productsQR.substring(r.productsQR.indexOf(",")+1, r.productsQR.indexOf("@")));
        int p2c = Integer.valueOf(r.productsQR.substring(r.productsQR.indexOf("@")+1, r.productsQR.indexOf(",", r.productsQR.indexOf(",")+1)));
        int p2q = Integer.valueOf(r.productsQR.substring(r.productsQR.indexOf(",", r.productsQR.indexOf(",", r.productsQR.indexOf(",")+1))+1, r.productsQR.indexOf("@", r.productsQR.indexOf("@")+1)));
        int p3c = Integer.valueOf(r.productsQR.substring(r.productsQR.lastIndexOf("@")+1, r.productsQR.lastIndexOf(",")));
        int p3q = Integer.valueOf(r.productsQR.substring(r.productsQR.lastIndexOf(",")+1));
        GST = (int)((p1c*p1q + p2c*p2q + p3c*p3q)*0.12);
        // return String.valueOf(GST);
        return toString();
        
    }
    @Override
    public String toString() {
        return "GenerateReceipt [GST=" + GST + "]";
    }



    // @Override
    // public String toString() {
    //     return ;
    // }
}

public class Test{
    public static void main(String[] args) {
        TransactionParty tp = new TransactionParty("Sree", "Mahesh");
        Receipt r = new Receipt(tp, "250,10@100,3@50,7");
        GenerateReceipt gr = new GenerateReceipt();
        System.out.println(gr.verifyParty(r));
        System.out.println(gr.calcGST(r));

    }
}
