package FortyToFifty;

import java.util.Scanner;

public class Fifty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter A number: ");
        int a = scanner.nextInt();

        System.out.println("Enter B number: ");
        int b = scanner.nextInt();

        System.out.println("Enter C number: ");
        int c = scanner.nextInt();
        int product = 1;

        if (a == b || a == c) a = 1;
        if (b == c) b = 1;
        if (a == b && b == c) product = 0;
        else product = a * b * c;

        System.out.println("Result: " + product);

    }
}