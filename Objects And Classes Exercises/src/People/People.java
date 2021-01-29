package People;

public class People {
    private String firstName;
    private String lastName;
    private double grade;

    public People(String firstName, String lastName, double grade) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.grade = grade;
    }

    public double getGrade() {
        return this.grade;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return String.format("%s %s: %.2f", firstName, lastName, grade);
    }
}
