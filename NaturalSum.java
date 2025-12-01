import java.util.Scanner;

class SumTask extends Thread {
    private final int start, end;
    private static long total = 0;

    public SumTask(int start, int end) {
        this.start = start;
        this.end = end;
    }

    public void run() {
        long localSum = 0;
        for (int i = start; i <= end; i++)
            localSum += i;

        synchronized (SumTask.class) {
            total += localSum;
        }
    }

    public static long getTotal() {
        return total;
    }
}

public class NaturalSum {
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of n: ");
        int n = sc.nextInt();
        System.out.print("Enter number of threads m: ");
        int m = sc.nextInt();

        Thread[] threads = new Thread[m];
        int chunk = n / m;
        int start = 1;

        for (int i = 0; i < m; i++) {
            int end = (i == m - 1) ? n : start + chunk - 1;
            threads[i] = new SumTask(start, end);
            threads[i].start();
            start = end + 1;
        }

        for (Thread t : threads) t.join();

        System.out.println("Sum of first " + n + " natural numbers = " + SumTask.getTotal());
    }
}
