import java.util.Scanner;

public class MultiplyThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        int num3 = Integer.parseInt(scanner.nextLine());
        getMultiplyThreeNumbers(num1, num2, num3);

    }

    private static void getMultiplyThreeNumbers(int a, int b, int c) {
        if (b == 0 || a == 0 || c == 0) {
            System.out.println("zero");
        } else if (a > 0 && b > 0 && c > 0) {
            System.out.println("positive");

        } else if (a > 0 || b > 0 || c < 0) {
            System.out.println("negative");


        }
    }
}

