import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SeizeFire_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] cells = scanner.nextLine().split("#");
        int water = Integer.parseInt(scanner.nextLine());
        double efforts = 0.0;

        List<Integer> cellsPutOut = new ArrayList<>();
        for (String cell : cells) {
            String[] tokens = cell.split(" = ");
            String level = tokens[0];
            int value = Integer.parseInt(tokens[1]);
            boolean isValid = false;
            switch (level) {
                case "High":
                    if (value >= 81 && value <= 125) {
                        isValid = true;
                    }
                    break;
                case "Medium":
                    if (value >= 51 && value <= 80) {
                        isValid = true;
                    }
                    break;
                case "Low":
                    if (value >= 1 && value <= 50) {
                        isValid = true;
                    }
                    break;
            }
            if (isValid) {
                if (water >= value) {
                    water -= value;
                    efforts += 0.25 * value;
                    cellsPutOut.add(value);
                }
            }
        }
        System.out.println("Cells:");
        cellsPutOut.forEach(c -> System.out.printf(" - %d%n", c));
        System.out.printf("Effort: %.2f%n", efforts);
        System.out.printf("Total Fire: %d", cellsPutOut.stream().mapToInt(c -> c).sum());
    }
}