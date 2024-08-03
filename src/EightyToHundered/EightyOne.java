package EightyToHundered;

import  java.util.Scanner;

public class EightyOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 100; i <= 999; i++) {
            int hundreds = i / 100;
            int ones = i % 10;
            if (hundreds == 3 || ones == 3) {
                System.out.print(i + " ");
            }
        }
    }
}
