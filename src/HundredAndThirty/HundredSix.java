package HundredAndThirty;

import java.util.Scanner;

public class HundredSix {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number: ");
        int N = scanner.nextInt();

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print("   ");
            }
            System.out.println(i);
        }
    }
}
