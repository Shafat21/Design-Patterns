class StrategyPattern {
    public static void main(String[] args) {
        Context rectangleContext = new Context(new RectangleArea());
        System.out.println("Area of Rectangle: " + rectangleContext.executeStrategy(5, 4));

        Context circleContext = new Context(new CircleArea());
        System.out.println("Area of Circle: " + circleContext.executeStrategy(5, 0));
    }
}

class Context {
    private IStrategy strategy;

    public Context(IStrategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(IStrategy strategy) {
        this.strategy = strategy;
    }

    public int executeStrategy(int num1, int num2) {
        return strategy.calculateArea(num1, num2);
    }
}

interface IStrategy {
    int calculateArea(int a, int b);
}

class RectangleArea implements IStrategy {
    @Override
    public int calculateArea(int a, int b) {
        int width = a;
        int height = b;
        return width * height;
    }
}

class CircleArea implements IStrategy {
    @Override
    public int calculateArea(int a,int b) {

        int radius = a;
        return (int) (3.1416 * radius * radius);
    }
}

