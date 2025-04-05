import java.util.Scanner;

class Student {
    String name;
    int[] marks = new int[5]; 
    double average;
    String grade;

    void calculateAverage() {
        int sum = 0;
        for (int mark : marks) {
            sum += mark;
        }
        average = sum / 5.0;
    }

    void calculateGrade() {
        if (average >= 90)
            grade = "A+";
        else if (average >= 80)
            grade = "A";
        else if (average >= 70)
            grade = "B";
        else if (average >= 60)
            grade = "C";
        else if (average >= 50)
            grade = "D";
        else
            grade = "F";
    }

    void displayDetails() {
        System.out.println("Student Name: " + name);
        System.out.println("Average Marks: " + average);
        System.out.println("Grade: " + grade);
        System.out.println("-------------------------");
    }
}

public class StudentGradeManager {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        Student[] students = new Student[n];

        for (int i = 0; i < n; i++) {
            students[i] = new Student();
            System.out.print("Enter name of student " + (i + 1) + ": ");
            students[i].name = sc.next();

            for (int j = 0; j < 5; j++) {
                System.out.print("Enter mark " + (j + 1) + ": ");
                students[i].marks[j] = sc.nextInt();
            }

            students[i].calculateAverage();
            students[i].calculateGrade();
        }

        System.out.println("\n--- Student Report ---");
        for (Student student : students) {
            student.displayDetails();
        }

        sc.close();
    }
}
