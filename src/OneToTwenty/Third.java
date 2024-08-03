package OneToTwenty;

import java.util.Scanner;

public class Third {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter A number: ");
        int a = scanner.nextInt();

        System.out.println("Enter B number: ");
        int b = scanner.nextInt();

        int surface = a * b;
        int P = 2 * (a + b);
        System.out.println(surface);
        System.out.println(P);
    }
}
