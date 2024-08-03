package EightyToHundered;

import java.util.Scanner;

public class NinetyFive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number: ");
        int n = scanner.nextInt();

        double result = 1.0;
        for (double i = 1; i <= n; i+=0.1) {
            result *= i;
        }
        System.out.printf("Natija: %.4f%n", result);

    }
}
