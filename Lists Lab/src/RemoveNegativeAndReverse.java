import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class RemoveNegativeAndReverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = readIntList(scanner);

        for (int i = 0; i < numbers.size(); i++) {
            int current = numbers.get(i);
            if (current < 0) {
                numbers.remove(i--);
            }
        }
        Collections.reverse(numbers);


        if (numbers.size() == 0) {
            System.out.println("empty");
        } else {
            System.out.println(numbers.toString().replaceAll("[\\[\\],]", ""));
        }
    }

    private static List<Integer> readIntList(Scanner scanner) {
        List<Integer> output = new ArrayList<>();
        String[] input = scanner.nextLine().split(" ");
        for (String s : input) {
            output.add(Integer.parseInt(s));
        }
        return output;
    }
}
