package People;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countStudents = Integer.parseInt(scanner.nextLine());
        List<People> peoples = new ArrayList<>();

        for (int i = 0; i < countStudents; i++) {
            String[] line = scanner.nextLine().split("\\s+");
            String firstName = line[0];
            String lastName = line[1];
            double grade = Double.parseDouble(line[2]);
            People people = new People(firstName, lastName, grade);
            peoples.add(people);
        }
        peoples
                .stream()
                .sorted((p1, p2) -> Double.compare(p2.getGrade(), p1.getGrade()))
                .forEach(p -> System.out.println(p));
    }
}
