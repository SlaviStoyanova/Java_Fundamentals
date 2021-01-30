import java.util.Scanner;

public class DigitsLettersSymbols {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        StringBuilder digits = new StringBuilder();
        StringBuilder letters = new StringBuilder();
        StringBuilder symbols = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char current = input.charAt(i);
            if (Character.isAlphabetic(current)) {
                letters.append(current);
            } else if (Character.isDigit(current)) {
                digits.append(current);
            } else {
                symbols.append(current);
            }
        }
        System.out.println(digits);
        System.out.println(letters);
        System.out.println(symbols);
    }
}
