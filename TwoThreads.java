import java.util.Scanner;
class SquareThread extends Thread {
    private final int num;
    public SquareThread(int num) { this.num = num; }

    public void run() {
        System.out.println("Square of " + num + " = " + (num * num));
    }
}
class SumDigitsThread extends Thread {
    private final int num;
    public SumDigitsThread(int num) { this.num = num; }

    public void run() {
        int sum = 0, temp = num;
        while (temp != 0) {
            sum += temp % 10;
            temp /= 10;
        }
        System.out.println("Sum of digits of " + num + " = " + sum);
    }
}
public class TwoThreads {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        new SquareThread(num).start();
        new SumDigitsThread(num).start();
    }
}