package HundredEightyToTwoHundred;

import java.util.Scanner;

public class HundredAndEightyThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a String: ");
        String input = scanner.nextLine();

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            if ( i % 2 == 0) {
                result.append(input.charAt(i));
            }
        }
        System.out.println("Even elements: " + result.toString());
    }
}
