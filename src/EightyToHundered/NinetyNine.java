package EightyToHundered;

import java.util.Scanner;

public class NinetyNine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Butun sonni kiriting:");
        int n = scanner.nextInt();


        n = Math.abs(n);


        System.out.print("Raqamlar teskari tartibda: ");
        while (n > 0) {
            int digit = n % 10;
            System.out.print(digit);
            n /= 10;
        }

        if (n == 0) {
            System.out.print("0");
        }
    }
}
