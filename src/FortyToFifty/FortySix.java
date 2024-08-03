package FortyToFifty;

import java.util.Scanner;

public class FortySix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter numbers: ");
        int number = scanner.nextInt();

        String numberStr = Integer.toString(number);

        int digit1 = numberStr.charAt(0) - '0';
        int digit2 = numberStr.charAt(1) - '0';
        int digit3 = numberStr.charAt(2) - '0';

        int maxDigit = digit1;
        if (digit2 > maxDigit) {
            maxDigit = digit2;
        }

        if (digit3 > maxDigit) {
            maxDigit = digit3;
        }


        System.out.println(maxDigit);
    }
}
