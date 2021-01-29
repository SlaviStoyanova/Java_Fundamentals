import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CardsGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> cardsFirst = readListCardsFirst(scanner);
        List<Integer> cardsSecond = readListCardsSecond(scanner);

        int lengthFirst = cardsFirst.size();
        int lengthSecond = cardsSecond.size();
        while (lengthFirst > 0 && lengthSecond > 0) {
            if (cardsFirst.get(0) > cardsSecond.get(0)) {
                cardsFirst.add(cardsFirst.get(0));
                cardsFirst.remove(0);
                cardsFirst.add(cardsSecond.get(0));
                cardsSecond.remove(0);
                lengthSecond--;
                lengthFirst++;
            } else if (cardsFirst.get(0) < cardsSecond.get(0)) {
                cardsSecond.add(cardsSecond.get(0));
                cardsSecond.remove(0);
                cardsSecond.add(cardsFirst.get(0));
                cardsFirst.remove(0);
                lengthFirst--;
                lengthSecond++;
            } else if (cardsFirst.get(0).equals(cardsSecond.get(0))) {
                cardsFirst.remove(0);
                cardsSecond.remove(0);
                lengthFirst--;
                lengthSecond--;
            }
        }
        int sum = 0;
        if (lengthFirst == 0) {
            for (int i = 0; i < cardsSecond.size(); i++) {
                sum += cardsSecond.get(i);
            }
            System.out.printf("Second player wins! Sum: %d", sum);
        } else {
            for (int i = 0; i < cardsFirst.size(); i++) {
                sum += cardsFirst.get(i);
            }
            System.out.printf("First player wins! Sum: %d", sum);
        }

    }

    private static List<Integer> readListCardsSecond(Scanner scanner) {
        List<Integer> cardsSecond = new ArrayList<>();
        String[] secondPlayer = scanner.nextLine().split(" ");
        for (String s : secondPlayer) {
            cardsSecond.add(Integer.parseInt(s));
        }
        return cardsSecond;
    }

    private static List<Integer> readListCardsFirst(Scanner scanner) {
        List<Integer> cardsFirst = new ArrayList<>();
        String[] firstPlayer = scanner.nextLine().split(" ");
        for (String s : firstPlayer) {
            cardsFirst.add(Integer.parseInt(s));
        }
        return cardsFirst;
    }
}
