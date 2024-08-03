package EightyToHundered;

import java.util.Scanner;

public class EightyThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 10; i <= 99; i++) {
            int tens = i / 10;
            int units = i % 10;
            int sum = tens + units;
            if (sum == 9 || sum == 15) {
                System.out.println(i);
            }
        }
    }
}
