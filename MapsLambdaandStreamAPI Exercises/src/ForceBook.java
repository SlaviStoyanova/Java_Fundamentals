import java.util.*;

public class ForceBook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, List<String>> forcebook = new TreeMap<>();

        String input = scanner.nextLine();

        while (!"Lumpawaroo".equals(input)) {
            if (input.contains(" | ")) {
                String[] tokens = input.split(" \\| ", 2);
                String forceSide = tokens[0];
                String forceUser = tokens[1];
                if (!isContainForceUser(forcebook, forceUser)) {
                    forcebook.putIfAbsent(forceSide, new ArrayList<>());
                    forcebook.get(forceSide).add(forceUser);
                }
            } else if (input.contains(" -> ")) {
                String[] tokens = input.split(" -> ", 2);
                String forceUser = tokens[0];
                String forceSide = tokens[1];

                if (!forcebook.containsKey(forceSide)) {
                    forcebook.put(forceSide, new ArrayList<>());
                }
                if (!isContainForceUser(forcebook, forceUser)) {
                    forcebook.get(forceSide).add(forceUser);
                } else {
                    for (List<String> name : forcebook.values()) {
                        if (name.contains(forceUser)) {
                            name.remove(forceUser);
                            forcebook.get(forceSide).add(forceUser);
                            break;
                        }
                    }
                }
                System.out.printf("%s joins the %s side!%n", forceUser, forceSide);
            }
            input = scanner.nextLine();
        }
        forcebook
                .entrySet()
                .stream()
                .sorted((a1, a2) -> {
                    int first = a1.getValue().size();
                    int second = a2.getValue().size();
                    return Integer.compare(second, first);
                })
                .filter(t -> t.getValue().size() > 0)
                .forEach(e -> {
                    System.out.printf("Side: %s, Members: %d%n", e.getKey(), e.getValue().size());
                    e.getValue()
                            .stream()
                            .sorted()
                            .forEach(s -> System.out.println(String.format("! %s", s)));
                });
    }

    private static boolean isContainForceUser(Map<String, List<String>> forcebook, String forceUser) {
        for (List<String> name : forcebook.values()) {
            if (name.contains(forceUser)) {
                return true;
            }

        }
        return false;
    }
}




