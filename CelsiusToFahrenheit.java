import java.util.Scanner;

public class CelsiusToFahrenheit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter temperature in Celsius: ");
        double celsius = scanner.nextDouble();

        double fahrenheit = convertCelsiusToFahrenheit(celsius);

        System.out.println("Temperature in Fahrenheit: " + fahrenheit);

        scanner.close();
    }

    private static double convertCelsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }
}
