import java.util.Scanner;
public class ArrayIndexExample {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter index to access: ");
            int index = sc.nextInt();
            System.out.println("Element at index " + index + ": " + arr[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index! Please enter an index between 0 and " + (arr.length - 1));
        }
        sc.close();
    }
}