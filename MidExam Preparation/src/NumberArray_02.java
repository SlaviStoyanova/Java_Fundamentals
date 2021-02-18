import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NumberArray_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = new ArrayList<>();
        String[] number = scanner.nextLine().split(" ");
        for (String s : number) {
            numbers.add(Integer.parseInt(s));
        }
        String input = scanner.nextLine();
        while (!"End".equals(input)) {
            String[] tokens = input.split("\\s+");
            String command = tokens[0];
            switch (command) {
                case "Switch":
                    int index = Integer.parseInt(tokens[1]);
                    if (index >= 0 && index < numbers.size()) {
                        numbers.set(index, numbers.get(index) * -1);
                    }
                    break;
                case "Change":
                    int givenIndex = Integer.parseInt(tokens[1]);
                    int value = Integer.parseInt(tokens[2]);
                    if (givenIndex >= 0 && givenIndex < numbers.size()) {
                        numbers.set(givenIndex, value);
                    }
                    break;
                case "Sum":
                    if (tokens[1].equals("Negative")) {
                        int sum = 0;
                        for (int i = 0; i < numbers.size(); i++) {
                            if (numbers.get(i) < 0) {
                                sum += numbers.get(i);
                            }
                        }
                        System.out.println(sum);
                    } else if (tokens[1].equals("Positive")) {
                        int sum = 0;
                        for (int i = 0; i < numbers.size(); i++) {
                            if (numbers.get(i) >= 0) {
                                sum += numbers.get(i);
                            }
                        }
                        System.out.println(sum);

                    } else if (tokens[1].equals("All")) {
                        int sum = 0;
                        for (int i = 0; i < numbers.size(); i++) {
                            sum += numbers.get(i);
                        }
                        System.out.println(sum);
                    }
                    break;
            }
            input = scanner.nextLine();
        }
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) >= 0) {
                if (i < numbers.size() - 1) {
                    System.out.print(numbers.get(i) + " ");
                } else {
                    System.out.println(numbers.get(i));
                }
            }
        }
    }
}
