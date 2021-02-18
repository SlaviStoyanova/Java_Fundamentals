import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MovingTarget_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> targets = new ArrayList<>();
        String[] input = scanner.nextLine().split(" ");
        for (String s : input) {
            targets.add(Integer.parseInt(s));
        }
        String command = scanner.nextLine();

        while (!"End".equals(command)) {
            String[] tokens = command.split(" ");
            String currentCommand = tokens[0];
            int index = Integer.parseInt(tokens[1]);
            switch (currentCommand) {
                case "Shoot":
                    int power = Integer.parseInt(tokens[2]);
                    if (index >= 0 && index < targets.size()) {
                        targets.set(index, targets.get(index) - power);

                        if (targets.get(index) <= 0) {
                            targets.remove(index);
                        }
                    }
                    break;
                case "Add":
                    int value = Integer.parseInt(tokens[2]);
                    if (index >= 0 && index < targets.size()) {
                        targets.add(index, value);
                    } else {
                        System.out.println("Invalid placement!");
                    }
                    break;
                case "Strike":
                    int radius = Integer.parseInt(tokens[2]);
                    boolean indexInRange = (index >= 0 && index < targets.size());
                    boolean radiusInRange = (index - radius >= 0 && index + radius < targets.size());
                    if (indexInRange && radiusInRange) {
                        for (int i = 0; i < radius; i++) {
                            targets.remove(index - 1);
                            index = index - 1;
                            targets.remove(index + 1);
                        }
                        targets.remove(index);
                    } else {
                        System.out.println("Strike missed!");
                    }
                    break;
            }
            command = scanner.nextLine();
        }
        for (int i = 0; i < targets.size(); i++) {
            if (i == 0) {
                System.out.print(targets.get(i));

            } else {
                System.out.printf("|%d", targets.get(i));
            }
        }
    }
}
