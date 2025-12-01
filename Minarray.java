import java.util.Scanner;
class MinFinder extends Thread
{
    private final int[] arr;
    private final int start, end;
    private static int globalMin = Integer.MAX_VALUE;
    public MinFinder(int[] arr, int start, int end)
	{
        this.arr = arr;
        this.start = start;
        this.end = end;
    }
    public void run()
	{
			int localMin = Integer.MAX_VALUE;
			for (int i = start; i <= end; i++)
			{
				if (arr[i] < localMin)
				{
					localMin = arr[i];
				}
				synchronized (MinFinder.class)
				{
					if (localMin < globalMin)
					globalMin = localMin;
				}
			}
	}
    public static int getGlobalMin()
	{
        return globalMin;
    }
}
public class Minarray
{
    public static void main(String[] args) throws InterruptedException
	{
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        System.out.print("Enter number of threads: ");
        int m = sc.nextInt();
        Thread[] threads = new Thread[m];
        int chunk = n / m;
        int start = 0;
        for (int i = 0; i < m; i++)
		{
            int end = (i == m - 1) ? n - 1 : start + chunk - 1;
            threads[i] = new MinFinder(arr, start, end);
            threads[i].start();
            start = end + 1;
        }
        for (Thread t : threads) t.join();
        System.out.println("Minimum element = " + MinFinder.getGlobalMin());
    }
}