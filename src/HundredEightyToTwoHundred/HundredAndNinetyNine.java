package HundredEightyToTwoHundred;

import java.util.Scanner;

public class HundredAndNinetyNine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number between 1 and 26: " );
        int num = scanner.nextInt();

        if (num < 1 || num > 26) {
            System.out.println("Entered number should be between 1 and 26");
        } else {
            printFirstNLettersInReverse(num);
        }
    }

    public static void printFirstNLettersInReverse(int n) {
        for (int i = n - 1; i >= 0; i--){
            char letter = (char) ('a' + i);
            System.out.println(letter);
        }
        System.out.println();
    }
}
