import java.util.Scanner;

class Employee {
    int id;
    String name, department;
    double salary;

    void getData(Scanner sc) {
        System.out.print("Enter Employee ID: ");
        id = sc.nextInt();
        sc.nextLine(); // consume newline
        System.out.print("Enter Name: ");
        name = sc.nextLine();
        System.out.print("Enter Department: ");
        department = sc.nextLine();
        System.out.print("Enter Salary: ");
        salary = sc.nextDouble();
    }

    void putData() {
        System.out.println("Employee ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("Salary: " + salary);
        System.out.println("----------------------------");
    }
}

public class Main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of employees: ");
        int n = sc.nextInt();

        Employee[] employees = new Employee[n];

        for (int i = 0; i < n; i++) {
            employees[i] = new Employee();
            System.out.println("Enter details of employee " + (i + 1) + ":");
            employees[i].getData(sc);
        }

        System.out.println("\nEmployee Details:");
        for (Employee emp : employees) {
            emp.putData();
        }
    }
}
