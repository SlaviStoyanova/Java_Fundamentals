import java.util.Arrays;
import java.util.Scanner;

public class EncryptSortPrintArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        String[] names = new String[n];

        for (int i = 0; i < n; i++) {
            String word = scanner.nextLine();
            names[i] = word;
        }
        int[] sums = new int[n];

        for (int i = 0; i < names.length; i++) {
            int sum = 0;
            String currentName = names[i];
            int stringLength = currentName.length();
            for (int j = 0; j < stringLength; j++) {
                char currentChar = currentName.charAt(j);
                if (currentChar == 'a' || currentChar == 'o' | currentChar == 'u' || currentChar == 'i'
                        || currentChar == 'e' || currentChar == 'A' || currentChar == 'O' | currentChar == 'U'
                        || currentChar == 'I' || currentChar == 'E') {
                    sum += (int) currentChar * stringLength;
                } else {
                    sum += (int) currentChar / stringLength;
                }

            }
            sums[i] = sum;

        }
        Arrays.sort(sums);
        for (int i = 0; i < n; i++) {
            System.out.println(sums[i]);

        }

    }
}
