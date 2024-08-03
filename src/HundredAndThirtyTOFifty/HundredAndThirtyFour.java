package HundredAndThirtyTOFifty;

import java.util.Scanner;

public class HundredAndThirtyFour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;

        while (true) {
            System.out.println("Enter a number(Enter 0 to stop): ");
            int number = scanner.nextInt();
            if (number == 0) {
                break;
            }

            if (number > 0) {
                sum += number;
            }
        }
        System.out.println("Total of the positive numbers that are entered: " + sum);
    }
}
