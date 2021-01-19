import java.util.Scanner;

public class PrintNumbersInReverseOrder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = Integer.parseInt(scanner.nextLine());

        int[] numbers = new int[count];
        for (int i = 0; i < count; i++) {
            numbers[i] = Integer.parseInt(scanner.nextLine());
        }
        //0,1,2
        //[10,20,30]
        for (int i = count - 1; i >= 0; i--) {
            System.out.print(numbers[i] + " ");
        }
    }
}
