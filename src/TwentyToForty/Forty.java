package TwentyToForty;

import java.util.Scanner;

public class Forty {
    public static void main(String[] a) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number");
        int number = scanner.nextInt();

        if (number > 0) {
            System.out.println(number + 1);
        } else if (number < 0 ) {
            System.out.println(Math.abs(number) + 2);
        } else {
            System.out.println(100 / 100.0);
        }
    }
}
