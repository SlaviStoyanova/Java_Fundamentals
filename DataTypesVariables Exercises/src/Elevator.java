import java.util.Scanner;

public class Elevator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int peopleCnt = Integer.parseInt(scanner.nextLine());
        int elevatorCapacity = Integer.parseInt(scanner.nextLine());

        int count = peopleCnt / elevatorCapacity;
        if (count * elevatorCapacity < peopleCnt) {
            count++;
        }
        System.out.println(count);
    }
}
