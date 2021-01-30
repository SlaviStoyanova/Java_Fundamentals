import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SoftUniExamResults {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> users = new HashMap<>();
        Map<String, Integer> languages = new HashMap<>();

        String input = scanner.nextLine();

        while (!"exam finished".equals(input)) {
            String[] tokens = input.split("-");
            String username = tokens[0];
            String language = tokens[1];
            if (language.equals("banned")) {
                users.remove(username);
                input = scanner.nextLine();
                continue;
            }
            int currentPoints = Integer.parseInt(tokens[2]);
            users.putIfAbsent(username, 0);
            int points = users.get(username);
            if (points < currentPoints) {
                users.put(username, currentPoints);
            }
            languages.putIfAbsent(language, 0);
            int count = languages.get(language) + 1;
            languages.put(language, count);

            input = scanner.nextLine();
        }
        System.out.println("Results:");

        users
                .entrySet()
                .stream()
                .sorted((s1, s2) -> {
                    int result = s2.getValue().compareTo(s1.getValue());
                    if (result == 0) {
                        result = s1.getKey().compareTo(s2.getKey());
                    }
                    return result;
                })
                .forEach(entry -> System.out.println(String.format("%s | %d", entry.getKey(), entry.getValue())));
        System.out.println("Submissions:");

        languages.entrySet()
                .stream()
                .sorted((l1, l2) -> {
                    int result = l2.getValue().compareTo(l1.getValue());
                    if (result == 0) {
                        result = l1.getKey().compareTo(l2.getKey());
                    }
                    return result;
                })
                .forEach(entry -> System.out.println(String.format("%s - %d", entry.getKey(), entry.getValue())));

    }
}
