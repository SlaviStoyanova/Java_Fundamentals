import java.util.Scanner;

public class FactorialDivision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double firstNumber = Double.parseDouble(scanner.nextLine());
        double secondNumber = Double.parseDouble(scanner.nextLine());
        double result = factorialDivision(firstNumber, secondNumber);
        System.out.printf("%.2f", result);
    }

    private static double factorialDivision(double num1, double num2) {
        double firstFactorial = findFactorial(num1);
        double secondFactorial = findFactorial(num2);
        double result = firstFactorial / secondFactorial;
        return result;
    }

    public static double findFactorial(double number) {
        double result = 1;
        for (int i = 1; i <= number; i++) {
            result *= i;
        }
        return result;
    }
}
