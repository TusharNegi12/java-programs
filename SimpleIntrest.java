import java.util.Scanner;

public class SimpleIntrest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the principal amount: ");
        double principal = scanner.nextDouble();

        System.out.println("Enter the rate of interest (per annum): ");
        double rate = scanner.nextDouble();

        System.out.println("Enter the time (in years): ");
        double time = scanner.nextDouble();

        double simpleInterest = calculateSimpleInterest(principal, rate, time);

        System.out.println("Simple Interest: " + simpleInterest);

        scanner.close();
    }

    private static double calculateSimpleInterest(double principal, double rate, double time) {
        return (principal * rate * time) / 100;
    }
}
