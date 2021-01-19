import java.util.Scanner;

public class PaskalTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int one[] = {1};

        System.out.println("1");
        for (int j = 0; j < n - 1; j++) {
            int two[] = new int[one.length + 1];
            int twoCounter = 0;
            for (int i = 0; i < one.length; i++) {
                if (i == 0) {
                    two[twoCounter++] = one[i];
                    System.out.print(one[i] + " ");
                }
                if (i != 0) {
                    two[twoCounter++] = one[i] + one[i - 1];
                    System.out.print((one[i] + one[i - 1]) + " ");
                }
                if (i == one.length - 1) {
                    two[twoCounter++] = one[i];
                    System.out.print(one[i] + " ");
                }
            }
            System.out.println();
            one = two;
        }
    }
}