import java.util.Scanner;

public class TribonacciSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long num = Long.parseLong(scanner.nextLine());

        if (num == 1) {
            System.out.println(1);
        } else if (num == 2) {
            System.out.println(" 1 1");
        } else if (num == 3) {
            System.out.println("1 1 2");
        } else {
            System.out.print("1 1 2");
            getTribonacciNum(num);
        }
    }

    private static void getTribonacciNum(long num) {
        long a = 1;
        long b = 1;
        long c = 2;
        long max = num;
        for (int i = 1; i <= max - 3; i++) {
            num = a + b + c;
            a = b;
            b = c;
            c = num;


            System.out.printf(" %d", num);
        }
    }
}
