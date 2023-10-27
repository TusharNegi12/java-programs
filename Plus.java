import java.util.Scanner;

public class Plus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the size for the plus pattern: ");
        int size = scanner.nextInt();

        // Rows
        for (int i = 1; i <= size; i++) {
            // Columns
            for (int j = 1; j <= size; j++) {
                // Print "+" at the center and in the middle row/column
                if (i == size / 2 + 1 || j == size / 2 + 1) {
                    System.out.print("+");
                } else {
                    // Print spaces in other positions
                    System.out.print(" ");
                }
            }

            // Move to the next line
            System.out.println();
        }

        scanner.close();
    }
}
