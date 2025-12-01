import java.util.Scanner;
public class DivisionCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter value of x: ");
            int x = sc.nextInt();
            System.out.print("Enter value of y: ");
            int y = sc.nextInt();
            if (x - y == 0) {
                throw new ArithmeticException("x - y is zero. Division not allowed.");
            }
            double result = (double) x / (x - y);
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Exception: " + e.getMessage());
        }
        sc.close();
    }
}