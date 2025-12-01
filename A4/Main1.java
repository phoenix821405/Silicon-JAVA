import java.util.Scanner;

class Complex {
    double real, imag;

    void initialise() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter real part: ");
        real = sc.nextDouble();
        System.out.print("Enter imaginary part: ");
        imag = sc.nextDouble();
    }

    void display() {
        System.out.println(real + " + " + imag + "i");
    }

    Complex add(Complex c) {
        Complex sum = new Complex();
        sum.real = this.real + c.real;
        sum.imag = this.imag + c.imag;
        return sum;
    }
}

public class Main1 {
    public static void main(String[] args) {
        Complex c1 = new Complex();
        Complex c2 = new Complex();

        System.out.println("Enter first complex number:");
        c1.initialise();

        System.out.println("Enter second complex number:");
        c2.initialise();

        System.out.print("First complex number: ");
        c1.display();

        System.out.print("Second complex number: ");
        c2.display();

        Complex result = c1.add(c2);
        System.out.print("Sum: ");
        result.display();
    }
}
