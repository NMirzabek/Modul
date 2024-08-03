package EightyToHundered;

import java.util.Scanner;

public class NinetyEight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number: ");
        int n = scanner.nextInt();

        boolean hasFive = false;

        n = Math.abs(n);

       while(n > 0) {
           int digit = n % 10;
           if (digit == 5) {
               hasFive = true;
               break;
           }
           n /= 10;
       }

        if (hasFive) {
            System.out.println("5 raqami bor");
        } else {
            System.out.println("5 raqami yo'q");
        }
    }
}
