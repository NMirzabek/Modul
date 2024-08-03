package TwentyToForty;

import java.util.Scanner;

public class TwentyNine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter length: ");
        int R = scanner.nextInt();

        double L = 2 * Math.PI * R;
        System.out.println("Result: " + L );
    }
}
