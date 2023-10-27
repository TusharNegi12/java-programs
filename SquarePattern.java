import java.util.Scanner;

public class SquarePattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the square: ");
        int size = scanner.nextInt();

        printSolidSquare(size);
    }

    private static void printSolidSquare(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                // Print '*' for each cell
                System.out.print("* ");
            }
            // Move to the next line after each row
            System.out.println();
        }
    }
}
