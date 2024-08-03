package HundredFiftyToHundredSeventy;

import java.util.Scanner;

public class HundredAndSixtyNine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a String: ");
        String str = scanner.nextLine();

        String result = DoesNotCountDigit(str);

        System.out.print("Result: " + result);


    }
    public static String DoesNotCountDigit (String str) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            if (!Character.isDigit(c)) {
                result.append(c);
            }
        }
        return result.toString();
    }
}
