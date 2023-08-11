interface Shape {
    double calculateArea();
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
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return width * height;
    }
}
class ShapeCalculator {
    private Shape shape;

    public ShapeCalculator(Shape shape) {
        this.shape = shape;
    }

    public double calculateArea() {
        return shape.calculateArea();
    }
}
class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5.0);
        Rectangle rectangle = new Rectangle(4.0, 6.0);

        ShapeCalculator circleCalculator = new ShapeCalculator(circle);
        ShapeCalculator rectangleCalculator = new ShapeCalculator(rectangle);

        System.out.println("Circle area: " + circleCalculator.calculateArea());
        System.out.println("Rectangle area: " + rectangleCalculator.calculateArea());
    }
}
