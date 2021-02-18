import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SchoolLibrary_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> library = new ArrayList<>();
        String[] output = scanner.nextLine().split("&");
        for (String s : output) {
            library.add(s);
        }
        String input = scanner.nextLine();

        while (!"Done".equals(input)) {
            String[] tokens = input.split("\\s+\\|\\s+");
            String command = tokens[0];
            switch (command) {

                case "Add Book":
                    String bookName = tokens[1];
                    if (!library.contains(bookName)) {
                        library.add(0, bookName);
                    }
                    break;
                case "Take Book":
                    bookName = tokens[1];
                    if (library.contains(bookName)) {
                        library.remove(bookName);
                    }
                    break;
                case "Swap Books":
                    String book1 = tokens[1];
                    String book2 = tokens[2];
                    int indexBook1 = library.indexOf(tokens[1]);
                    int indexBook2 = library.indexOf(tokens[2]);
                    if (library.contains(book1) && library.contains(book2)) {
                        Collections.swap(library, indexBook1, indexBook2);
                    }
                    break;
                case "Insert Book":
                    bookName = tokens[1];
                    library.add(bookName);
                    break;
                case "Check Book":
                    int index = Integer.parseInt(tokens[1]);
                    if (index >= 0 && index < library.size()) {
                        String book = library.get(index);
                        if (library.contains(book)) {
                            System.out.println(book);
                        }
                        break;
                    }
            }
            input = scanner.nextLine();
        }

        System.out.print(String.join(", ", library));

    }
}