package OneToTwenty;

import java.util.Scanner;

public class Sixteen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter three digit number: ");

        int number = scanner.nextInt();

        int firstNumber = number / 100;

        int secondNumber = (number / 10) % 10;

        int thirdNumber = number % 10;

        int result = firstNumber + secondNumber + thirdNumber;

        System.out.println("Result: " + result);
    }
}
