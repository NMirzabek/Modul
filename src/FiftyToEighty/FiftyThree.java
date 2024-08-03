package FiftyToEighty;

import java.util.Scanner;

public class FiftyThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter A number: ");
        int A = scanner.nextInt();

        System.out.println("Enter B number: ");
        int B = scanner.nextInt();

        System.out.println("Enter C number: ");
        int C = scanner.nextInt();

        boolean isBoolean = true;

        if (A + B == C) {
            System.out.println(isBoolean = true);
        } else if (A + C == B) {
            System.out.println(isBoolean = true);
        } else if (C + B == A) {
            System.out.println(isBoolean = true);
        } else {
            System.out.println(isBoolean = false);
        }
    }
}
