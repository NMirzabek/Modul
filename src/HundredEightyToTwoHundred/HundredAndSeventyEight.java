package HundredEightyToTwoHundred;

import java.util.Scanner;

public class HundredAndSeventyEight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String input = scanner.nextLine();

        StringBuilder reversedToggled = new StringBuilder();

        for (int i = input.length() - 1; i >= 0; i--) {
            char ch = input.charAt(i);
            if (Character.isUpperCase(ch)) {
                reversedToggled.append(Character.toLowerCase(ch));
            } else if (Character.isLowerCase(ch)) {
                reversedToggled.append(Character.toUpperCase(ch));
            } else {
                reversedToggled.append(ch);
            }
        }
        System.out.println("Result: " + reversedToggled);
    }
}
