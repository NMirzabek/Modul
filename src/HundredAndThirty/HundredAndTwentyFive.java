package HundredAndThirty;

import java.util.Scanner;

public class HundredAndTwentyFive {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a = scanner.nextInt();

        System.out.println("Enter another number: ");
        int b = scanner.nextByte();

        int Ekuk = lcm(a, b);
        System.out.println("EKUK(" + a + ", " + b + ") = " + Ekuk);

    }

    public static int gcd (int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
    public static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }
}
