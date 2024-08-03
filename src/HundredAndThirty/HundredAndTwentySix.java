package HundredAndThirty;

import java.util.Scanner;

public class HundredAndTwentySix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a = scanner.nextInt();

        System.out.println("Enter another number: ");
        int b = scanner.nextInt();

        int gcdResult = gcd(a, b);
        int lcmResult = lcm(a, b, gcdResult);

        System.out.println("Result of the Ekub: " + gcdResult);
        System.out.println("Result of the Ekuk: " + lcmResult);


    }
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    public static int lcm(int a, int b, int gcd) {
        return (a * b) / gcd;
    }

}
