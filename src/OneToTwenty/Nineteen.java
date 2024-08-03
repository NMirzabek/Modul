package OneToTwenty;

import java.util.Scanner;

public class Nineteen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int a = scanner.nextInt();

        System.out.println("Enter another number: ");
        int b = scanner.nextInt();

        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("after the values changed a = " + a + " b = " + b);
    }
}
