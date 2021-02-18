import java.util.Scanner;

public class ComputerStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String price = scanner.nextLine();
        double totalPrice = 0;
        double totalPriceWithTaxes = 0.0;
        double taxes = totalPrice * 0.2;

        while (!(price.equals("regular") || price.equals("special"))) {
            if (Double.parseDouble(price) < 0) {
                System.out.println("Invalid price!");

            } else {
                totalPrice += Double.parseDouble(price);

                taxes = totalPrice * 0.2;
                totalPriceWithTaxes = taxes + totalPrice;
            }
            price = scanner.nextLine();
            if (price.equals("special")) {
                totalPriceWithTaxes = (totalPrice + taxes) * 0.9;
            }
        }

        if (totalPrice == 0) {
            System.out.println("Invalid order!");
        } else {

            System.out.println("Congratulations you've just bought a new computer!");
            System.out.printf("Price without taxes: %.2f$%n", totalPrice);
            System.out.printf("Taxes: %.2f$%n", taxes);
            System.out.printf("-----------%n");
            System.out.printf("Total price: %.2f$%n", totalPriceWithTaxes);

        }
    }
}