package FiftyToEighty;

import java.util.Scanner;

public class Eighty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 100; i <= 999; i++) {
            int hundreds = i / 100;
            int tens = i / 10;
            int sevens = i % 10;
            if (hundreds == 7 || tens == 7 || sevens == 7) {
                System.out.print(i + " ");
            }
        }
    }
}
