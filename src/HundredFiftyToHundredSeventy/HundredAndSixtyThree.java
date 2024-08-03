package HundredFiftyToHundredSeventy;

import java.util.Scanner;

public class HundredAndSixtyThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number: ");
        int N = scanner.nextInt();

        boolean isPerfectSquare = isPerfectSquare(N);

        double n = Math.sqrt(N);

        if (isPerfectSquare) {
            System.out.println(n + " number is square of the something number");
        } else {
            System.out.println(N+ " number is not square of the nothing!");
        }
    }

    public static boolean isPerfectSquare (int n) {
        if (n < 0) {
            return false;
        }

        int sqrt = (int) Math.sqrt(n);
        return sqrt * sqrt == n;
    }
}
