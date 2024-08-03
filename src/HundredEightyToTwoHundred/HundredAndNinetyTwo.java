package HundredEightyToTwoHundred;

import java.util.Scanner;

public class HundredAndNinetyTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a String: ");
        char input = scanner.next().charAt(0);

        String result = identifyCharacter(input);

        System.out.println("Result: " + result);



    }
    public static String identifyCharacter (char ch) {
        if (Character.isDigit(ch)) {
            return "Digit";
        } else if (Character.isLetter(ch)) {
            return "Letter";
        } else {
            return "Symbol";
        }
    }
}
