import java.util.Scanner;

public class RangeExpenses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lostGamesCount = Integer.parseInt(scanner.nextLine());
        double headsetPrice = Double.parseDouble(scanner.nextLine());
        double mousePrice = Double.parseDouble(scanner.nextLine());
        double keyboardPrice = Double.parseDouble(scanner.nextLine());
        double displayPrice = Double.parseDouble(scanner.nextLine());

        double expenses = 0.0;
        int trashedKeyboard = 0;
        for (int i = 1; i <= lostGamesCount; i++) {
            if (i % 2 == 0) {
                expenses += headsetPrice;
            }
            if (i % 3 == 0) {
                expenses += mousePrice;
            }
            if (i % 2 == 0 && i % 3 == 0) {
                expenses += keyboardPrice;
                trashedKeyboard++;
                if (trashedKeyboard == 2) {
                    trashedKeyboard = 0;
                    expenses += displayPrice;
                }
            }

        }
        System.out.printf("Rage expenses: %.2f lv.", expenses);
    }
}
