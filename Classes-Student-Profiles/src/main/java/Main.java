

public class Main {
    public static void main(String[] args) {
        StudentProfile profileOne = new StudentProfile("kondaiah","malavathu", 2025, 3.9, "philosophy" );
        StudentProfile profileTwo = new StudentProfile("Aaanad", "malavathu", 2026, 3.7, "nuero science");

        profileTwo.incrementExpectedGraduationYear();
        System.out.println(profileTwo.expectedYearToGraduate);
    }
}
