package FiftyToEighty;

import java.util.Scanner;

public class SeventySix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number: ");
        int a = scanner.nextInt();

        System.out.println("Enter another number: ");
        int b  = scanner.nextInt();

        for (int i = a + 1; i < b; i++){
            if (i % 4 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
