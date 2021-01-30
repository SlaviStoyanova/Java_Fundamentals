import java.util.Scanner;

public class ReplaceRepeatingChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        StringBuilder sb = new StringBuilder();
        char base = input.charAt(0);
        sb.append(base);
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            if (currentChar != base) {
                sb.append(currentChar);
                base = currentChar;
            }
        }
        System.out.println(sb);
    }
}