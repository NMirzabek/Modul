package EightyToHundered;

import java.util.Scanner;

public class EightyNine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number: ");
        int a = scanner.nextInt();

        System.out.println("Enter another number");
        int b = scanner.nextInt();

        if (a >= b) {
            System.out.println("A number must be greater than B!");
            return;
        }
        long sum = 1;
        for (int i = a; i <= b; i++) {
            sum *= i;
        }
        System.out.println("The product of all integers from " + a + " to " + b + " is: " + sum);
    }
}
