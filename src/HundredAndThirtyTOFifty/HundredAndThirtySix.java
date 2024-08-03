package HundredAndThirtyTOFifty;

import java.util.Scanner;

public class HundredAndThirtySix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a letter: ");
        char ch = scanner.next().charAt(0);

        if (Character.isLetter(ch)){
            if (Character.isUpperCase(ch)) {
                System.out.println("Uppercase");
            } else if (Character.isLowerCase(ch)) {
                System.out.println("Lowercase");
            }
        } else {
            System.out.println("This is not even word!");
        }
    }
}
