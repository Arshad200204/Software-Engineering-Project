import java.util.Scanner;

// Class Calculator
class Calculator {
    public static double add(double x, double y) {
        return x + y;
    }

    public static double subtract(double x, double y) {
        return x - y;
    }

    public static double multiply(double x, double y) {
        return x * y;
    }

    public static double divide(double x, double y) {
        if (y == 0) {
            throw new ArithmeticException("Cannot divide by zero.");
        }
        return x / y;
    }
}

// Class Main
class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter first number: ");
        double x = input.nextDouble();

        System.out.println("Enter second number: ");
        double y = input.nextDouble();

        System.out.println("Enter operator (+, -, *, /): ");
        char operator = input.next().charAt(0);

        double result;

        switch (operator) {
            case '+':
                result = Calculator.add(x, y);
                break;

            case '-':
                result = Calculator.subtract(x, y);
                break;

            case '*':
                result = Calculator.multiply(x, y);
                break;

            case '/':
                result = Calculator.divide(x, y);
                break;

            default:
                System.out.println("Invalid operator.");
                return;
        }

        System.out.println("Result: " + result);

        input.close();
    }
}
