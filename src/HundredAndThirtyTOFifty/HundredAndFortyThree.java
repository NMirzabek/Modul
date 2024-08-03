package HundredAndThirtyTOFifty;

import java.util.Scanner;

public class HundredAndFortyThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter something: ");
        String str = scanner.nextLine();

        String result = str.replace('a','b').replace('b','d');

        System.out.println("New string " + result);
    }
}
