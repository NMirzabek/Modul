package HundredFiftyToHundredSeventy;

import java.util.Scanner;

public class HundredAndSixtySix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter n number: ");
        int n = scanner.nextInt();

        System.out.println("Enter k number: " );
        int k = scanner.nextInt();

        int quotient = 0;
        int remainder = n;

        while (remainder >= k) {
            remainder -= k;
            quotient++;
        }

        System.out.println(quotient);
        System.out.println(remainder);
    }
}
