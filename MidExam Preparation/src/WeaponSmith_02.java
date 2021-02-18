import java.util.Scanner;

public class WeaponSmith_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] lineWords = scanner.nextLine().split("\\|");
        String[] commands = scanner.nextLine().split("\\s+");

        while (!commands[0].equals("Done")) {

            switch (commands[1]) {
                case "Left":
                    int index = Integer.parseInt(commands[2]);
                    if (index > 0 && index <= lineWords.length - 1) {
                        String temp = lineWords[index - 1];
                        lineWords[index - 1] = lineWords[index];
                        lineWords[index] = temp;
                    }
                    break;
                // value at {index} position to the Left, if the index exist
                //If movement is not possible, do nothing.
                case "Right":
                    int index1 = Integer.parseInt(commands[2]);
                    if (index1 >= 0 && index1 < lineWords.length - 1) {
                        String temp = lineWords[index1 + 1];
                        lineWords[index1 + 1] = lineWords[index1];
                        lineWords[index1] = temp;
                    }
                    break;
                case "Even":

                    for (int i = 0; i < lineWords.length; i += 2) {
                        System.out.print(lineWords[i] + " ");
                    }
                    System.out.println();
                    break;
                case "Odd":
                    for (int i = 1; i < lineWords.length; i += 2) {
                        System.out.print(lineWords[i] + " ");

                    }
                    System.out.println();
                    break;

            }
            commands = scanner.nextLine().split(" ");
        }
        String weaponName = String.join("", lineWords);
        System.out.printf("You crafted %s!", weaponName);
    }
}
