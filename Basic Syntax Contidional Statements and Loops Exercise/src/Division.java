import java.util.Scanner;

public class Division {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        String output = "";
        //2,3,6,7,10

        if (number % 10 == 0) {
            output = ("The number is divisible by 10");
        } else if (number % 7 == 0) {
            output = ("The number is divisible by 7");
        } else if (number % 6 == 0) {
            output = ("The number is divisible by 6");
        } else if (number % 5 == 0) {
            output = ("The number is divisible by 5");
        } else if (number % 3 == 0) {
            output = ("The number is divisible by 3");
        } else if (number % 2 == 0) {
            output = ("The number is divisible by 2");
        }
        if (output.equals("")) {
            System.out.println("Not divisible");
        } else {
            System.out.println(output);
        }
    }
}
