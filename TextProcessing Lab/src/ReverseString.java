import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String word = scanner.nextLine();

        while (!"end".equals(word)) {
            String reverse = reverseWord(word);


            System.out.printf("%s = %s%n", word, reverse);
            word = scanner.nextLine();
        }
    }

    private static String reverseWord(String word) {
        String result = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            result += word.charAt(i);
        }
        return result;
    }
}
