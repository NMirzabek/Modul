package HundredAndThirtyTOFifty;

import java.util.Scanner;

public class HundredAndFortyEight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter something: ");
        String str = scanner.nextLine();

        int digitCounter = 0;
        int letterCounter = 0;

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (Character.isDigit(c)){
                digitCounter++;
            } else if (Character.isLetter(c)){
                letterCounter++;
            }
        }
        System.out.println(digitCounter);
        System.out.println(letterCounter);


        int totalCounter = digitCounter + letterCounter;
        System.out.println(totalCounter);

        if (totalCounter == str.length() / 2) {
            System.out.println("OK");
        } else {
            System.out.println("Error!");
        }
    }
}
