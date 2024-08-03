package FortyToFifty;

import java.util.Scanner;

public class FortyFour {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter three digit number: ");
        int number = scanner.nextInt();

        String numberStr = Integer.toString(number);

        int digit1 = numberStr.charAt(0);
        int digit2 = numberStr.charAt(1);
        int digit3 = numberStr.charAt(2);

        boolean result = (digit1 < digit2 && digit2 < digit3);

        System.out.println(result);
    }
}
