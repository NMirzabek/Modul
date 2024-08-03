package FiftyToEighty;

import java.util.Scanner;

public class SeventyOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter A number: ");
        int a = scanner.nextInt();

        System.out.println("Enter B number: ");
        int b = scanner.nextInt();

        int sum = 0;
        for (int i = a; i < b; i++) {
            sum += i;
        }
        System.out.println("sum: " + (sum - a));

    }
}
