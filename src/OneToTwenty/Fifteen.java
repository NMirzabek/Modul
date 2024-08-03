package OneToTwenty;

import java.util.Scanner;

public class Fifteen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int firstDigit = number / 1000;
        int secondDigit = (number / 100) % 10;
        int thirdDigit = (number / 10) % 10;
        int fourDigit = number % 10;

        int result = firstDigit * secondDigit * thirdDigit * fourDigit;

        System.out.println("Result: " + result);
    }
}
