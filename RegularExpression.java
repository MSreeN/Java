public class RegularExpression {
    public static void main(String[] args) {
        String s = "a-c@gmail.com";
        System.out.println(s.matches("[a-zA-z0-9]*@gmail.com"));
    }
}
