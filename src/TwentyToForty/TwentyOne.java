package TwentyToForty;

import java.util.Scanner;

public class TwentyOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter three digit number: ");
        int number = scanner.nextInt();


        int lastDigit = number % 10;
        int remainDigits = number / 10;
        int newNumber = lastDigit * 100 + remainDigits;
        System.out.println("Result: " + newNumber);
    }
}
