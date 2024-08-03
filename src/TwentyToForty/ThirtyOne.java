package TwentyToForty;

import java.util.Scanner;

public class ThirtyOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter three digit number: ");
        int number = scanner.nextInt();

        int firstNumber = number / 100;

        int secondNumber = (number / 10) % 10;

        int thirdNumber = number % 10;

        System.out.println("Result: " + secondNumber + firstNumber + thirdNumber);
    }
}
