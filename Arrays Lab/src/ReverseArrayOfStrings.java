import java.util.Scanner;

public class ReverseArrayOfStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String parts[] = scanner.nextLine().split(" ");
         //0 -> parts.length -1
        // 1 -> parts.lenght -2
        for (int i = 0; i < parts.length / 2; i++) {

            String tmp = parts[i];
            parts[i] = parts[parts.length - i - 1];
            parts[parts.length - i - 1] = tmp;
        }
        System.out.println(String.join(" ", parts));
    }
}
