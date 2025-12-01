import java.util.Scanner;

class Student {
    String sic;
    String name, branch;
    double cgpa;

    void acceptDetails(Scanner sc) {
        System.out.print("Enter SIC: ");
        sic = sc.nextLine();
        System.out.print("Enter Name: ");
        name = sc.nextLine();
        System.out.print("Enter Branch: ");
        branch = sc.nextLine();
        System.out.print("Enter CGPA: ");
        cgpa = sc.nextDouble();
        sc.nextLine(); // consume leftover newline
    }

    void displayDetails() {
        System.out.println("SIC: " + sic);
        System.out.println("Name: " + name);
        System.out.println("Branch: " + branch);
        System.out.println("CGPA: " + cgpa);
        System.out.println("----------------------------");
    }
}

public class Main4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student[] students = new Student[5];

        for (int i = 0; i < 5; i++) {
            students[i] = new Student();
            System.out.println("Enter details of student " + (i + 1) + ":");
            students[i].acceptDetails(sc);
        }

        System.out.println("\nStudent Details:");
        for (Student s : students) {
            s.displayDetails();
        }
    }
}
