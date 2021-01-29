import java.util.Scanner;

public class VowelsCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String word = scanner.nextLine();

        int count = countOfVowels(word);
        System.out.println(count);

    }

    private static int countOfVowels(String text) {
        int counter = 0;
        for (int i = 0; i < text.length(); i++) {
            char letter = text.toLowerCase().charAt(i);
            switch (letter) {
                case 'a':
                case 'u':
                case 'o':
                case 'i':
                case 'e':
                    counter++;
                    break;
            }
        }
        return counter;
    }
}



