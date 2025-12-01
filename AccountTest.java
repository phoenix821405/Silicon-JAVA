import java.util.Scanner;
class MinimumBalanceException extends Exception {
    public MinimumBalanceException(String message) {
        super(message);
    }
}
class Account {
    String name;
    int acc_no;
    double balance;
    public Account(String name, int acc_no, double balance) {
        this.name = name;
        this.acc_no = acc_no;
        this.balance = balance;
    }
    void deposit(double amt) {
        balance += amt;
        System.out.println("Deposited: Rs. " + amt);
    }
    void withdraw(double amt) throws MinimumBalanceException {
        if (balance - amt < 500) {
            throw new MinimumBalanceException("Balance cannot go below Rs.500.00");
        }
        balance -= amt;
        System.out.println("Withdrawn: Rs. " + amt);
    }
    void showBalance() {
        System.out.println("Current Balance: Rs. " + balance);
    }
}
public class AccountTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name: ");
        String name = sc.nextLine();
        System.out.print("Enter account number: ");
        int accNo = sc.nextInt();
        System.out.print("Enter opening balance: ");
        double bal = sc.nextDouble();
        Account acc = new Account(name, accNo, bal);
        try {
            System.out.print("Enter amount to withdraw: ");
            double amt = sc.nextDouble();
            acc.withdraw(amt);
        } catch (MinimumBalanceException e) {
            System.out.println("Exception: " + e.getMessage());
        }
        acc.showBalance();
        sc.close();
    }
}