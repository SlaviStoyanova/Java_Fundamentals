import java.util.Scanner;

public class PadawanEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double ivanChoMoney = Double.parseDouble(scanner.nextLine());
        int padawanCount = Integer.parseInt(scanner.nextLine());
        double lightsaberSinglePrice = Double.parseDouble(scanner.nextLine());
        double robeSinglePrice = Double.parseDouble(scanner.nextLine());
        double beltSinglePrice = Double.parseDouble(scanner.nextLine());

        double lightsabersTotalPrice = Math.ceil(padawanCount * 1.1) * lightsaberSinglePrice;
        double robesTotalPrice = padawanCount * robeSinglePrice;
        int freeBeltsCount = padawanCount / 6;
        double beltsTotalPrice = (padawanCount - freeBeltsCount) * beltSinglePrice;

        double finalPrice = lightsabersTotalPrice + robesTotalPrice + beltsTotalPrice;
        if (finalPrice > ivanChoMoney) {
            double neededMoney = finalPrice - ivanChoMoney;

            System.out.printf("Ivan Cho will need %.2flv more.", neededMoney);
        } else {
            System.out.printf("The money is enough - it would cost %.2flv.", finalPrice);
        }


    }
}
