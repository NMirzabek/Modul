package FiftyToEighty;

import java.util.Scanner;

public class SixtyTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int a = scanner.nextInt();

        System.out.println("Enter another number: ");
        int b = scanner.nextInt();

        System.out.println("Enter another number: ");
        int c = scanner.nextInt();

        int middle;

        if ((a > b && a < c) || (a > c && a < b)) {
            middle = a;
        } else if ((b > a && b < c) || (b > c && b < a)) {
            middle = b;
        } else {
            middle = c;
        }

        System.out.println(middle);
    }
}
