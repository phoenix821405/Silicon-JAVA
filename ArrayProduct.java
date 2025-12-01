import java.util.Scanner;

class ProductThread extends Thread {
    private final int[] a, b, result;
    private final boolean odd;

    public ProductThread(int[] a, int[] b, int[] result, boolean odd) {
        this.a = a;
        this.b = b;
        this.result = result;
        this.odd = odd;
    }

    public void run() {
        for (int i = 0; i < a.length; i++) {
            if (odd && i % 2 != 0)
                result[i] = a[i] * b[i];
            else if (!odd && i % 2 == 0)
                result[i] = a[i] * b[i];
        }
    }
}

public class ArrayProduct {
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of arrays: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        int[] result = new int[n];

        System.out.println("Enter elements of array A:");
        for (int i = 0; i < n; i++) a[i] = sc.nextInt();

        System.out.println("Enter elements of array B:");
        for (int i = 0; i < n; i++) b[i] = sc.nextInt();

        Thread oddThread = new ProductThread(a, b, result, true);
        Thread evenThread = new ProductThread(a, b, result, false);

        oddThread.start();
        evenThread.start();

        oddThread.join();
        evenThread.join();

        System.out.println("Resultant product array:");
        for (int val : result)
            System.out.print(val + " ");
    }
}
