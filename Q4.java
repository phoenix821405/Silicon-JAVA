import java.util.Scanner;
class PalindromeThread extends Thread
{
    private final int number;
    public PalindromeThread(int number)
	{
        this.number = number;
    }
    @Override
    public void run()
	{
        int temp = number;
        int reversed = 0;
        while (temp != 0)
		{
            int digit = temp % 10;
            reversed = reversed * 10 + digit;
            temp = temp/10;
        }
        if (reversed == number)
		{
            System.out.println( + number + " is Palindrome ");
        }
		else
		{
            System.out.println( + number + " is NOT Palindrome ");
        }
    }
}
public class Q4 {
    public static void main(String[] args)
	{
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        PalindromeThread palindromeThread = new PalindromeThread(num);
        palindromeThread.start();
        boolean isPrime = true;
        if (num <= 1)
		{
            isPrime = false;
        }
		else
		{
            for (int i = 2; i <= num / 2; i++)
			{
                if (num % i == 0)
				{
                    isPrime = false;
                    break;
                }
            }
        }
        if (isPrime)
		{
            System.out.println(" " + num + " is a Prime number.");
        }
		else
		{
            System.out.println(" " + num + " is a Composite number.");
        }
    }
}