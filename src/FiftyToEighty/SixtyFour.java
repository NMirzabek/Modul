package FiftyToEighty;

import java.util.Scanner;

public class SixtyFour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int a = scanner.nextInt();

        System.out.println("Enter another number: ");
        int b = scanner.nextInt();

        if (a != b){
            int sum = a + b;
            a = sum;
            b = sum;
        } else {
            a = 0;
            b = 0;
        }
        System.out.println("New values: " + "a-" + a + ", b-" + b + ".");
    }
}
