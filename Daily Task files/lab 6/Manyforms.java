// Define the Shapes superclass
abstract class Shapes {
    abstract double area();
}

// Implement the Triangle class
class Triangle extends Shapes {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    double area() {
        return 0.5 * base * height;
    }
}

// Implement the Circle class
class Circle extends Shapes {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double area() {
        return Math.PI * radius * radius;
    }
}

// Implement the Rectangle class
class Rectangle extends Shapes {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    double area() {
        return width * height;
    }
}

public class Manyforms{
    public static void main(String[] args) {
        Triangle triangle = new Triangle(5, 8);
        Circle circle = new Circle(3);
        Rectangle rectangle = new Rectangle(4, 6);

        System.out.println("Triangle area: " + triangle.area());
        System.out.println("Circle area: " + circle.area());
        System.out.println("Rectangle area: " + rectangle.area());
    }
}
