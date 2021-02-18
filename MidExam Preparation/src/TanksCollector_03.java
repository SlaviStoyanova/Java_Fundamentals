import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class TanksCollector_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> tanks = Arrays.stream(scanner.nextLine().split(", ")).collect(Collectors.toList());

        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String[] tokens = scanner.nextLine().split(", ");
            String command = tokens[0];
            switch (command) {
                case "Add":
                    String tankName = tokens[1];
                    if (tanks.contains(tankName)) {
                        System.out.println("Tank is already bought");
                    } else {
                        tanks.add(tankName);
                        System.out.println("Tank successfully bought");
                    }
                    break;
                case "Remove":
                    String tankName1 = tokens[1];
                    if (tanks.contains(tankName1)) {
                        tanks.remove(tankName1);
                        System.out.println("Tank successfully sold");
                    } else {
                        System.out.println("Tank not found");
                    }
                    break;
                case "Remove At":
                    int currIndex = Integer.parseInt(tokens[1]);
                    if (currIndex >= 0 && currIndex < tanks.size()) {
                        tanks.remove(currIndex);
                        System.out.println("Tank successfully sold");
                    } else {
                        System.out.println("Index out of range");
                    }
                    break;
                case "Insert":
                    int index = Integer.parseInt(tokens[1]);
                    String name = tokens[2];
                    if (index >= 0 && index < tanks.size()) {
                        if (tanks.contains(name)) {
                            System.out.println("Tank is already bought");
                        } else {
                            tanks.add(index, name);
                            System.out.println("Tank successfully bought");
                        }
                    } else {
                        System.out.println("Index out of range");
                    }
                    break;
            }
        }
        System.out.println(tanks.toString().replaceAll("[\\[\\]]", ""));
    }
}
