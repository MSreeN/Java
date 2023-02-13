class Circle {
    public Double radius;

    public Double area() {
        return Math.PI * radius * radius;
    }

    public Double perimeter() {
        return 2 * Math.PI * radius * radius;
    }

    public double circumference() {
        return perimeter();
    }
}

class Cylinder extends Circle {
    public double height;

    public double volume() {
        return area() * height;
    }
}

class CircleNCylinder {
    public static void main(String[] args) {
        Cylinder c = new Cylinder();
        c.height = 7.0;
        c.radius = 10.0;
        System.out.println(c.volume());
        System.out.println(c.area());
    }
}
