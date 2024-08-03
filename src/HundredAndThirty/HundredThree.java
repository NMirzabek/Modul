package HundredAndThirty;

import java.util.Scanner;

public class HundredThree {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int N = scanner.nextInt();

        char Char = (char) ('A' + N - 1);

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N - i; j++) {
                System.out.print(Char + " ");
            }
            System.out.println();
            Char--;
        }


    }
}
