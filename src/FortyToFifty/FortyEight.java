package FortyToFifty;

import java.util.Scanner;

public class FortyEight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter A number: ");
        int a = scanner.nextInt();

        System.out.println("Enter B number: ");
        int b = scanner.nextInt();

        System.out.println("Enter C number: ");
        int c = scanner.nextInt();

        int positiveCount = 0;
        if (a > 0) positiveCount++;
        if (b > 0) positiveCount++;
        if (c > 0) positiveCount++;

        if (positiveCount == 2) {
            int sum = a + b + c;
            System.out.println("Total: " + sum);
        } else {
            int product = a * b * c;
            System.out.println("multiply: " + product);
        }
    }
}
