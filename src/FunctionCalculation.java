//16
import java.util.Scanner;

public class FunctionCalculation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть значення a: ");
        double a = scanner.nextDouble();

        System.out.print("Введіть значення b: ");
        double b = scanner.nextDouble();

        System.out.print("Введіть значення x: ");
        double x = scanner.nextDouble();

        double fx = calculateFunction(a, b, x);

        System.out.println("f(x) = " + fx);
    }

    public static double calculateFunction(double a, double b, double x) {
        if (x >= 0 && x < 1) {
            return Math.sin(x + 1);
        } else if (x >= 1 && x < 7) {
            return a * Math.pow(x, 2) + 2 * b * x - 4;
        } else if (x == 7) {
            return 1 / (a * x + b);
        } else {
            throw new IllegalArgumentException("x має бути в межах [0, 7]");
        }
    }
}