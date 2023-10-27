import java.util.Scanner;

public class Rhombus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of rows for the rhombus: ");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            // Print spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // Print stars
            for (int j = 1; j <= n; j++) {
                System.out.print("*");
            }

            // Move to the next line
            System.out.println();
        }

        scanner.close();
    }
}
