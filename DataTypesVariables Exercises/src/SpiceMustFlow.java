import java.util.Scanner;

public class SpiceMustFlow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startYield = Integer.parseInt(scanner.nextLine());
        int totalYield = 0;
        int daysCount = 0;

        while (startYield >= 100) {
            totalYield += startYield - 26;
            startYield = startYield - 10;
            daysCount++;

            if (startYield < 100) {
                totalYield = totalYield - 26;
            }
        }
        System.out.println(daysCount);
        System.out.println(totalYield);
    }
}

