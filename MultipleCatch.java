import java.util.Scanner;
public class MultipleCatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter numerator: ");
            int num = sc.nextInt();
            System.out.print("Enter denominator: ");
            int den = sc.nextInt();
            int result = num / den;
            System.out.println("Result of division: " + result);
            int[] arr = new int[3];
            System.out.print("Enter index to store value (0-2): ");
            int index = sc.nextInt();
            arr[index] = 100;
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Exception: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("General Exception: " + e.getMessage());
        }
        sc.close();
    }
}