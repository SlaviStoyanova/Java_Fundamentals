import java.util.*;

public class Numbers_03 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();
        String[] input = scanner.nextLine().split(" ");
        for (String s : input) {
            numbers.add(Integer.parseInt(s));
        }
        double sum = 0;
        for (int i = 0; i < numbers.size(); i++) {
            int currentNumber = numbers.get(i);
            sum += currentNumber;
        }
        double average = sum * 1.0 / numbers.size();

        List<Integer> topFive = new ArrayList<>();
        for (Integer currentNumber : numbers) {
            if (currentNumber > average) {
                topFive.add(currentNumber);
            }
        }

        Collections.sort(topFive);
        Collections.reverse(topFive);


        if (topFive.size() == 0) {
            System.out.println("No");
        }
        if (topFive.size() < 5) {
            for (Integer integer : topFive) {

                System.out.print(integer + " ");
            }
        } else {
            for (int i = 0; i < 5; i++) {
                int num = topFive.get(i);
                System.out.print(num + " ");

            }
        }
    }
}









