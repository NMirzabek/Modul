package HundredAndThirtyTOFifty;

import java.util.Scanner;

public class HundredAndThirtyEight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter something: ");
        String str = scanner.nextLine();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isDigit(ch)){
                System.out.print(ch);
            }
        }



    }
}
