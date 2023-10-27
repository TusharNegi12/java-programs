import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = sc.nextInt();

        if (isLeapYear(year)) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
    }

    private static boolean isLeapYear(int year) {
        // Leap year is divisible by 4
        // If it is divisible by 100, it must also be divisible by 400
        return (year % 4 == 0) && ((year % 100 != 0) || (year % 400 == 0));
    }
}
