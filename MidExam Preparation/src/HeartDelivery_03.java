import java.util.Arrays;
import java.util.Scanner;

public class HeartDelivery_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = Arrays.stream(scanner.nextLine().split("@")).mapToInt(e -> Integer.parseInt(e)).toArray();

        String input = scanner.nextLine();
        int index = 0;

        while (!"Love!".equals(input)) {
            String[] tokens = input.split(" ");
            int position = Integer.parseInt(tokens[1]);
            index += position;

            if (index >= array.length) {
                index = 0;
            }
            if (array[index] > 0) {
                array[index] -= 2;

                if (array[index] == 0) {
                    System.out.printf("Place %d has Valentine's day.%n", index);
                }
            } else if (array[index] == 0) {
                System.out.printf("Place %d already had Valentine's day.%n", index);
            }
            input = scanner.nextLine();
        }
        System.out.printf("Cupid's last position was %d.%n", index);
        int fail = 0;
        boolean isFail = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != 0) {
                fail++;
                isFail = true;
            }
        }
        if (isFail) {
            System.out.printf("Cupid has failed %d places.", fail);
        } else {
            System.out.println("Mission was successful.");
        }
    }
}
