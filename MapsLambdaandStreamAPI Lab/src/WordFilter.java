import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class WordFilter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> evenLengthWords = Arrays.stream(scanner.nextLine().split(" "))
                .filter(w -> w.length() % 2 == 0)
                .collect(Collectors.toList());
        // .forEach(w -> System.out.println(w);

        for (String evenLengthWord : evenLengthWords) {
            System.out.println(evenLengthWord);

        }

    }
}

