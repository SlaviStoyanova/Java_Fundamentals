
import java.util.Arrays;

import java.util.Scanner;

public class Lift {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int countPeople = Integer.parseInt(scanner.nextLine());

        int[] wagons = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt).toArray();

        for (int i = 0; i < wagons.length; i++) {
            if (wagons[i] >= 0 && wagons[i] < 4) {
                if (4 - wagons[i] > 0) {
                    int freeSpaces = 4 - wagons[i];
                    if (countPeople >= freeSpaces) {
                        countPeople -= freeSpaces;
                        wagons[i] = 4;
                    } else {
                        freeSpaces -= countPeople;
                        countPeople = 0;
                        wagons[i] = 4 - freeSpaces;
                    }
                }
            }

            if (countPeople == 0) {
                break;
            }
        }
        boolean isFreeSpace = false;
        for (Integer wagon : wagons) {
            if (wagon < 4) {
                isFreeSpace = true;
                break;
            }
        }

        if (isFreeSpace) {
            System.out.println("The lift has empty spots!");
            for (Integer wagon : wagons) {
                System.out.print(wagon + " ");
            }
        } else {
            System.out.printf("There isn't enough space! %d people in a queue!%n", countPeople);
            for (Integer wagon : wagons) {
                System.out.print(wagon + " ");
            }
        }
    }
}










