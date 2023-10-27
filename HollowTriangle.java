import java.util.Scanner;

public class HollowTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the height of the triangle: ");
        int height = scanner.nextInt();

        printHollowTriangle(height);
    }

    private static void printHollowTriangle(int height) {
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= i; j++) {
                if (i == height || j == 1 || j == i) {
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
