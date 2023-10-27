import java.util.Scanner;

public class perimeterrect {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the length of the rectangle: ");
        double length = scanner.nextDouble();

        System.out.println("Enter the width of the rectangle: ");
        double width = scanner.nextDouble();

        double perimeter = calculateRectanglePerimeter(length, width);

        System.out.println("Perimeter of the rectangle: " + perimeter);

        scanner.close();
    }

    private static double calculateRectanglePerimeter(double length, double width) {
        return 2 * (length + width);
    }
}
