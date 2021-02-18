import java.util.Arrays;
import java.util.Scanner;

public class ArcheryTournament_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] targets = Arrays.stream(scanner.nextLine().split("\\|")).mapToInt(e -> Integer.parseInt(e)).toArray();

        String command = scanner.nextLine();
        int sumPoints = 0;

        while (!"Game over".equals(command)) {
            String[] tokens = command.split("@");
            String currentCommand = tokens[0];

            switch (currentCommand) {
                case "Shoot Left":
                    int startIndex = Integer.parseInt(tokens[1]);
                    int length = Integer.parseInt(tokens[2]);
                    if (startIndex >= 0 && startIndex < targets.length) {
                        sumPoints = shootLeft(targets, sumPoints, startIndex, length);
                    }
                    break;
                case "Shoot Right":
                    startIndex = Integer.parseInt(tokens[1]);
                    length = Integer.parseInt(tokens[2]);
                    if (startIndex >= 0 && startIndex < targets.length) {
                        sumPoints = shootRight(targets, sumPoints, startIndex, length);
                    }
                    break;
                case "Reverse":
                    reverseArray(targets);
                    break;
            }
            command = scanner.nextLine();
        }
        printArray(targets);
        System.out.printf("Iskren finished the archery tournament with %d points!", sumPoints);
    }

    private static int shootRight(int[] targets, int sumPoints, int startIndex, int length) {
        int currentIndex;
        currentIndex = startIndex + length;
        if (currentIndex > targets.length - 1) {
            while (currentIndex > targets.length - 1) {
                currentIndex -= targets.length;
            }
        }
        sumPoints = getSum(targets, sumPoints, currentIndex);
        return sumPoints;
    }

    private static int shootLeft(int[] targets, int sumPoints, int startIndex, int length) {
        int currentIndex;
        currentIndex = startIndex - length;
        if (currentIndex < 0) {
            while (currentIndex < 0) {
                currentIndex += targets.length;
            }
        }
        sumPoints = getSum(targets, sumPoints, currentIndex);
        return sumPoints;
    }

    private static int getSum(int[] targets, int sumPoints, int currentIndex) {
        if (targets[currentIndex] >= 5) {
            targets[currentIndex] = targets[currentIndex] - 5;
            sumPoints += 5;
        } else {
            sumPoints += targets[currentIndex];
            targets[currentIndex] = 0;
        }
        return sumPoints;
    }

    private static void printArray(int[] targets) {
        for (int i = 0; i < targets.length - 1; i++) {
            System.out.print(targets[i] + " - ");
        }
        System.out.println(targets[targets.length - 1]);
    }

    private static void reverseArray(int[] targets) {
        for (int i = 0; i < targets.length / 2; i++) {
            int temp = targets[i];
            targets[i] = targets[targets.length - i - 1];
            targets[targets.length - i - 1] = temp;
        }
    }
}
