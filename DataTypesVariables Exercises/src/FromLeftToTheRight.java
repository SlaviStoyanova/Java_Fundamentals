import java.util.Scanner;

public class FromLeftToTheRight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            long leftNumber = scanner.nextLong();
            long rightNumber = scanner.nextLong();
            int sum = 0;
            if (leftNumber > rightNumber) {
                while (leftNumber != 0) {

                    sum += leftNumber % 10;
                    leftNumber = leftNumber / 10;
                }
            } else {
                while ((rightNumber != 0)) {
                    sum += rightNumber % 10;
                    rightNumber = rightNumber / 10;
                }
            }
            System.out.println(Math.abs(sum));
        }

    }
}
