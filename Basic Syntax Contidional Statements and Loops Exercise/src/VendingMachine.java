import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();
        double sum = 0.0;

        while (!command.equals("Start")) {
            double coins = Double.parseDouble(command);
            if (coins == 0.1 || coins == 0.2 || coins == 0.5 || coins == 1 || coins == 2) {
                sum += coins;
            } else {
                System.out.printf("Cannot accept %.2f%n", coins);
            }
            command = scanner.nextLine();
        }
        String product = scanner.nextLine();
        double price = 0.0;
        boolean isOk = false;
        while (!"End".equals(product)) {
            switch (product) {
                case "Nuts":
                    price = 2.0;
                    isOk = true;
                    break;
                case "Water":
                    price = 0.7;
                    isOk = true;
                    break;
                case "Crisps":
                    price = 1.5;
                    isOk = true;
                    break;
                case "Soda":
                    price = 0.8;
                    isOk = true;
                    break;
                case "Coke":
                    price = 1.0;
                    isOk = true;
                    break;
            }
            if (sum < price) {
                System.out.println("Sorry, not enough money");
            } else if (isOk) {
                System.out.printf("Purchased %s%n", product);
                sum -= price;
            } else {
                System.out.println("Invalid product");
            }
            product = scanner.nextLine();
        }
        System.out.printf("Change: %.2f%n", sum);
    }
}
