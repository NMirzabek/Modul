package FiftyToEighty;

import java.util.Scanner;

public class SeventyTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter A number: ");
        int a = scanner.nextInt();

        System.out.println("Enter N number: ");
        int n = scanner.nextInt();

        if (n > 0) {
            int sum = 1;
            for (int i = 0; i < n; i++) {
                sum *= a;
            }
            System.out.println(sum);
        } else {
            System.out.println("N should be greater than 0!");
        }
    }
}
