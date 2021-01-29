import java.util.Scanner;

public class LongerLine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstLineX1 = Integer.parseInt(scanner.nextLine());
        int firstLineY1 = Integer.parseInt(scanner.nextLine());
        int firstLineX2 = Integer.parseInt(scanner.nextLine());
        int firstLineY2 = Integer.parseInt(scanner.nextLine());
        int secondLineX1 = Integer.parseInt(scanner.nextLine());
        int secondLineY1 = Integer.parseInt(scanner.nextLine());
        int secondLineX2 = Integer.parseInt(scanner.nextLine());
        int secondLineY2 = Integer.parseInt(scanner.nextLine());

        double fistLineLength = getDistancePointToPoint(firstLineX1, firstLineY1, firstLineX2, firstLineY2);
        double secondLineLength = getDistancePointToPoint(secondLineX1, secondLineY1, secondLineX2, secondLineY2);
        if (fistLineLength >= secondLineLength) {
            printLineOfTwoPoints(firstLineX1, firstLineY1, firstLineX2, firstLineY2);
        } else {
            printLineOfTwoPoints(secondLineX1, secondLineY1, secondLineX2, secondLineY2);
        }
    }

    public static double getDistanceCenterToPoint(int x, int y) {
        return Math.sqrt(x * x + y * y);
    }

    public static void printPoint(int x, int y) {
        String result = String.format("(%d, %d)", x, y);
        System.out.print(result);
    }

    private static void printLineOfTwoPoints(int x1, int y1, int x2, int y2) {
        if (getDistanceCenterToPoint(x1, y1) <= getDistanceCenterToPoint(x2, y2)) {
            printPoint(x1, y1);
            printPoint(x2, y2);
        } else {
            printPoint(x2, y2);
            printPoint(x1, y1);
        }


    }

    private static double getDistancePointToPoint(int x1, int y1, int x2, int y2) {
        return Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));
    }

}
