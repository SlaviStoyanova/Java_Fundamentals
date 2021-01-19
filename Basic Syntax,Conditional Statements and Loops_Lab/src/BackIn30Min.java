import java.util.Scanner;

public class BackIn30Min {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hour = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());
        minutes = minutes + 30;

        if (minutes > 59) {
            hour++;
            minutes -= 60;
        }
        if (hour > 23) {
            hour = 0;
        }
        System.out.printf("%d:%02d", hour, minutes);
    }

}
