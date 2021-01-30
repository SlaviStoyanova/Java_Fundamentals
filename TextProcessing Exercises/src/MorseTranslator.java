import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MorseTranslator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, String> morse = new HashMap<>();
        morse.put(".-", "A");
        morse.put("-.-.", "C");
        morse.put("-..", "D");
        morse.put(".", "E");
        morse.put("..-.", "F");
        morse.put("--.", "G");
        morse.put("....", "H");
        morse.put("..", "I");
        morse.put(".---", "J");
        morse.put("-.-", "K");
        morse.put(".-..", "L");
        morse.put("--", "M");
        morse.put("-.", "N");
        morse.put("---", "O");
        morse.put(".--.", "P");
        morse.put("--.-", "Q");
        morse.put(".-.", "R");
        morse.put("...", "S");
        morse.put("-", "T");
        morse.put("..-", "U");
        morse.put("...-", "V");
        morse.put(".--", "W");
        morse.put("-..-", "X");
        morse.put("-.--", "Y");
        morse.put("--..", "Z");
        String[] code = scanner.nextLine().split("\\|");
        StringBuilder sb = new StringBuilder();
        String currentChar = "";
        for (String value : code) {
            String[] currentWord = value.split(" ");
            for (String s : currentWord) {
                if (morse.containsKey(s)) {
                    sb.append(morse.get(s));
                }
            }
            sb.append(" ");
        }
        System.out.println(sb);
    }
}
