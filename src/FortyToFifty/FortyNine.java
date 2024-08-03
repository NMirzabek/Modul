package FortyToFifty;

import java.util.Scanner;

public class FortyNine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter A number: ");
        int a = scanner.nextInt();

        System.out.println("Enter B number: ");
        int b = scanner.nextInt();

        System.out.println("Enter C number: ");
        int c = scanner.nextInt();

        System.out.println("Enter D number: ");
        int d = scanner.nextInt();
        if (a == b && b == c && c == d) {
            int sum = a + b + c + d;
            System.out.println("Total: " + sum);
        } else {
            int max = a;
            if (b > max) max = b;
            if (c > max) max = c;
            if (d > max) max = d;

            int min = a;
            if (b < min) min = b;
            if (c < min) min = c;
            if (d < min) min = d;

            int difference = max - min;
            System.out.println("Difference: " + difference);
        }
    }
}
