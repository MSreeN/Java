public class MethodReference {
    public static void main(String[] args) {
        // lambdaExp l = Randm::rev;
        // l.display("Hello");
        // lambdaExp l1 = Randm::buff;
        // l1.display("Hello");

        lambdaExp ml = Randm::new;
        ml.display("Hello");

    }
}

interface lambdaExp {
    void display(String str);
}

class Randm {
    public Randm(String str) {
        System.out.println(str);
    }

    static void buff(String str) {
        StringBuffer sb = new StringBuffer(str);
        System.out.println(sb);
    }

    void rev(String str) {
        StringBuffer sb = new StringBuffer(str);
        sb.reverse();
        System.out.println(sb);
    }
}
