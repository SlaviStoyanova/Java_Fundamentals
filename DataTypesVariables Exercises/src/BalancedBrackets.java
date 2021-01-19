import java.util.Scanner;

public class BalancedBrackets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int countBrackets = 0;
        int countBrackets1 = 0;
        boolean isBalanced = false;
        for (int i = 0; i < n; i++) {
            String type = scanner.nextLine();
            if (type.equals("(")) {
                countBrackets++;
                isBalanced = false;
            } else if (type.equals(")")) {
                countBrackets1++;
                isBalanced = true;
            }

        }
        if (countBrackets == countBrackets1 && isBalanced) {
            System.out.println("BALANCED");
        } else {
            System.out.println("UNBALANCED");

        }
    }
}
