import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListManipulationAdvanced {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = readList(scanner);

        String input = scanner.nextLine();
        while (!"end".equals(input)) {
            String[] tokens = input.split(" ");
            String command = tokens[0];
            switch (command) {
                case "Contains":
                    int num = Integer.parseInt(tokens[1]);
                    if (numbers.contains(num)) {
                        System.out.println("Yes");
                    } else {
                        System.out.println("No such number");
                    }
                    break;
                case "Print":
                    String evenOrOdd = tokens[1];
                    if (evenOrOdd.equals("even")) {
                        printAllEvenNumbers(numbers);
                    } else if (evenOrOdd.equals("odd")) {
                        printAllOddNumbers(numbers);
                    }
                    break;
                case "Get":
                    int sum = 0;
                    for (int integer : numbers) {
                        sum += integer;
                    }
                    System.out.println(sum);
                    break;
                case "Filter":
                    int condition = Integer.parseInt(tokens[2]);
                    if (tokens[1].equals(">=")) {
                        for (int element : numbers) {
                            if (element >= condition) {
                                System.out.print(element + " ");
                            }
                        }
                        System.out.println();
                    } else if (tokens[1].equals(">")) {
                        for (int element : numbers) {
                            if (element > condition) {
                                System.out.print(element + " ");
                            }
                        }
                        System.out.println();
                    } else if (tokens[1].equals("<=")) {
                        for (int element : numbers) {
                            if (element <= condition) {
                                System.out.print(element + " ");
                            }
                        }
                        System.out.println();
                    } else if (tokens[1].equals("<")) {
                        for (int element : numbers) {
                            if (element < condition) {
                                System.out.print(element + " ");
                            }
                        }
                        System.out.println();
                    }
                    break;
            }

            input = scanner.nextLine();
        }
    }


    private static void printAllOddNumbers(List<Integer> list) {
        for (int number : list) {
            if (number % 2 != 0) {
                System.out.print(number + " ");
            }
        }
        System.out.println();
    }

    private static void printAllEvenNumbers(List<Integer> list) {
        for (int number : list) {
            if (number % 2 == 0) {
                System.out.print(number + " ");
            }
        }
        System.out.println();
    }

    private static List<Integer> readList(Scanner scanner) {
        List<Integer> output = new ArrayList<>();
        String[] input = scanner.nextLine().split(" ");
        for (String s : input) {
            output.add(Integer.parseInt(s));
        }
        return output;
    }
}
