package HundredFiftyToHundredSeventy;

import java.util.Scanner;

public class HundredAndSixtyFour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter String: ");
        String str = scanner.nextLine();

        String nonLetterChars = getNonLetterCharacters(str);

        System.out.println("Result: " + nonLetterChars);


    }
    public static String getNonLetterCharacters (String str) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            if (!Character.isLetter(c)) {
                result.append(c);
            }
        }
        return result.toString();
    }
}
