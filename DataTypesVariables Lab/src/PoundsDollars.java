import java.util.Scanner;

public class PoundsDollars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double pounds = Double.parseDouble(scanner.nextLine());

        double poundsToDollars = 1.31;
        System.out.printf("%.3f", pounds * poundsToDollars);

    }
}
