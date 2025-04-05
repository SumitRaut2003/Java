import java.util.Scanner;
import java.time.LocalDate;

public class AgeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your birth year: ");
        int birthYear = sc.nextInt();

        int currentYear = LocalDate.now().getYear();
        int age = currentYear - birthYear;

        System.out.println("You are " + age + " years old.");
        sc.close();
    }
}
