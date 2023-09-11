abstract class Calculator {
    public abstract double calculate(double num1, double num2);
}

class Addition extends Calculator {
    @Override
    public double calculate(double num1, double num2) {
        return num1 + num2;
    }
}

class Subtraction extends Calculator {
    @Override
    public double calculate(double num1, double num2) {
        return num1 - num2;
    }
}

class Multiplication extends Calculator {
    @Override
    public double calculate(double num1, double num2) {
        return num1 * num2;
    }
}

class CalculatorApp {
    public static void main(String[] args) {
        Calculator additionCalculator = new Addition();
        System.out.println("Addition result: " + additionCalculator.calculate(5, 3));

        Calculator subtractionCalculator = new Subtraction();
        System.out.println("Subtraction result: " + subtractionCalculator.calculate(10, 3));

        Calculator multiplicationCalculator = new Multiplication();
        System.out.println("Multiplication result: " + multiplicationCalculator.calculate(5, 4));
    }
}