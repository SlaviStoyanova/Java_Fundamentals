import java.util.Scanner;

public class RepeatString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int count = Integer.parseInt(scanner.nextLine());
        String result = repeatResult(input, count);
        System.out.println(result);
    }

    private static String repeatResult(String input, int count) {
        String result = "";

        for (int i = 0; i < count; i++) {
            result += input;
        }
        return result;
    }
}


