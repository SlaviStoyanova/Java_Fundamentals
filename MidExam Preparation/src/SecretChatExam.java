import java.util.Scanner;

public class SecretChatExam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String initialMessage = scanner.nextLine();
        String command = scanner.nextLine();

        StringBuilder result = new StringBuilder(initialMessage);
        while (!command.equals("Reveal")) {

            String[] parts = command.split(":\\|:");
            String commandName = parts[0];
            switch (commandName) {
                case "InsertSpace":
                    int index = Integer.parseInt(parts[1]);
                    result.insert(index, " ");
                    break;
                case "Reverse":
                    String search = parts[1];
                    int indexOfSearch = result.indexOf(search);
                    if (indexOfSearch >= 0) {
                        result.delete(indexOfSearch, indexOfSearch + search.length());
                        String reversed = new StringBuilder(search).reverse().toString();
                        result.append(reversed);

                    } else {
                        System.out.println("error");
                        command = scanner.nextLine();
                        continue;
                    }
                    break;
                case "ChangeAll":
                    String find = parts[1];
                    String replace = parts[2];
                    String replaced = result.toString().replace(find, replace);
                    result = new StringBuilder(replaced);
                    break;
            }
            System.out.println(result);
            command = scanner.nextLine();

        }
        System.out.println("You have a new text message: " + result);
    }
}
