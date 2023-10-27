import java.util.Scanner;

public class TrianglePattern {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the number of rows for the pattern
        System.out.print("Enter the number of rows for the pattern: ");
        int numRows = scanner.nextInt();

        // Print the right-angled triangle pattern
        for (int i = 1; i <= numRows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // Close the Scanner to prevent resource leak
        scanner.close();
    }
}
