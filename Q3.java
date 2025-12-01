import java.util.Scanner;
class ArmstrongCheck implements Runnable {
    private final int number;
    public ArmstrongCheck(int number) {
        this.number = number;
    }
    @Override
	public void run() {
		int temp = number;
		int sum = 0;
        int digits = 0;
        int t = temp;
        while (t != 0) {
            digits++;
            t = t/10;
        }
		t = temp;
        while (t != 0) {
            int digit = t % 10;
            sum = sum + Math.pow(digit, digits);
            t = t/10;
        }
        if (sum == number) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is NOT an Armstrong number.");
        }
    }
}
public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();
        Thread armstrongThread = new Thread(new ArmstrongCheck(num));
        armstrongThread.setName("ArmstrongChecker");
        armstrongThread.start();
    }
}