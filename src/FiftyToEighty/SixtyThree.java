package FiftyToEighty;

import java.util.Scanner;

public class SixtyThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number: ");
        int a = scanner.nextInt();

        System.out.println("Enter another number: ");
        int b = scanner.nextInt();

        System.out.println("Enter another number: ");
        int c = scanner.nextInt();

        if (a < b && b < c) {
            a *= 2;
            b *= 2;
            c *= 2;
        } else {
            a -= a;
            b -= b;
            c -= c;
        }

        System.out.println("New numbers: " + a + " " + b + " " + c);
    }
}
