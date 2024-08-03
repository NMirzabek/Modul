package HundredAndThirty;

import java.util.Scanner;

public class HundredAndThirteen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int N = scanner.nextInt();

        for (int i = N; i >= 1 ; i--) {
            for (int j = 1; j <= N - i + 1; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
