import java.util.Scanner;

public class DataTypeFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String dataType = scanner.nextLine();

        while (!dataType.equals("End")) {

            dataType = scanner.nextLine();
        }

    }
}
