import java.util.Scanner;

public class HollowSquarePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the square: ");
        int size = sc.nextInt();

        printHollowSquare(size);
    }

    private static void printHollowSquare(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n || j == 1 || j == n) {
                    // Print '*' for the border
                    System.out.print("* ");
                } else {
                    // Print space for the hollow part
                    System.out.print("  ");
                }
            }
            // Move to the next line after each row
            System.out.println();
        }
    }
}
