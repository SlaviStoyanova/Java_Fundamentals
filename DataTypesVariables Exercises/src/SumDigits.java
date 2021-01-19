import java.util.Scanner;

public class SumDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        // 123 % 10 = 3
        // 123 / 10 = 12
        // 12 % 10 = 2
        //12/ 10 = 1
        // 1% 10 =1
        int sum = 0;
        while (number > 0) {
            int lastDigit = number % 10;
            sum += lastDigit;
            number = number / 10;
        }
        System.out.println(sum);
    }
}
