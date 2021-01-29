import java.util.Scanner;

public class AddAndSubtract {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int first = Integer.parseInt(scanner.nextLine());
        int second = Integer.parseInt(scanner.nextLine());
        int third = Integer.parseInt(scanner.nextLine());

        int sum = getSum(first, second);
        int result = printSubtract(sum, third);
        System.out.println(result);

    }

    private static int printSubtract(int sum, int third) {
        int result;
        result = sum - third;
        return result;
    }

    private static int getSum(int first, int second) {

        return first + second;
    }
}
