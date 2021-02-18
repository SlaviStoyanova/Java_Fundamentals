import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class MemoryGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> elements = new ArrayList<>();

        String[] sequence = scanner.nextLine().split("\\s+");

        for (int i = 0; i < sequence.length; i++) {
            elements.add(sequence[i]);
        }
        int moves = 0;
        String command = scanner.nextLine();
        while (!"end".equals(command)) {
            String[] tokens = command.split("\\s+");
            moves++;
            int index1 = Math.min(Integer.parseInt(tokens[0]), Integer.parseInt(tokens[1]));
            int index2 = Math.max(Integer.parseInt(tokens[0]), Integer.parseInt(tokens[1]));

            if (index1 == index2 || index1 < 0 || index2 >= elements.size()) {
                String el = "-" + moves + "a";
                int middle = elements.size() / 2;
                elements.add(middle, el);
                elements.add(middle + 1, el);
                System.out.println("Invalid input! Adding additional elements to the board");
            } else {
                if (elements.get(index1).equals(elements.get(index2))) {
                    elements.remove(index1);
                    System.out.printf("Congrats! You have found matching elements - %s!%n", elements.remove(index2 - 1));
                } else {
                    System.out.println("Try again!");
                }
                if (elements.isEmpty()) {
                    System.out.printf("You have won in %d turns!%n", moves);
                    break;
                }
            }

            command = scanner.nextLine();
        }
        if (!elements.isEmpty()) {
            System.out.println("Sorry you lose :(");
            System.out.println(elements.toString().replaceAll("[\\[\\],]", ""));
        }
    }
}

