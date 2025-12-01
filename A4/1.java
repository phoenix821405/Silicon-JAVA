import java.util.Scanner;

class Average {
    public static double calculateAverage(double a, double b, double c) {
        return (a + b + c) / 3.0;
    }
}

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 3 numbers: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double avg = Average.calculateAverage(a, b, c);
        System.out.println("The average of 3 numbers is " + avg);
    }
}