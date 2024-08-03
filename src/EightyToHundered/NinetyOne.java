package EightyToHundered;

import java.util.Scanner;

public class NinetyOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        long absolutNumber = Math.abs(number);
        long digitCount = 0;

        if (absolutNumber == 0) {
            digitCount = 1;
        } else {
            while (absolutNumber > 0) {
                absolutNumber /= 10;
                digitCount++;
            }
        }

        System.out.println("The number of digits is: " + digitCount);

    }
}
