import java.util.Scanner;

class Person {
    String name;

    Person(String n) {
        name = n;
    }

    void display() {
        System.out.println("Name: " + name);
    }
}

class Employee extends Person {
    int empid;

    Employee(String n, int id) {
        super(n);
        empid = id;
    }

    void display() {
        super.display();
        System.out.println("EmpID: " + empid);
    }
}

class HourlyEmployee extends Employee {
    double hourlyRate;
    int hoursWorked;

    HourlyEmployee(String n, int id, double rate, int hours) {
        super(n, id);
        hourlyRate = rate;
        hoursWorked = hours;
    }

    double getGrossPay() {
        return hourlyRate * hoursWorked;
    }

    void display() {
        super.display();
        System.out.println("Hourly Rate: " + hourlyRate);
        System.out.println("Hours Worked: " + hoursWorked);
        System.out.println("Gross Pay: " + getGrossPay());
    }
}

public class Driver6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Employee ID: ");
        int empid = sc.nextInt();

        System.out.print("Enter Hourly Rate: ");
        double rate = sc.nextDouble();

        System.out.print("Enter Hours Worked: ");
        int hours = sc.nextInt();

        HourlyEmployee he = new HourlyEmployee(name, empid, rate, hours);
        System.out.println("\n--- Employee Details ---");
        he.display();
    }
}
