import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Inventory_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> journal = new ArrayList<>();
        String[] collections = scanner.nextLine().split(", ");
        for (String s : collections) {
            journal.add(s);
        }
        String input = scanner.nextLine();

        while (!"Craft!".equals(input)) {
            String[] tokens = input.split(" - ");
            String command = tokens[0];
            String item = tokens[1];

            switch (command) {
                case "Collect":
                    if (!journal.contains(item)) {
                        journal.add(item);
                    }
                    break;
                case "Drop":
                    if (journal.contains(item)) {
                        journal.remove(item);
                    }
                    break;
                case "Combine Items":
                    String[] parts = tokens[1].split(":");
                    String oldItem = parts[0];
                    String newItem = parts[1];
                    if (journal.contains(oldItem)) {
                        int index = journal.indexOf(oldItem);
                        journal.add(index + 1, newItem);
                    }
                    break;
                case "Renew":
                    if (journal.contains(item)) {
                        journal.remove(item);
                        journal.add(item);
                    }
                    break;
            }
            input = scanner.nextLine();
        }
        System.out.println(String.join(", ", journal));
    }
}
