public class AbstractCLass {
    public static void main(String[] args) {
        Circle c = new Circle(10);
        Rect r = new Rect(5, 10);
        System.out.println(c.area() + " " + c.perimeter());
        System.out.println(r.area() + " " + r.perimeter());

    }

}

abstract class Shape {
    abstract int perimeter();

    abstract int area();
}

class Circle extends Shape {
    public int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    int perimeter() {
        return 2 * (int) Math.PI * radius;
    }

    int area() {
        return (int) Math.PI * radius * radius;
    }
}

class Rect extends Shape {
    int length;
    int breadth;

    public Rect(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    int perimeter() {
        return 2 * (length + breadth);
    }

    int area() {
        return length * breadth;
    }
}
// abstract class Super {
// void method1() {
// }

// abstract void method2();

// }

// class Sub extends Super {

// @Override
// void method2() {
// // TODO Auto-generated method stub

// }

// }
