package HundredAndThirtyTOFifty;

import java.util.Scanner;

public class HundredAndFortyTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter something: ");
        String str = scanner.nextLine();

        int counter = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'A') {
                counter++;
            }
        }
        System.out.println("A latter is written " + counter + " in the String");
    }
}
