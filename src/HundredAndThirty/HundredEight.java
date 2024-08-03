package HundredAndThirty;

import java.util.Scanner;

public class HundredEight {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int N = scanner.nextInt();

        if (isPrime(N)) {
            System.out.println(N + " Number is prime");
        } else {
            System.out.println(N + " Number is not prime");
        }


    }

    public static boolean isPrime(int number) {

        if (number <= 1) {
            return false;
        }

        if (number == 2) {
            return false;
        }

        if (number % 2 == 0) {
            return false;
        }


        for (int i = 3; i < Math.sqrt(number); i += 2) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
