import java.util.Scanner;

class Student {
    String name, branch;
    int roll;

    void inputDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name: ");
        name = sc.nextLine();
        System.out.print("Enter roll: ");
        roll = sc.nextInt();
        sc.nextLine(); // consume leftover newline
        System.out.print("Enter branch: ");
        branch = sc.nextLine();
    }

    void displayDetails() {
        System.out.println("Student Details:");
        System.out.println("Name: " + name);
        System.out.println("Roll: " + roll);
        System.out.println("Branch: " + branch);
    }
}

public class Main {
    public static void main(String[] args) {
        Student s = new Student();
        s.inputDetails();
        s.displayDetails();
    }
}
