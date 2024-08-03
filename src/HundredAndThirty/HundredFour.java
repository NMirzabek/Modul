package HundredAndThirty;

import java.util.Scanner;

public class HundredFour {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int N = scanner.nextInt();

        for (int i = 0; i <= N; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
