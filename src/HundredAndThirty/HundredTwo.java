package HundredAndThirty;

import java.util.Scanner;

public class HundredTwo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = scanner.nextInt();

        for (int i = 1; i < num; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

        for (int i = 1; i <= num; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
