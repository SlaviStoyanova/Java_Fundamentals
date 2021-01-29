import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchDates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        String regex = "\\b(?<day>\\d{2})([\\.\\-\\/])(?<month>[A-Z][a-z]{2})\\2(?<year>\\d{4})\\b";

        Pattern pattern = Pattern.compile(regex);
        Matcher dateMatch = pattern.matcher(text);

        while (dateMatch.find()) {
            System.out.printf("Day: %s, Month: %s, Year: %s%n",
                    dateMatch.group("day"),
                    dateMatch.group("month"),
                    dateMatch.group("year"));
        }
    }
}
