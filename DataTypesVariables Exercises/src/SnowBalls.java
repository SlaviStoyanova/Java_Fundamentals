import java.util.Scanner;

public class SnowBalls {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        double bestSnowballValue = -1.0;
        int bestSnowballSnow = 0;
        int bestSnowballTime = 0;
        int bestSnowballQuality = 0;

        for (int i = 0; i < n; i++) {
            int snowBallSnow = Integer.parseInt(scanner.nextLine());
            int snowBallTime = Integer.parseInt(scanner.nextLine());
            int snowBallQuality = Integer.parseInt(scanner.nextLine());

            double snowballValue = Math.pow((snowBallSnow / snowBallTime), snowBallQuality);
            if (snowballValue > bestSnowballValue) {
                bestSnowballValue = snowballValue;
                bestSnowballSnow = snowBallSnow;
                bestSnowballTime = snowBallTime;
                bestSnowballQuality = snowBallQuality;

            }

        }
        System.out.println(String.format("%d : %d = %.0f (%d)", bestSnowballSnow, bestSnowballTime,
                bestSnowballValue, bestSnowballQuality));
    }
}
