import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StarEnigma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        List<String> attacked = new ArrayList<>();
        List<String> destroyed = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            Pattern pattern = Pattern.compile("[starSTARS]");
            Matcher matcher = pattern.matcher(input);
            int count = 0;
            while (matcher.find()) {
                count++;
            }
            String decryptedMessage = "";
            for (int j = 0; j < input.length(); j++) {
                decryptedMessage += (char) (input.charAt(j) - count);
            }
            Pattern patternDecode = Pattern.compile("@(?<name>[A-Za-z]+)([^@\\-!:>])*:(?<population>[0-9]+)([^@\\-!:>])*!(?<mode>[AD])!([^@\\-!:>])*->(?<soldiers>[0-9]+)");
            Matcher matcherDecode = patternDecode.matcher(decryptedMessage);
            if (matcherDecode.find()) {
                if ("A".equals(matcherDecode.group("mode"))) {
                    attacked.add(matcherDecode.group("name"));

                } else {
                    destroyed.add(matcherDecode.group("name"));
                }
            }
        }
        System.out.printf("Attacked planets: %d%n", attacked.size());
        attacked
                .stream()
                .sorted((p1, p2) -> p1.compareTo(p2))
                .forEach(p -> {
                    System.out.printf("-> %s%n", p);
                });
        System.out.printf("Destroyed planets: %d%n", destroyed.size());
        destroyed
                .stream()
                .sorted((p1, p2) -> p1.compareTo(p2))
                .forEach(p -> {
                    System.out.printf("-> %s%n", p);
                });
    }
}

