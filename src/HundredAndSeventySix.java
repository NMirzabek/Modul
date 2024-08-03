import java.util.Scanner;

public class HundredAndSeventySix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a String: ");
        String input = scanner.nextLine();

        StringBuilder digitsOnly = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (Character.isDigit(c)) {
                digitsOnly.append(c);
            }
        }

        String reverseDigits = digitsOnly.reverse().toString();
        System.out.println("Result: " + reverseDigits);
    }
}
