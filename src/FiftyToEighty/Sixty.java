package FiftyToEighty;

import java.util.Scanner;

public class Sixty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number: ");
        int num1 = scanner.nextInt();

        System.out.println("Enter another number: ");
        int num2 = scanner.nextInt();

        if (num1 > num2) {
            System.out.println("num1: " +num1 + " is greater than " + "num2: " + num2);
        } else {
            System.out.println("num2: " + num2 + " is greater than " + "num1: " + num1);
        }
    }
}
