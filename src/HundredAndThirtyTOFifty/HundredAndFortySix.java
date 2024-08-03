package HundredAndThirtyTOFifty;

import java.util.Scanner;

public class HundredAndFortySix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int number = scanner.nextInt();

        double squareRoot = Math.sqrt(number);
        double cubRoot = Math.cbrt(number);

        System.out.println("Square Root of the number: " + squareRoot);
        System.out.println("Cub Root of the number: " + cubRoot);

    }
}
