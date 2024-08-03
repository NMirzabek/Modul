package FiftyToEighty;

import java.util.Scanner;

public class FiftyFive {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        System.out.println("Enter A number: ");
        int A = scanner.nextInt();

        System.out.println("Enter B number: ");
        int B = scanner.nextInt();

        if (A > 0 && B > 0) {
            if (A == B * B && B == A* A) {
                System.out.println("One of the number is square of the another");
            } else {
                System.out.println("One of the number is not square of the another");
            }
        } else {
            System.out.println("Please enter whole number!");
        }
    }
}
