package HundredEightyToTwoHundred;

import java.util.Scanner;

public class HundredAndNinetyFour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number between 32 and 126: ");
        int number = scanner.nextInt();

        if (32 <= number && number <= 126) {
            char ch = (char) number;
            System.out.println("Result: " + ch);
        } else {
            System.out.println("Entered number is not between 32 and 126");
        }
    }
}
