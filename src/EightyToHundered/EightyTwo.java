package EightyToHundered;

import java.util.Scanner;

public class EightyTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 100; i <= 999; i++) {
            int hundreds = i / 100;
            int tens = (i / 10) % 10;
            int units = i % 10;
            if (hundreds == units) {
                System.out.print(i + " ");
            }
        }
    }
}
