package FiftyToEighty;

import java.util.Scanner;

public class SeventyNine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 10; i < 100; i++) {
            int tens = i / 10;
            int eight = i % 10;
            if (tens == 8 || eight == 8) {
                System.out.print(i + " ");
            }
        }
    }
}
