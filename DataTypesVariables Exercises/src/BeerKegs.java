import java.util.Scanner;

public class BeerKegs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        String bestModel = "";
        double maxVolume = Double.MIN_VALUE;
        for (int i = 1; i <= n; i++) {
            String currentModel = scanner.nextLine();
            double currentRadius = Double.parseDouble(scanner.nextLine());
            int currentHeight = Integer.parseInt(scanner.nextLine());

            double currentVolume = Math.PI * currentRadius * currentRadius * currentHeight;

            if (currentVolume > maxVolume) {
                bestModel = currentModel;
                maxVolume = currentVolume;

            }
        }
        System.out.println(bestModel);
    }
}






