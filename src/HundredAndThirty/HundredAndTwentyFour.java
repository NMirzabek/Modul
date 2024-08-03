package HundredAndThirty;

import java.util.Scanner;

public class HundredAndTwentyFour {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int count = 0;

        while (true) {
            System.out.println("Enter numbers ( it is stopped if number is negative and zero): ");
            int number = scanner.nextInt();
            if (number <= 0) {
                break;
            }
            count++;
        }
        System.out.println("Positive number which is accepted until the negative one: " + count);
    }
}
