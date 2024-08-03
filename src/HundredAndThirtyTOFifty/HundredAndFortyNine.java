package HundredAndThirtyTOFifty;

import java.util.Scanner;

public class HundredAndFortyNine {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string:");
        String input = scanner.nextLine();

        String result = getLastTwoUppercase(input);

        System.out.println("Output: " + result);




    }
    public static String getLastTwoUppercase(String str) {
        StringBuilder result = new StringBuilder();

        for (int i = str.length() - 1; i >= 0; i--) {
            char ch = str.charAt(i);
            if (Character.isUpperCase(ch)) {
                result.insert(0, ch);
                if (result.length() == 2) {
                    break;
                }
            }
        }

        if (result.length() < 2) {
            return result.toString();
        } else {
            return result.toString();
        }
    }
}
