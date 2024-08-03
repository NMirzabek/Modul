package HundredAndThirtyTOFifty;

import java.util.Scanner;

public class HundredAndThirty {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int N = scanner.nextInt();

        for (int i = 2; i < N; i++) {
            if (isPrime(i)) {
                System.out.println(i + " ");
            }
        }
        System.out.println("Prime numbers: ");



    }
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
