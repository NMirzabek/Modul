package EightyToHundered;

import java.util.Scanner;

public class NinetyFour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number: ");
        int N = scanner.nextInt();

        for (int i = 0; i < N; i++) {
            System.out.print(N + " ");
        }
    }
}
