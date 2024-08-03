package FiftyToEighty;

import java.util.Scanner;

public class FiftyFour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter A number: ");
        int A = scanner.nextInt();

        System.out.println("Enter B number: ");
        int B = scanner.nextInt();

        System.out.println("Enter C number: ");
        int C = scanner.nextInt();

        int sum_ab = A + B;
        int sum_bc = B + C;
        int sum_ac = A + C;

        if (sum_ab >= sum_bc && sum_ab >= sum_ac) {
            System.out.println("Numbers with the greatest sum: " + A + " and " + B);
        } else if (sum_bc >= sum_ab && sum_bc >= sum_ac) {
            System.out.println("Numbers with the greatest sum: " + B + " and " + C);
        } else {
            System.out.println("Numbers with the greatest sum: " + A + " and " + C);
        }

    }
}
