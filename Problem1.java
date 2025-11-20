import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a, b and operation: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        String op = sc.nextLine().trim();
        op = sc.nextLine().trim();

        Calculator calc = new Calculator();
        double result = calc.calculate(a, b, op);

        if (Double.isNaN(result)) {
            System.out.println("Invalid operation or division by zero");
        } else {
            System.out.println("Result: " + result);
        }
        sc.close();
    }
}

class Calculator{
    public double calculate(double a, double b, String operation) {
        return switch (operation.toLowerCase()) {
            case "addition", "+"      -> a + b;
            case "subtraction", "-"   -> a - b;
            case "multiplication", "*"-> a * b;
            case "division", "/"      -> b == 0 ? Double.NaN : a / b;
            default                   -> Double.NaN;
        };
    }
}