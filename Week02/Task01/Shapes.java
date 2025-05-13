interface Shape {
    public double calculateArea();
}

class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}
class Rectangle implements Shape {
    private double length, width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return length * width;
    }
}

class Triangle implements Shape {
    private double base, height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }
    @Override
    public double calculateArea() {
        return 0.5 * base * height;
    }
}

public class Shapes {
    public static void main(String[] args) {
        Shape shape;

        shape = new Circle(7);
        System.out.println("Circle Area: " + shape.calculateArea());
        shape = new Rectangle(10, 5);
        System.out.println("Rectangle Area: " + shape.calculateArea());
        shape = new Triangle(8, 4);
        System.out.println("Triangle Area: " + shape.calculateArea());
    }
}
