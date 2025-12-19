import java.util.Scanner;

class Calculator {
    double a;
    double b;
    String operation;

    Calculator(double a, double b, String operation) {
        this.a = a;
        this.b = b;
        this.operation = operation.toLowerCase();
    }

    double calculate() {
        switch (operation) {
            case "add":
                return a + b;
            case "subtract":
                return a - b;
            case "multiply":
                return a * b;
            case "divide":
                if (b == 0) {
                    System.out.println("Division by zero is not allowed");
                    return 0;
                }
                return a / b;
            default:
                System.out.println("Invalid operation");
                return 0;
        }
    }
}

public class Problem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value of a: ");
        double a = sc.nextDouble();

        System.out.print("Enter value of b: ");
        double b = sc.nextDouble();

        System.out.print("Enter operation (add/subtract/multiply/divide): ");
        String operation = sc.next();

        Calculator calc = new Calculator(a, b, operation);
        double result = calc.calculate();

        System.out.println("Result: " + result);
        sc.close();
    }
}
