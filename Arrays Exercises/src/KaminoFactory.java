import java.util.Scanner;

public class KaminoFactory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int Length = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();
        int bestSequenceIndex = Integer.MAX_VALUE;
        int bestSequenceSum = 0;
        int bestIndexInRow = 0;
        int bestIndexOutput = 0;
        String bestDna = "";

        while (!input.equals("Clone them!")) {
            ++bestIndexInRow;
            String[] data = input.split("!+");
            int[] currentSequence = new int[Length];

            for (int i = 0; i < data.length; i++) {
                currentSequence[i] = Integer.parseInt(data[i]);
            }
            int maxCount = 0;
            int sequenceIndex = 0;
            for (int i = 0; i < currentSequence.length; i++) {
                int currentCount = 0;
                for (int j = i; j < currentSequence.length; j++) {
                    if (currentSequence[i] == currentSequence[j]) {
                        currentCount++;
                        if (currentCount > maxCount) {
                            maxCount = currentCount;
                            sequenceIndex = i;
                        }
                    } else {
                        break;
                    }
                }
            }
            int sequenceSum = 0;
            for (int i = 0; i < currentSequence.length; i++) {
                if (currentSequence[i] == 1) {
                    sequenceSum += currentSequence[i];
                }
            }
            if (sequenceIndex < bestSequenceIndex || sequenceSum > bestSequenceSum) {
                bestDna = "";
                bestSequenceIndex = sequenceIndex;
                bestSequenceSum = sequenceSum;
                bestIndexOutput = bestIndexInRow;

                for (int i = 0; i < currentSequence.length; i++) {
                    bestDna += currentSequence[i] + " ";

                }
            }
            input = scanner.nextLine();
        }

        System.out.println(String.format("Best DNA sample %d with sum: %d.", bestIndexOutput, bestSequenceSum));

        System.out.println(String.join(" ", bestDna));
    }
}
