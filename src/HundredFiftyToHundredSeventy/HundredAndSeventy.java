package HundredFiftyToHundredSeventy;

import java.util.Scanner;

public class HundredAndSeventy {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        double a = scanner.nextInt();

        System.out.println("Enter another one: ");
        double b = scanner.nextInt();

        double mediumGeometric = Math.sqrt(a * b);

        double mediumArithmetic = (a + b) / 2;

        System.out.println("mediumGeometric: " + mediumGeometric);
        System.out.println("mediumArithmetic: " +mediumArithmetic);

    }
}
