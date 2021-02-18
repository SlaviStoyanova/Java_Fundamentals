import java.util.Scanner;

public class DisneyLandJourney_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double journeyCost = Double.parseDouble(scanner.nextLine());
        int mouths = Integer.parseInt(scanner.nextLine());
        double collectedMoney = 0;

        for (int i = 1; i <= mouths; i++) {
            if (i != 1 && i % 2 != 0) {
                collectedMoney = 0.84 * collectedMoney;
            }
            if (i % 4 == 0) {
                collectedMoney = 1.25 * collectedMoney;
            }
            collectedMoney = (0.25 * journeyCost) + collectedMoney;
        }
        if (collectedMoney >= journeyCost) {
            double leftMoney = collectedMoney - journeyCost;
            System.out.printf("Bravo! You can go to Disneyland and you will have %.2flv. for souvenirs.", leftMoney);
        } else {
            double needMoney = journeyCost - collectedMoney;
            System.out.printf("Sorry. You need %.2flv. more.", needMoney);
        }
    }
}
