import java.util.Scanner;
class MinimumBalanceException extends Exception {
    public MinimumBalanceException(String message) {
        super(message);
    }
}
class Account {
    String name;
    int accNo;
    double balance;
    public Account(String name, int accNo, double balance) {
        this.name = name;
        this.accNo = accNo;
        this.balance = balance;
    }
    void deposit(double amt) {
        balance += amt;
        System.out.println("Deposited Rs. " + amt + " into account of " + name);
    }
    void withdraw(double amt) throws MinimumBalanceException {
        if (balance - amt < 500) {
            throw new MinimumBalanceException("Withdrawal denied: Balance would go below Rs.500.00");
        }
        balance -= amt;
        System.out.println("Withdrawn Rs. " + amt + " from account of " + name);
    }
    void transfer(Account receiver, double amt) throws MinimumBalanceException {
        if (balance - amt < 500) {
            throw new MinimumBalanceException("Transfer denied: Balance would go below Rs. 500.00");
        }
        this.withdraw(amt);
        receiver.deposit(amt);
        System.out.println("Transferred Rs. " + amt + " from " + name + " to " + receiver.name);
    }
    void showBalance() {
        System.out.println("Account holder: " + name + ", Balance: Rs. " + balance);
    }
}
public class AccountManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=== Create Account 1 ===");
        System.out.print("Enter name: ");
        String name1 = sc.nextLine();
        System.out.print("Enter account number: ");
        int acc1No = sc.nextInt();
        System.out.print("Enter opening balance: ");
        double bal1 = sc.nextDouble();
        sc.nextLine();
        Account acc1 = new Account(name1, acc1No, bal1);
        System.out.println("\n=== Create Account 2 ===");
        System.out.print("Enter name: ");
        String name2 = sc.nextLine();
        System.out.print("Enter account number: ");
        int acc2No = sc.nextInt();
        System.out.print("Enter opening balance: ");
        double bal2 = sc.nextDouble();
        Account acc2 = new Account(name2, acc2No, bal2);
        int choice;
        do {
            System.out.println("\n==== MENU ====");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Transfer");
            System.out.println("4. Show Balances");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            choice = sc.nextInt();
            try {
                switch (choice) {
                    case 1:
                        System.out.print("Deposit into which account? (1 or 2): ");
                        int dAcc = sc.nextInt();
                        System.out.print("Enter amount to deposit: ");
                        double dAmt = sc.nextDouble();
                        if (dAcc == 1) acc1.deposit(dAmt);
                        else if (dAcc == 2) acc2.deposit(dAmt);
                        else System.out.println("Invalid account number.");
                        break;
                    case 2:
                        System.out.print("Withdraw from which account? (1 or 2): ");
                        int wAcc = sc.nextInt();
                        System.out.print("Enter amount to withdraw: ");
                        double wAmt = sc.nextDouble();
                        if (wAcc == 1) acc1.withdraw(wAmt);
                        else if (wAcc == 2) acc2.withdraw(wAmt);
                        else System.out.println("Invalid account number.");
                        break;
                    case 3:
                        System.out.print("Transfer from which account? (1 or 2): ");
                        int tFrom = sc.nextInt();
                        System.out.print("Transfer to which account? (1 or 2): ");
                        int tTo = sc.nextInt();
                        System.out.print("Enter amount to transfer: ");
                        double tAmt = sc.nextDouble();
                        if (tFrom == 1 && tTo == 2) acc1.transfer(acc2, tAmt);
                        else if (tFrom == 2 && tTo == 1) acc2.transfer(acc1, tAmt);
                        else System.out.println("Invalid account selection.");
                        break;
                    case 4:
                        acc1.showBalance();
                        acc2.showBalance();
                        break;
                    case 5:
                        System.out.println("Exiting...");
                        break;
                    default:
                        System.out.println("Invalid choice. Try again.");
                }
            } catch (MinimumBalanceException e) {
                System.out.println("Exception: " + e.getMessage());
            }
        } while (choice != 5);
        sc.close();
    }
}