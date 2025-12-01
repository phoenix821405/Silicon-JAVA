import java.util.Scanner;
class Complex {
    int real, imag;
    Complex(int r, int i) {
        real = r;
        imag = i;
    }
    void display() {
        if (imag >= 0)
            System.out.print(real + "+" + imag + "i");
        else
            System.out.print(real + "" + imag + "i");
    }

    Complex add(Complex c) {
        return new Complex(this.real + c.real, this.imag + c.imag);
    }
}
public class Main6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter real and imaginary parts of first number: ");
        int r1 = sc.nextInt();
        int i1 = sc.nextInt();

        System.out.print("Enter real and imaginary parts of second number: ");
        int r2 = sc.nextInt();
        int i2 = sc.nextInt();

        Complex c1 = new Complex(r1, i1);
        Complex c2 = new Complex(r2, i2);

        System.out.print("First complex number: ");
        c1.display();
        System.out.println();

        System.out.print("Second complex number: ");
        c2.display();
        System.out.println();

        Complex c3 = c1.add(c2);
        System.out.print("Sum of complex numbers: ");
        c3.display();
        System.out.println();

        sc.close();
    }
}
