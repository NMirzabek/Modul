package TwentyToForty;

import java.util.Scanner;

public class ThirtySeven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int firstNum = scanner.nextInt();

        System.out.println("Enter second number: ");
        int secondNum = scanner.nextInt();

        int sum = firstNum + secondNum;

        if (sum >= 10 && sum <= 19) {
            System.out.println(20);
        } else {
            System.out.println(sum);
        }
    }
}
