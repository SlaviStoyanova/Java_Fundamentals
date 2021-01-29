import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ChangeList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = readList(scanner);

        String input = scanner.nextLine();
        while (!"end".equals(input)) {
            String[] tokens = input.split("\\s+");
            String command = tokens[0];
            Integer element = Integer.valueOf(tokens[1]);
            if ("Delete".equals(command)) {
                while (numbers.contains(element)) {
                    numbers.remove(element);
                }

            } else if ("Insert".equals(command)) {
                int position = Integer.parseInt(tokens[2]);
                if (position >= 0 && position < numbers.size()) {
                    numbers.add(position, element);
                }
            }
            input = scanner.nextLine();
        }
        printList(numbers);
    }

    private static void printList(List<Integer> list) {
        for (Integer element : list) {
            System.out.print(element + " ");
        }
    }

    private static List<Integer> readList(Scanner scanner) {
        List<Integer> numbers = new ArrayList<>();
        String[] input = scanner.nextLine().split("\\s+");
        for (String s : input) {
            numbers.add(Integer.parseInt(s));
        }
        return numbers;
    }
}
