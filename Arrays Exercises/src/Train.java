import java.util.Scanner;

public class Train {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int waggonsCount = Integer.parseInt(scanner.nextLine());
        int[] train = new int[waggonsCount];

        for (int i = 0; i < train.length; i++) {
            train[i] = Integer.parseInt(scanner.nextLine());
        }

        int sum = 0;
        for (int waggon : train) {
            sum += waggon;
            System.out.print(waggon + " ");
        }
        System.out.println();
        System.out.println(sum);
    }
}
