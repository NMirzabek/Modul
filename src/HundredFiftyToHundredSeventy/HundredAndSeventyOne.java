package HundredFiftyToHundredSeventy;

import java.util.Scanner;

public class HundredAndSeventyOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 1000; i <= 9999; i++ ) {
            if (i % 2 != 0) {
                System.out.println(i + " ");
            }
        }
    }
}
