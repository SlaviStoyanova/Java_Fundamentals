import java.util.Scanner;

public class BiscuitsFactory_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int biscuitsForDay = Integer.parseInt(scanner.nextLine());
        int countWorkers = Integer.parseInt(scanner.nextLine());
        int biscuitsCompetingFactory = Integer.parseInt(scanner.nextLine());

        double productionForMouth = 0.0;

        for (int i = 1; i <= 30; i++) {
            double productionForDay = biscuitsForDay * countWorkers;
            if (i % 3 == 0) {
                productionForDay = 0.75 * productionForDay;

            }
            productionForMouth += Math.floor(productionForDay);
        }

        System.out.printf("You have produced %.0f biscuits for the past month.%n", productionForMouth);
        if (productionForMouth > biscuitsCompetingFactory) {
            double more = ((productionForMouth - biscuitsCompetingFactory) / biscuitsCompetingFactory) * 100;

            System.out.printf("You produce %.2f percent more biscuits.%n", more);

        } else {
            double less = ((biscuitsCompetingFactory - productionForMouth) / biscuitsCompetingFactory) * 100;

            System.out.printf("You produce %.2f percent less biscuits.%n", less);
        }
    }
}


