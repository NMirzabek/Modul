package HundredAndThirtyTOFifty;

import java.util.Scanner;

public class HundredAndFortySeven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter something: ");
        String str = scanner.nextLine();

        if (str.length() > 0) {
            char firstChar = str.charAt(0);
            char lastChar = str.charAt(str.length() - 1);

            System.out.println("First char: " + firstChar);
            System.out.println("Last char: " + lastChar);
        } else {
            System.out.println("Str is empty!");
        }


    }
}
