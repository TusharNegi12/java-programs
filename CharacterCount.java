import java.util.Scanner;

public class CharacterCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        int[] charCounts = new int[128];
        int totalCount = 0;

        for (int i = 0; i < inputString.length(); i++) {
            char c = inputString.charAt(i);
            charCounts[c]++;
            totalCount++;
        }

        System.out.println("Character counts:");
        for (int i = 0; i < charCounts.length; i++) {
            if (charCounts[i] > 0) {
                System.out.println((char) i + ": " + charCounts[i]);
            }
        }

        System.out.println("Total characters: " + totalCount);

        scanner.close();
    }
}
