import java.util.Scanner;

public class MathOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNumber = Integer.parseInt(scanner.nextLine());
        String operator = scanner.nextLine();
        int secondNumber = Integer.parseInt(scanner.nextLine());

        double result = calculate(firstNumber, operator, secondNumber);
        System.out.printf("%.0f", result);
    }

    private static double calculate(int firstNumber, String operator, int secondNumber) {
        double result = 0.0;
        switch (operator) {
            case "/":
                result = (firstNumber * 1.0) / secondNumber;
                break;
            case "*":
                result = firstNumber * 1.0 * secondNumber;
                break;
            case "+":
                result = (firstNumber * 1.0) + secondNumber;
                break;
            case "-":
                result = (firstNumber * 1.0) - secondNumber;
                break;
        }
        return result;
    }
}
