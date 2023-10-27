import java.util.Scanner;

public class Factorial{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a non-negative integer: ");
        int n = scanner.nextInt();

        if (n < 0) {
            System.out.println("Please enter a non-negative integer.");
        } else {
            long factorial = calculateFactorial(n);
            System.out.println("Factorial of " + n + " is: " + factorial);
        }

        scanner.close();
    }

    private static long calculateFactorial(int num) {
        if (num == 0 || num == 1) {
            return 1;
        } else {
            return num * calculateFactorial(num - 1);
        }
    }
}
