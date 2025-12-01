import java.util.Scanner;

class Account {
    String customerName;
    int accountNumber;

    Account(String name, int accNo) {
        customerName = name;
        accountNumber = accNo;
    }

    void display() {
        System.out.println("Customer Name: " + customerName);
        System.out.println("Account Number: " + accountNumber);
    }
}

class Savings_Account extends Account {
    double min_bal;
    double saving_bal;

    Savings_Account(String name, int accNo, double min, double bal) {
        super(name, accNo);
        min_bal = min;
        saving_bal = bal;
    }

    void show() {
        display();
        System.out.println("Minimum Balance: " + min_bal);
        System.out.println("Saving Balance: " + saving_bal);
    }
}

class Account_details extends Savings_Account {
    double deposit;
    double withdrawal;

    Account_details(String name, int accNo, double min, double bal, double dep, double wd) {
        super(name, accNo, min, bal);
        deposit = dep;
        withdrawal = wd;
    }

    void show1() {
        show();
        System.out.println("Deposit: " + deposit);
        System.out.println("Withdrawal: " + withdrawal);
    }
}

public class Driver1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Customer Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Account Number: ");
        int accNo = sc.nextInt();

        System.out.print("Enter Minimum Balance: ");
        double min = sc.nextDouble();

        System.out.print("Enter Saving Balance: ");
        double bal = sc.nextDouble();

        System.out.print("Enter Deposit Amount: ");
        double dep = sc.nextDouble();

        System.out.print("Enter Withdrawal Amount: ");
        double wd = sc.nextDouble();

        Account_details ad = new Account_details(name, accNo, min, bal, dep, wd);
        ad.show1();
    }
}
