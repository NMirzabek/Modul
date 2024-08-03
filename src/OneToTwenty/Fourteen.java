package OneToTwenty;

import java.util.Scanner;

public class Fourteen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter three digit number: ");

        int number = scanner.nextInt();

        int firstNumber = number / 100;

        int secondNumber = (number / 10) % 10;

        int thirdNumber = number % 10;

        int reversedNumber = (thirdNumber * 100) + (secondNumber * 10) + firstNumber;
        System.out.print("Result: " + reversedNumber);
    }
}
