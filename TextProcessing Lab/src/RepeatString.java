import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class RepeatString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] words = scanner.nextLine().split(" ");
        //String streamResult =  Arrays.stream(words)
        //           .map(w -> repeatTimes(w, w.length()))
        //          .collect(Collectors.joining());
        String result = "";
        for (int i = 0; i < words.length; i++) {
            result += repeatTimes(words[i], words[i].length());

        }
        System.out.println(result);
        //System.out.println(streamResult);
    }

    private static String repeatTimes(String word, int times) {
        String result = "";
        for (int i = 0; i < times; i++) {
            result += word;
        }
        return result;

    }
}
