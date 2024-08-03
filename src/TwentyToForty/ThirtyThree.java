package TwentyToForty;

import java.util.Scanner;

public class ThirtyThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int positiveCount = 0;
        int negativeCount = 0;
        int zeroCount = 0;

        System.out.println("Enter 5 whole numbers:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            int number = scanner.nextInt();

            if (number > 0) {
                positiveCount++;
            } else if (number < 0) {
                negativeCount++;
            } else {
                zeroCount++;
            }
        }

        System.out.println("Positive numbers: " + positiveCount);
        System.out.println("Minus numbers: " + negativeCount);
        System.out.println("Zero numbers: " + zeroCount);
    }
}
