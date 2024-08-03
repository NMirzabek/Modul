package FiftyToEighty;

import java.util.Scanner;

public class Seventy {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number: ");
        int a = scanner.nextInt();

        System.out.println("Enter another number: ");
        int b  = scanner.nextInt();

        if (b > 0) {
            for (int i = 0; i < b; i++) {
                System.out.print(a);
            }
            System.out.println();
        } else {
            System.out.println("second number should be greater than 0!");
        }
    }
}
