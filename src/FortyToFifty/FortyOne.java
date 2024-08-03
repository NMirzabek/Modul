package FortyToFifty;

import java.util.Scanner;

public class FortyOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Enter A number: ");
        int a = scanner.nextInt();

        System.out.println("Enter B number: ");
        int b = scanner.nextInt();

        System.out.println("Enter C number: ");
        int c = scanner.nextInt();

        boolean result = (Math.abs(a - b) >= 10) || (Math.abs(a - c) >= 10) || (Math.abs(b - c) >= 10);

        System.out.println(result);
    }
}
