package HundredEightyToTwoHundred;

import java.util.Scanner;

public class HundredAndEightySix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int number = scanner.nextInt();

        if (isPalindrome(number)) {
            System.out.println("Given number is palindrome");
        } else {
            System.out.println("Given number is not palindrome");
        }
    }
    public static boolean isPalindrome(int number) {
        int originalNumber = number;
        int reversedNumber = 0;

        while (number != 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        }
        return  originalNumber == reversedNumber;
    }
}
