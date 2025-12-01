import java.util.Scanner;

class Figure {
    double dim1;
    double dim2;

    Figure(double d1, double d2) {
        dim1 = d1;
        dim2 = d2;
    }

    double area() {
        return 0.0;
    }
}

class Rectangle extends Figure {
    Rectangle(double l, double b) {
        super(l, b);
    }

    double area() {
        return dim1 * dim2;
    }
}

class Triangle extends Figure {
    Triangle(double b, double h) {
        super(b, h);
    }

    double area() {
        return 0.5 * dim1 * dim2;
    }
}

class Square extends Figure {
    Square(double side) {
        super(side, side);
    }

    double area() {
        return dim1 * dim2;
    }
}

public class Driver2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length and breadth of rectangle: ");
        double l = sc.nextDouble();
        double b = sc.nextDouble();
        Rectangle rect = new Rectangle(l, b);
        System.out.println("Rectangle Area: " + rect.area());

        System.out.print("Enter base and height of triangle: ");
        double base = sc.nextDouble();
        double height = sc.nextDouble();
        Triangle tri = new Triangle(base, height);
        System.out.println("Triangle Area: " + tri.area());

        System.out.print("Enter side of square: ");
        double side = sc.nextDouble();
        Square sq = new Square(side);
        System.out.println("Square Area: " + sq.area());
    }
}
