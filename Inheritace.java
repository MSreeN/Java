class Inheritace {
    public static void main(String[] args) {
        // Second s = new Second();
        Cuboid c = new Cuboid(10, 0, 0);
        System.out.println(c.volume());
    }

}

class Rectangle {
    public int length;
    public int breadth;

    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public Rectangle() {
        length = breadth = 1;
    }

}

class Cuboid extends Rectangle {
    public int height;

    public Cuboid() {
        height = 1;
    }

    public int volume() {
        return length * breadth * height;
    }

    public Cuboid(int length, int breadth, int height) {
        super(length, breadth);
        this.height = height;
    }

    public Cuboid(int height) {
        this.height = height;
    }

}

// class Second extends Parent {
// public Second() {

// System.out.println("child without args");
// }

// public Second(int x) {
// super(x);
// System.out.println("child with variable args");
// }
// }

// class Parent {

// // public Parent() {
// // System.out.println("Parent without param");
// // }

// public Parent(int x) {
// System.out.println("parent with variable argumnets");
// }

// }
