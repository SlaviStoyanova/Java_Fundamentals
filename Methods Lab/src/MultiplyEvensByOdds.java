import java.util.Scanner;

public class MultiplyEvensByOdds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());

        int sum = getMultipleOfEvenOdds(number);
        System.out.println(sum);
    }

    private static int getMultipleOfEvenOdds(int number) {
        int evenSum = getSumOfEvenDigits(number);
        int oddSum = getSumOfOddDigits(number);
        return evenSum * oddSum;
    }

    private static int getSumOfOddDigits(int number) {
        int evenSum = 0;
        while (Math.abs(number) > 0) {
            int digit = number % 10;
            if (digit % 2 == 0) {
                evenSum = evenSum + digit;
            }
            number = number / 10;

        }
        return evenSum;
    }

    private static int getSumOfEvenDigits(int number) {
        int oddSum = 0;
        while (Math.abs(number) > 0) {
            int digit = number % 10;
            if (digit % 2 != 0) {
                oddSum = oddSum + digit;
            }
            number = number / 10;
        }
        return oddSum;
    }


}
