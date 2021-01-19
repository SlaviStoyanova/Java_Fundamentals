import java.util.Scanner;

public class Vacantion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int groupOfPeople = Integer.parseInt(scanner.nextLine());
        String typeOfGroup = scanner.nextLine();
        String day = scanner.nextLine();
        double totalPrice = 0;

        if (typeOfGroup.equals("Students")) {

            if (day.equals("Friday")) {
                totalPrice = 8.45 * groupOfPeople;
            } else if (day.equals("Saturday")) {
                totalPrice = 9.80 * groupOfPeople;
            } else if (day.equals("Sunday")) {
                totalPrice = 10.46 * groupOfPeople;
            }
            if (groupOfPeople >= 30) {
                totalPrice = totalPrice * 0.85;
            }
        } else if (typeOfGroup.equals("Business")) {
            if (groupOfPeople >= 100) {
                groupOfPeople = (groupOfPeople - 10);
            }
            if (day.equals("Friday")) {
                totalPrice = 10.90 * groupOfPeople; //1199
            } else if (day.equals("Saturday")) {
                totalPrice = 15.60 * groupOfPeople;
            } else if (day.equals("Sunday")) {
                totalPrice = 16.00 * groupOfPeople;
            }

        } else if (typeOfGroup.equals("Regular")) {
            if (day.equals("Friday")) {
                totalPrice = 15.0 * groupOfPeople;
            } else if (day.equals("Saturday")) {
                totalPrice = 20.0 * groupOfPeople;
            } else if (day.equals("Sunday")) {
                totalPrice = 22.50 * groupOfPeople;
            }
            if (groupOfPeople >= 10 && groupOfPeople <= 20) {
                totalPrice = totalPrice * 0.95;
            }
        }
        System.out.printf("Total price: %.2f ", totalPrice);
    }
}
