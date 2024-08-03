package FiftyToEighty;

import java.util.Scanner;

public class SeventyThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter A number: ");
        int a = scanner.nextInt();

        System.out.print("Enter B number: ");
        int b = scanner.nextInt();

        int sum = 1;

        for (int i = a; i <= b; i++){
            sum *= i;
        }
        System.out.println(sum);
    }
}
