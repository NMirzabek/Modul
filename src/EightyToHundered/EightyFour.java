package EightyToHundered;

import java.util.Scanner;

public class EightyFour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 100; i <= 999; i++) {
            int hundreds = i / 100;
            int tens = (i / 10) % 10;
            int units = i % 10;
            int sum = hundreds + tens + units;
            if (sum == 20) {
                System.out.println(i);
            }
        }

        System.out.println(789 / 100);
        System.out.println((789 / 10 ) % 10);
        System.out.println(789 % 10);
    }
}
