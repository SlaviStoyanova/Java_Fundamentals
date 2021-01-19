import java.util.Scanner;

public class PokeMon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startPokePower = Integer.parseInt(scanner.nextLine());
        int distance = Integer.parseInt(scanner.nextLine());
        int exhaustionFactor = Integer.parseInt(scanner.nextLine());

        int currentPokePower = startPokePower;
        int targetCount = 0;

        while (currentPokePower >= distance) {
            currentPokePower -= distance;
            targetCount++;
            boolean isHalfPower = (currentPokePower == startPokePower / 2.0);
            boolean isSaveToDivide = exhaustionFactor != 0;
            if (isHalfPower && isHalfPower) {
                currentPokePower = currentPokePower / exhaustionFactor;
            }
        }
        System.out.println(currentPokePower);
        System.out.println(targetCount);
    }
}
