import java.util.Scanner;
public class LengthConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double feet = 0.0, inches = 0.0;
        while (true) {
            try {
                System.out.print("Enter length in feet: ");
                String feetInput = sc.next();
                feet = Double.parseDouble(feetInput);
                if (feet < 0) {
                    throw new IllegalArgumentException("Feet value cannot be negative.");
                }
                System.out.print("Enter remaining inches: ");
                String inchesInput = sc.next();
                inches = Double.parseDouble(inchesInput);
                if (inches < 0) {
                    throw new IllegalArgumentException("Inches value cannot be negative.");
                }
                break; // Valid input received, exit loop
            } catch (NumberFormatException e) {
                System.out.println("Invalid input! Please enter numeric values only.");
            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
        double totalInches = feet * 12 + inches;
        double centimeters = totalInches * 2.54;
        System.out.printf("Equivalent length: %.2f cm\n", centimeters);
        sc.close();
    }
}