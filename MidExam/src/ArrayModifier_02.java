import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ArrayModifier_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> elements = new ArrayList<>();
        String[] parts = scanner.nextLine().split("\\s+");
        for (String s : parts) {
            elements.add(Integer.parseInt(s));
        }
        String input = scanner.nextLine();
        while (!"end".equals(input)) {
            String[] tokens = input.split("\\s+");
            String command = tokens[0];
            switch (command) {
                case "swap":
                    int indexOne = Integer.parseInt(tokens[1]);
                    int indexTwo = Integer.parseInt(tokens[2]);
                    Collections.swap(elements, indexOne, indexTwo);
                    break;
                case "multiply":
                    indexOne = Integer.parseInt(tokens[1]);
                    indexTwo = Integer.parseInt(tokens[2]);
                    int result = elements.get(indexOne) * elements.get(indexTwo);
                    elements.set(indexOne, result);
                    break;
                case "decrease":
                    for (int i = 0; i < elements.size(); i++) {
                        elements.set(i, elements.get(i) - 1);
                    }
                    break;
            }
            input = scanner.nextLine();
        }
        System.out.println(elements.toString().replaceAll("[\\[\\]]", ""));
    }
}
