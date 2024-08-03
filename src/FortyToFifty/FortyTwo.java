package FortyToFifty;

import java.util.Scanner;

public class FortyTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter A number: ");
        int a = scanner.nextInt();

        System.out.println("Enter B number: ");
        int b = scanner.nextInt();
        boolean result = (a > 2) && (b <= 3);

        System.out.println(result);
    }
}
