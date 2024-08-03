package HundredEightyToTwoHundred;

import java.util.Scanner;

public class HundredAndNinetyEight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int n = scanner.nextInt();

        if (n < 1 || n > 26) {
            System.out.println("Entered number should be between 1 and 26");
        } else {
            printFirstNLetters(n);
        }


    }
    public static void printFirstNLetters(int n) {
        for (int i = 0; i < n; i++) {
            char letter = (char) ('A' + i);
            System.out.println(letter);
        }
        System.out.println();
    }
}
