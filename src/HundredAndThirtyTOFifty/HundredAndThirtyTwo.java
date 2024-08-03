package HundredAndThirtyTOFifty;

import java.util.Scanner;

public class HundredAndThirtyTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int N = scanner.nextInt();

        for (int i = 0; i < N; i++) {
            System.out.print(N + " ");
        }
        System.out.println();
        for (int i = 1; i < N - 1; i++) {
            System.out.print(N + " ");
            for (int j = 1; i < N - 1; i++) {
                System.out.print("  ");
            }
            System.out.println(N+ " ");
        }

        for (int i = 1; i < N - 1; i++) {
            System.out.print(N + " ");
            for (int j = 1; i < N - 1; i++) {
                System.out.print("  ");
            }
            System.out.println(N+ " ");
        }

        for (int i = 1; i <= N; i++){
            System.out.print(N + " ");
        }
    }
}
