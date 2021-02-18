import java.util.Scanner;

public class ExperienceGaining_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double neededExperience = Double.parseDouble(scanner.nextLine());
        int countBattles = Integer.parseInt(scanner.nextLine());
        int counter = 0;
        double currentExperience = 0.0;
        boolean isCollected = false;

        for (int i = 0; i < countBattles; i++) {
            double experiencePerBattle = Double.parseDouble(scanner.nextLine());
            counter++;
            if (counter % 3 == 0) {
                currentExperience += experiencePerBattle * 1.15;

            } else if (counter % 5 == 0) {

                currentExperience += experiencePerBattle * 0.90;
            } else {
                currentExperience += experiencePerBattle;
            }

            if (currentExperience >= neededExperience) {
                isCollected = true;
                break;
            }
        }
        if (isCollected) {
            System.out.printf("Player successfully collected his needed experience for %d battles.%n", counter);
        } else {
            double needed = neededExperience - currentExperience;
            System.out.printf("Player was not able to collect the needed experience, %.2f more needed.", needed);
        }
    }
}
