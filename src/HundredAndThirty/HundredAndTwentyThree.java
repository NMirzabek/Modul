package HundredAndThirty;

import java.util.Scanner;

public class HundredAndTwentyThree {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number: ");
        int a = scanner.nextInt();

        System.out.println("Enter another number: ");
        int b = scanner.nextInt();

        int ekub = findEKUB(a, b);

        System.out.println("EKUB(" + a + ", " + b + ") = " + ekub);


    }
    public static int findEKUB(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
