import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");

        System.out.print("Choose operation (1-4): ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Result: " + add(num1, num2));
                break;
            case 2:
                System.out.println("Result: " + subtract(num1, num2));
                break;
            case 3:
                System.out.println("Result: " + multiply(num1, num2));
                break;
            case 4:
                System.out.println("Result: " + divide(num1, num2));
                break;
            default:
                System.out.println("Invalid choice");
        }

        scanner.close();
    }

    // Function to add two numbers
    public static double add(double num1, double num2) {
        return num1 + num2;
    }

    // Function to subtract two numbers
    public static double subtract(double num1, double num2) {
        return num1 - num2;
    }

    // Function to multiply two numbers
    public static double multiply(double num1, double num2) {
        return num1 * num2;
    }

    // Function to divide two numbers
    public static double divide(double num1, double num2) {
        if (num2 != 0) {
            return num1 / num2;
        } else {
            System.out.println("Cannot divide by zero");
            return 0 ;
        }
    }
}
