import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ShoppingList_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> products = new ArrayList<>();
        String[] input = scanner.nextLine().split("\\!");
        for (int i = 0; i < input.length; i++) {
            products.add(input[i]);
        }
        String command = scanner.nextLine();

        while (!"Go Shopping!".equals(command)) {
            String[] tokens = command.split("\\s+");
            String type = tokens[0];
            String item = tokens[1];
            switch (type) {
                case "Urgent":
                    if (products.contains(item)) {
                        command = scanner.nextLine();
                        continue;
                    }
                    products.add(0, item);
                    break;
                case "Unnecessary":
                    if (products.contains(item)) {
                        products.remove(item);
                    }
                    break;
                case "Correct":
                    String newItem = tokens[2];
                    int indexOfNewItem = products.indexOf(item);
                    if (products.contains(item)) {
                        products.set(indexOfNewItem, newItem);
                    }
                    break;
                case "Rearrange":
                    if (products.contains(item)) {
                        products.remove(item);
                        products.add(item);
                    }
                    break;
            }
            command = scanner.nextLine();
        }
        for (int i = 0; i < products.size(); i++) {
            if (i == products.size() - 1) {
                System.out.print(products.get(i));
            } else {
                System.out.print(products.get(i) + ", ");
            }
        }
    }
}