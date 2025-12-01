import java.util.Scanner;

class Bank {
    int getRateOfInterest() {
        return 0;
    }
}

class SBI extends Bank {
    int getRateOfInterest() {
        return 8;
    }
}

class ICICI extends Bank {
    int getRateOfInterest() {
        return 7;
    }
}

class AXIS extends Bank {
    int getRateOfInterest() {
        return 9;
    }
}

public class Driver5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Bank b;

        System.out.print("Enter bank name (SBI/ICICI/AXIS): ");
        String bank = sc.nextLine().toUpperCase();

        if (bank.equals("SBI")) {
            b = new SBI();
        } else if (bank.equals("ICICI")) {
            b = new ICICI();
        } else {
            b = new AXIS();
        }

        System.out.println(bank + " Rate of Interest: " + b.getRateOfInterest());
    }
}
