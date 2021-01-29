import java.util.Scanner;

public class MiddleCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        printMiddleCharacter(text);
    }

    private static void printMiddleCharacter(String text) {
        if (text.length() % 2 == 0) {
            char symbolOne = text.charAt(text.length() / 2 - 1);
            System.out.print(symbolOne);
        }
        char symbolTwo = text.charAt(text.length() / 2);
        System.out.print(symbolTwo);

    }
}


