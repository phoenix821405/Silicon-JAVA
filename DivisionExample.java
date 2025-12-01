import java.util.Scanner;
public class DivisionExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1, n2;
        System.out.print("Enter first number (n1): ");
        n1 = sc.nextInt();
        while (true) {
            try {
                System.out.print("Enter second number (n2): ");
                n2 = sc.nextInt();
                int result = n1 / n2;
                System.out.println("Result: " + result);
                break;
            } catch (ArithmeticException e) {
                System.out.println("Error: Cannot divide by zero. Please try again.");
            }
        }
        sc.close();
    }
}