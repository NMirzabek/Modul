package HundredEightyToTwoHundred;

import java.util.Scanner;

public class HundredAndNinetyOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a String: ");
        String input = scanner.nextLine();

        String first = input.substring(0);
        String middle = input.substring(input.length() / 2);
        String last = input.substring(input.length() - 1);

        String result = first + middle + last;
        System.out.println("Result: " + result);

    }
}
