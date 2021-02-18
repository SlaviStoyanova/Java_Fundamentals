import java.util.Scanner;

public class CounterStrike_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int energy = Integer.parseInt(scanner.nextLine());

        int wonBattles = 0;

        String input = scanner.nextLine();

        while (!"End of battle".equals(input)) {
            int distance = Integer.parseInt(input);
            if (energy < distance) {
                System.out.printf("Not enough energy! Game ends with %d won battles and %d energy", wonBattles, energy);
                break;
            }
            energy -= distance;
            wonBattles++;
            if (wonBattles % 3 == 0) {
                energy += wonBattles;
            }
            input = scanner.nextLine();
        }
        if ("End of battle".equals(input)) {

            System.out.printf("Won battles: %d. Energy left: %d", wonBattles, energy);
        }
    }
}
