package FiftyToEighty;

import java.util.Scanner;

public class SixtyNine {
    public static void main(String[] args) {

        System.out.print("Even numbers: ");
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }

        System.out.println();
        System.out.print("Odd numbers: ");
        for (int i = 0; i <= 100; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
    }
}
