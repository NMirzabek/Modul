package FiftyToEighty;

import java.util.Scanner;

public class FiftySeven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter A number: ");
        int a = scanner.nextInt();

        System.out.println("Enter B number: ");
        int b = scanner.nextInt();

        System.out.println("Enter C number: ");
        int c = scanner.nextInt();

        if (a < b && b < c) {
            System.out.println((a + b + c) * 2);
        } else if (a > b && b > c) {
            System.out.println((a + b +c) * 2);
        } else {
            System.out.println(Math.abs(a + b + c));
        }
    }
}
