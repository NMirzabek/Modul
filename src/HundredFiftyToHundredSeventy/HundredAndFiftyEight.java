package HundredFiftyToHundredSeventy;

import java.util.Scanner;

public class HundredAndFiftyEight {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter String😊: ");
        String str = scanner.nextLine();

        String result = UppAndLowCases(str);

        System.out.println("Result😉: " + result);
    }

    public static String UppAndLowCases(String str) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (Character.isUpperCase(ch)) {
                result.append(Character.toLowerCase(ch));
            } else if (Character.isLowerCase(ch)) {
                result.append(Character.toUpperCase(ch));
            } else {
                result.append(ch);
            }
        }

        return result.toString();
    }
}
