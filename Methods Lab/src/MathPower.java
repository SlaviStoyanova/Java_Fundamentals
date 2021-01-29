import java.text.DecimalFormat;
import java.util.Scanner;

public class MathPower {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double number = Double.parseDouble(scanner.nextLine());
        int power = Integer.parseInt(scanner.nextLine());

        double result = mathPower(number, power);
        System.out.println(new DecimalFormat("0.####").format(result));
    }

    private static double mathPower(double number, int power) {
        double result = 1;
        for (int i = 0; i < power; i++) {
            result = result * number;

        }
        return result;
    }
}
