import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SoftUniBar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String regex = "%(?<name>[A-Z][a-z]+)%[^|%$.]*?<(?<product>\\w+)>[^|%$.]*?\\|(?<count>\\d+)\\|[^|%$.]*?(?<price>\\d+\\.?\\d+)\\$";
        Pattern pattern = Pattern.compile(regex);
        String input = scanner.nextLine();
        double income = 0.0;

        while (!"end of shift".equals(input)) {
            Matcher matcher = pattern.matcher(input);
            if (matcher.find()) {
                String name = matcher.group("name");
                String product = matcher.group("product");
                int count = Integer.parseInt(matcher.group("count"));
                double price = Double.parseDouble(matcher.group("price"));
                double totalPrice = count * price;
                income += totalPrice;
                System.out.println(String.format("%s: %s - %.2f", name, product, totalPrice));
            }
            input = scanner.nextLine();
        }
        System.out.println(String.format("Total income: %.2f", income));
    }
}
