package HundredEightyToTwoHundred;

import java.util.Scanner;

public class HundredAndNinetySeven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a String: ");
        String input = scanner.nextLine();

        int halfLength = input.length() / 2;

        int sumOfAscii = 0;

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (Character.isLetter(ch) || !Character.isDigit(ch)) {
                sumOfAscii += ch;
            }
        }

        if (halfLength == sumOfAscii) {
            System.out.println("Ok");
        } else {
            System.out.println("Error!");
        }
    }
}
