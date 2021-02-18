import java.util.Arrays;
import java.util.Scanner;

public class ShootForWin_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] targets = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(e -> Integer.parseInt(e)).toArray();

        int counter = 0;
        String shoot = scanner.nextLine();

        while (!"End".equals(shoot)) {
            int shootInt = Integer.parseInt(shoot);
            if (shootInt < targets.length && targets[shootInt] != -1) {
                for (int i = 0; i < targets.length; i++) {
                    if (targets[i] == -1) {
                        continue;
                    }
                    if (i == shootInt) {
                        int current = targets[i];
                        targets[i] = -1;
                        counter++;
                        for (int j = 0; j < targets.length; j++) {
                            if (targets[j] == -1) {
                                continue;
                            }
                            if (targets[j] > current) {
                                targets[j] -= current;
                                if (targets[j] < 0) {
                                    targets[j] = -1;
                                }

                            } else {
                                targets[j] += current;
                            }
                        }
                    }
                }
            }
            boolean flag = true;
            for (int i = 0; i < targets.length; i++) {
                if (targets[i] != -1) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.println("Shot targets 3 -> -1 -1 -1 -1 ");
                break;
            }
            shoot = scanner.nextLine();
        }
        if (shoot.equals("End")) {
            System.out.printf("Shot targets: %d -> ", counter);
            for (int element : targets) {
                System.out.print(element + " ");

            }
        }
    }
}

