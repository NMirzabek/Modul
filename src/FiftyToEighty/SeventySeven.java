package FiftyToEighty;

import java.util.Scanner;

public class SeventySeven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long sum = 1;
        boolean hasNonZeroNumber = false;

        while (true) {
            System.out.println("Enter number: ");
            int number = scanner.nextInt();

            if (number == 0) {
                break;
            }

            if (number != 0) {
                sum *= number;
                hasNonZeroNumber = true;
            }
        }

        if (hasNonZeroNumber) {
            System.out.println("The sum of the entered number is: " + sum);
        } else {
            System.out.println("No none zero number is entered!");
        }
    }
}
