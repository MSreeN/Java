class Main {
    int length;

    Main(int length) {
        this.length = length;
    }
}

class Sup extends Main {
    int height;

    int a() {
        return height * length;
    }

    Sup(int height, int length) {
        super(length);
        this.height = height;
    }
}

class Super {
    public static void main(String[] args) {
        Sup s = new Sup(10, 0);
        System.out.println(s.a());
    }
}