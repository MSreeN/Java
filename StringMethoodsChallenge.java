import javax.swing.plaf.synth.SynthSpinnerUI;

public class StringMethoodsChallenge {
    public static void main(String[] args) {
        String str = "programmers@gmail.com";
        if(str.matches("\\w*@gmail.*")){
            System.out.println("Given mail is on gmail");
        }
        
        int at = str.indexOf("@");
        String userName  = str.substring(0, at);
        System.out.println("username is "+userName);
        String domainName = str.substring(at+1, str.length());
        if(domainName.contains("gmail")){
            System.out.println("Domain name is "+domainName);
        } 
    }
}
