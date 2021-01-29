import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AnonymousThreat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> data = readStringList(scanner);
        String input = scanner.nextLine();
        while (!"3:1".equals(input)) {
            String[] tokens = input.split("\\s+");
            if (tokens[0].equals("merge")) {
                String concatStr = "";
                int begin = Integer.parseInt(tokens[1]);
                int end = Integer.parseInt(tokens[2]);
                begin = Math.max(0, begin);
                if (begin >= data.size()) {
                    begin = data.size() - 1;
                }
                end = Math.min(data.size() - 1, end);
                for (int i = begin; i <= end; i++) {
                    concatStr += data.get(begin);
                    data.remove(begin);
                }
                data.add(begin, concatStr);

            } else {
                int index = Integer.parseInt(tokens[1]);
                int partitions = Integer.parseInt(tokens[2]);
                String element = data.get(index);
                data.remove(index);
                int size = element.length() / partitions;
                int begin = 0;
                for (int i = 0; i < partitions - 1; i++) {
                    data.add(index++, element.substring(begin, begin + size));
                    begin += size;
                }
                data.add(index, element.substring(begin));
            }
            input = scanner.nextLine();
        }


        System.out.println(String.join(" ", data));
    }

    private static List<String> readStringList(Scanner scanner) {
        String[] input = scanner.nextLine().split("\\s+");
        List<String> result = new ArrayList<>();
        for (String item : input) {
            result.add(item);
        }
        return result;
    }
}
