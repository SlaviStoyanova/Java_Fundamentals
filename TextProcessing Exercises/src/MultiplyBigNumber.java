import java.util.Scanner;
import java.util.SplittableRandom;

public class MultiplyBigNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String reallyBigNumber = scanner.nextLine();
        int number = Integer.parseInt(scanner.nextLine());
        if (number == 0) {
            System.out.println(0);
            return;
        }
        while (reallyBigNumber.charAt(0) == '0') {
            reallyBigNumber = reallyBigNumber.substring(1);
        }
        StringBuilder sb = new StringBuilder();

        int reminder = 0;
        for (int i = reallyBigNumber.length() - 1; i >= 0; i--) {
            int digit = Integer.parseInt(String.valueOf(reallyBigNumber.charAt(i)));//'9' - "9" -9

            int result = number * digit + reminder;
            reminder = 0;
            if (result > 9) {
                reminder = result / 10;
                result = result % 10;  //25 / 10 = 2
            }
            sb.append(result);
        }
        if (reminder != 0) {
            sb.append(reminder);
        }
        System.out.println(sb.reverse().toString());
    }
}
