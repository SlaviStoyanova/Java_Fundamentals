
import java.util.Scanner;

public class FriendsListMaintenance_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] friends = scanner.nextLine().split(", ");
        String input = scanner.nextLine();
        int blacklistedNames = 0;
        int lostNames = 0;

        while (!"Report".equals(input)) {
            String[] tokens = input.split("\\s+");
            String command = tokens[0];

            switch (command) {
                case "Blacklist":
                    String name = tokens[1];
                    for (int i = 0; i < friends.length; i++) {
                        if (name.equals(friends[i])) {
                            friends[i] = "Blacklisted";
                            System.out.println(name + " was blacklisted.");
                            blacklistedNames++;
                            break;
                        }
                        if (i == friends.length - 1 && !name.equals(friends[i])) {
                            System.out.println(name + " was not found.");
                        }
                    }
                    break;
                case "Error":
                    int index = Integer.parseInt(tokens[1]);
                    if (!"Blacklisted".equals(friends[index]) && !"Lost".equals(friends[index])) {
                        lostNames++;
                        System.out.println(friends[index] + " was lost due to an error.");
                        friends[index] = "Lost";
                    }
                    break;
                case "Change":
                    int oldIndex = Integer.parseInt(tokens[1]);
                    String newName = tokens[2];
                    if (oldIndex >= 0 && oldIndex < friends.length) {
                        System.out.println(friends[oldIndex] + " changed his username to " + newName + ".");
                        friends[oldIndex] = newName;
                    }
                    break;
            }
            input = scanner.nextLine();
        }
        System.out.println("Blacklisted names: " + blacklistedNames);
        System.out.println("Lost names: " + lostNames);
        for (String friend : friends) {
            System.out.print(friend + " ");

        }
    }
}
