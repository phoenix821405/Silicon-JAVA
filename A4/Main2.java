import java.util.Scanner;

class Area {
    private double length;
    private double breadth;

    void setDim(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    double getArea() {
        return this.length * this.breadth;
    }
}

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Area rect = new Area();

        System.out.print("Enter length of rectangle: ");
        double length = sc.nextDouble();

        System.out.print("Enter breadth of rectangle: ");
        double breadth = sc.nextDouble();

        rect.setDim(length, breadth);

        System.out.println("Area of rectangle: " + rect.getArea());
    }
}
