package OneToTwenty;

import java.util.Scanner;

public class Ten {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int a = scanner.nextInt();

        int a2 = a * a;
        int a4 = a2 * a2;
        int a6 = a4 * a2 * a;
        System.out.println(a6);
    }
}
