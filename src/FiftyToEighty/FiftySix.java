package FiftyToEighty;

import java.util.Scanner;

public class FiftySix {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = scanner.nextInt();

        System.out.print("Enter second number: ");
        int b = scanner.nextInt();

        System.out.print("Enter third number: ");
        int c = scanner.nextInt();

        System.out.print("Enter fourth number: ");
        int d = scanner.nextInt();

        System.out.print("Enter fifth number: ");
        int e = scanner.nextInt();



        int[] numbers = {a, b, c, d, e};
        int sum = 0;

        for (int number : numbers) {
            if (number > 0 && number % 2 != 0) {
                sum += number;
            }
        }
        System.out.println("sum: " + sum);

    }
}
