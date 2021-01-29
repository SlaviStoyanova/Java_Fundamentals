import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Pokemon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> pokemonList = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());

        int sumOfRemovedElements = 0;

        while (pokemonList.size() > 0) {

            int index = Integer.parseInt(scanner.nextLine());
            int indexToRemoveElement = 0;
            if (index < 0) {
                indexToRemoveElement = pokemonList.get(0);

                pokemonList.set(0, pokemonList.get(pokemonList.size() - 1));
            } else if (index > pokemonList.size() - 1) {
                indexToRemoveElement = pokemonList.get(pokemonList.size() - 1);
                pokemonList.set(pokemonList.size() - 1, pokemonList.get(0));

            } else {
                indexToRemoveElement = pokemonList.get(index);
                pokemonList.remove(index);

            }
            for (int i = 0; i < pokemonList.size(); i++) {
                int current = pokemonList.get(i);
                if (current <= indexToRemoveElement) {
                    current += indexToRemoveElement;
                } else {
                    current -= indexToRemoveElement;
                }
                pokemonList.set(i, current);
            }
            sumOfRemovedElements += indexToRemoveElement;

        }
        System.out.println(sumOfRemovedElements);
    }
}
