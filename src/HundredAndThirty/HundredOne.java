package HundredAndThirty;

import java.util.Scanner;

public class HundredOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number: ");
        int n = scanner.nextInt();

        int temp = Math.abs(n);


            for (int i = 0; i <= temp; i++) {
                if (i % 2 == 0) {
                    System.out.print(i + " ");
            }
        }
    }
}
