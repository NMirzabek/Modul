package HundredFiftyToHundredSeventy;

import java.util.Scanner;

public class HundredAndFiftySeven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Enter a number: ");
        int N = scanner.nextInt();

        boolean isPerfect = isPerfectNumber(N);

        System.out.println("Perfect number: " + isPerfect);

    }
    public static boolean isPerfectNumber (int n) {
        if (n <= 1) {
            return false;
        }

        int sum = 0;

        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        return sum == n;
    }
}
