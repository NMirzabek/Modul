package HundredFiftyToHundredSeventy;

import java.util.Scanner;

public class HundredAndSixtyFive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int S = scanner.nextInt();

        System.out.println("Enter a leve: ");
        int N = scanner.nextInt();

        int result = power(S, N);

        System.out.println(N + " level of" + S + " that is " + result);


    }

    public static int power(int base, int level) {
        int result = 1;
        for (int i = 0; i <level; i++) {
            result *= base;
        }
        return result;
    }
}
