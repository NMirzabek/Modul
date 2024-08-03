package HundredAndThirtyTOFifty;

import java.util.Scanner;

public class HundredAndFifty {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String str = scanner.nextLine();

        String result = str.toUpperCase();

        System.out.println("Output: " + result);

    }
}
