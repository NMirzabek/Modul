package TwentyToForty;

import java.util.Scanner;

public class ThirtyNine {
    public static void main(String[] a) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int number = scanner.nextInt();

        if (number > 0) {
            System.out.println(number * 15);
        } else if (number < 0 ) {
            System.out.println(Math.abs(number));
        } else {
            System.out.println(number);
        }
    }
}
