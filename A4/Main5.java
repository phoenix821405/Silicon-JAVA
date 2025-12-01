import java.util.Scanner;

class Box {
    private double length, breadth, height;

    Box(double length, double breadth, double height) {
        this.length = length;
        this.breadth = breadth;
        this.height = height;
    }

    double getVolume() {
        return this.length * this.breadth * this.height;
    }
}

public class Main5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length of the box: ");
        double length = sc.nextDouble();

        System.out.print("Enter breadth of the box: ");
        double breadth = sc.nextDouble();

        System.out.print("Enter height of the box: ");
        double height = sc.nextDouble();

        Box box = new Box(length, breadth, height);
        System.out.println("Volume of the box is: " + box.getVolume());
    }
}
