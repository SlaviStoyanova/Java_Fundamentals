import java.util.Scanner;

public class DataTypes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String number = scanner.nextLine();

        printDataTypes(input, number);

    }

    private static void printDataTypes(String input, String number) {

        switch (input) {
            case "int":
                int num = Integer.parseInt(number);
                System.out.print(num * 2);
                break;
            case "real":
                double num1 = Double.parseDouble(number);
                System.out.printf("%.2f", num1 * 1.5);
                break;
            case "string":
                System.out.printf("$" + number + "$", number);
        }

    }

}






