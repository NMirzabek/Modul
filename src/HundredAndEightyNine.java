import java.util.Scanner;

public class HundredAndEightyNine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a String: ");
        String input = scanner.nextLine();

        String result = shiftCharacters(input);

        System.out.println("Result: " + result);


    }
    public static String shiftCharacters(String input) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            char nextChar = (char) (ch + 1);
            result.append(nextChar);
        }
        return result.toString();
    }
}
