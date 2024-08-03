package FiftyToEighty;

import java.util.Scanner;

public class SeventyFive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number: ");
        int n = scanner.nextInt();

        if (n > 0) {
            boolean isPowerOfThree = false;
            int power = 1;
            while (power <= n) {
                if (power == n) {
                    isPowerOfThree = true;
                    break;
                }
                if (power > Integer.MAX_VALUE / 3) { // Check to prevent overflow
                    break;
                }
                power *= 3;
            }

            if (isPowerOfThree) {
                System.out.println("3 ning darajasi");
            } else {
                System.out.println("3 ning darajasi emas");
            }
        } else {
            System.out.println("n should be greater than 0");
        }
    }
}
