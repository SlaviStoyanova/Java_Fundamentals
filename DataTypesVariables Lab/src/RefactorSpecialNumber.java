import java.util.Scanner;

public class RefactorSpecialNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= count; i++) {
            int digitSum = 0;
            int currentNum = i;
            while (currentNum > 0) {
                digitSum += currentNum % 10;
                currentNum = currentNum / 10;
            }
            boolean isSpecialNum = (digitSum == 5) || (digitSum == 7) || (digitSum == 11);
            if (isSpecialNum) {
                System.out.printf("%d -> True %n", digitSum);
            } else {
                System.out.printf("%d -> False %n", digitSum);
            }
        }
    }
}