import java.util.Scanner;

abstract class Figure {
    double dim1, dim2;

    Figure(double a, double b) {
        dim1 = a;
        dim2 = b;
    }

    abstract double getArea();
}

class Rectangle extends Figure {
    Rectangle(double l, double b) {
        super(l, b);
    }

    double getArea() {
        return dim1 * dim2;
    }
}

class Triangle extends Figure {
    Triangle(double b, double h) {
        super(b, h);
    }

    double getArea() {
        return 0.5 * dim1 * dim2;
    }
}

public class Driver3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Figure f;

        System.out.print("Enter base and height of triangle: ");
        double b = sc.nextDouble();
        double h = sc.nextDouble();
        f = new Triangle(b, h);
        System.out.println("Triangle Area: " + f.getArea());

        System.out.print("Enter length and breadth of rectangle: ");
        double l = sc.nextDouble();
        double br = sc.nextDouble();
        f = new Rectangle(l, br);
        System.out.println("Rectangle Area: " + f.getArea());
    }
}
