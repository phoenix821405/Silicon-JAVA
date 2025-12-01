import java.util.Scanner;

class Point2D {
    int x, y;

    Point2D() {
        x = 0;
        y = 0;
    }

    Point2D(int a, int b) {
        x = a;
        y = b;
    }

    void display() {
        System.out.println("X: " + x + ", Y: " + y);
    }
}

class Point3D extends Point2D {
    int z;

    Point3D(int a, int b, int c) {
        super(a, b);
        z = c;
    }

    void show() {
        display();
        System.out.println("Z: " + z);
    }
}

public class Driver4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter X and Y: ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        Point2D p2 = new Point2D(x, y);
        p2.display();

        System.out.print("Enter X, Y and Z: ");
        x = sc.nextInt();
        y = sc.nextInt();
        int z = sc.nextInt();
        Point3D p3 = new Point3D(x, y, z);
        p3.show();
    }
}
