package HundredAndThirtyTOFifty;

import java.util.Scanner;

public class HundredAndFortyOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Str: ");
        String str = scanner.nextLine();

        System.out.println("Enter index of the Str: ");
        int index = scanner.nextInt();


        if (index >= 0 && index < str.length()) {
            char ch = str.charAt(index);
            System.out.println("Index " + index + "type " + ch);
        } else {
            System.out.println("Error. Str length may lesser than index" + str.length());
        }
    }
}
