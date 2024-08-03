package HundredAndThirty;

import java.util.Scanner;

public class HundredSeven {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number: ");
        int N = scanner.nextInt();

        for (int i = N; i >= 1; i--) {
            for (int j = N; j > i; j--) {
                System.out.print("   ");
            }
            System.out.println(i);
        }
    }
}
