package EightyToHundered;

import java.util.Scanner;

public class EightyEight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number: ");
        int n = scanner.nextInt();

        if (n <= 1) {
            System.out.println("Number should be greater than 0!");
            return;
        }

        for (int i = 0; i <= n; i++) {
            double sqrt = Math.sqrt(i);
            System.out.printf("Square root of %d: %.4f\n", i, sqrt);
        }

    }
}
