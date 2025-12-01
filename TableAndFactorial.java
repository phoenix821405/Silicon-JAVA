import java.util.Scanner;

class TableThread extends Thread {
    private final int num;
    public TableThread(int num) { this.num = num; }

    public void run() {
        System.out.println("Multiplication Table of " + num + ":");
        for (int i = 1; i <= 10; i++)
            System.out.println(num + " X " + i + " = " + (num * i));
    }
}

class FactorialThread extends Thread {
    private final int num;
    public FactorialThread(int num) { this.num = num; }

    public void run() {
        long fact = 1;
        for (int i = 1; i <= num; i++)
            fact *= i;
        System.out.println("Factorial of " + num + " = " + fact);
    }
}

public class TableAndFactorial {
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        Thread t1 = new TableThread(num);
        Thread t2 = new FactorialThread(num);

        t1.start();
        t2.start();

        t1.join();  // wait for table thread
        t2.join();  // wait for factorial thread

        System.out.println("Main thread finished after both threads completed.");
    }
}
