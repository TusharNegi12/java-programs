import java.util.Scanner;

public class Swapthird {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int a = scanner.nextInt();

        System.out.println("Enter the second number: ");
        int b = scanner.nextInt();

        System.out.println("Before swapping: a = " + a + ", b = " + b);

        // Swap the numbers using another variable (c)
        int c = a;
        a = b;
        b = c;

        System.out.println("After swapping: a = " + a + ", b = " + b);

        scanner.close();
    }
}
