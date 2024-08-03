package FiftyToEighty;

import java.util.Scanner;

public class FiftyOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num1 = scanner.nextInt();

        System.out.println("Enter another number: ");
        int num2 = scanner.nextInt();

        if (num1 > 21 && num2 > 21) {
            System.out.println(0);
        } else {
            if (num1 <= 21 && num2 <= 21) {
                if (num1 > num2) {
                    System.out.println("num1: " + num1);
                } else {
                    System.out.println("num2: " + num2);
                }
            } else if (num1 <= 21) {
                System.out.println("num1: " +num1);
            } else {
                System.out.println("num2: " + num2);
            }
        }
    }
}
