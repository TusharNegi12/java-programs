import java.util.Scanner;

public class areaofrectangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the length of the rectangle: ");
        double length = scanner.nextDouble();

        System.out.println("Enter the width of the rectangle: ");
        double width = scanner.nextDouble();

        double area = calculateRectangleArea(length, width);

        System.out.println("Area of the rectangle: " + area);

        scanner.close();
    }

    private static double calculateRectangleArea(double length, double width) {
        return length * width;
    }
}
