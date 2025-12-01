import java.util.Scanner;

class OddThread extends Thread {
    private final int m, n;

    public OddThread(int m, int n) {
        this.m = m;
        this.n = n;
    }

    public void run() {
        System.out.println("Odd numbers between " + m + " and " + n + ":");
        for (int i = m; i <= n; i++) {
            if (i % 2 != 0)
                System.out.print(i + " ");
        }
        System.out.println();
    }
}

public class OddEvenThreads {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter m: ");
        int m = sc.nextInt();
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        OddThread oddThread = new OddThread(m, n);
        oddThread.start();

        System.out.println("Even numbers between " + m + " and " + n + ":");
        for (int i = m; i <= n; i++) {
            if (i % 2 == 0)
                System.out.print(i + " ");
        }
        System.out.println();
    }
}
