import java.util.Scanner;

public class CharactersInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char first = scanner.nextLine().charAt(0);
        char second = scanner.nextLine().charAt(0);
        if (first < second) {
            printSymbolsInRange(first, second);
        } else {
            printSymbolsInRange(second, first);
        }
    }

    public static void printSymbolsInRange(char start, char end) {
        for (char i = ++start; i < end; i++) {

            System.out.printf("%c ", i);
        }
    }

}
