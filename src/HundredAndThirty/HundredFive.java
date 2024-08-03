package HundredAndThirty;

import java.util.Scanner;

public class HundredFive {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int N = scanner.nextInt();

        for (int i = 0; i < N; i++) {
            for (int j = N - i; j <= N; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
