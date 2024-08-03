import java.util.Scanner;

public class HundredAndEightyOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a String: ");
        String input = scanner.nextLine();

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (Character.isDigit(c)) {
                int digit = Character.getNumericValue(c);
                int squared = (int) Math.pow(digit, 2);
                result.append(squared);
            } else  {
                result.append(c);
            }
        }

        System.out.println("Result: " + result.toString());
    }
}
