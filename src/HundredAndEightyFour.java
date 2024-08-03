import java.util.Scanner;

public class HundredAndEightyFour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a String: ");
        String input = scanner.nextLine();

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            if (i % 2 == 0) {
                char c = input.charAt(i);
                if (!Character.isLetterOrDigit(c)) {
                    result.append(c);
                }
            }
        }
        System.out.println("Result " + result.toString());
    }
}
