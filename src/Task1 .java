// завдання 1
// 16 Варіант
import java.util.Scanner;

class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double a = 9.6;
        double b = 8.2;
        double c = 2;
        double k = 0.7;

        double x = calculateX(a, b, c);
        double y = calculateY(a, b, c, k);

        System.out.printf("x = %.4f%n", x);
        System.out.printf("y = %.4f%n", y);
    }

    private static double calculateX(double a, double b, double c) {
        return Math.log(a + Math.pow(c, 2)) + Math.pow(Math.sin(c / b), 2);
    }

    private static double calculateY(double a, double b, double c, double k) {
        return Math.exp(-k * c) * ((c + Math.sqrt(c + a)) / (c - Math.sqrt(Math.abs(c - b))));
    }
}