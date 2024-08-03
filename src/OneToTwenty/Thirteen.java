package OneToTwenty;

import java.util.Scanner;

public class Thirteen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int firstDigit = number / 100;

        int remainingDigits = number % 100;

        int newNumber = remainingDigits * 10 + firstDigit;
        System.out.println("New three digit number: " + newNumber);
    }
}
