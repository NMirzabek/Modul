package HundredEightyToTwoHundred;

import java.util.Scanner;

public class HundredAndNinety {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a String: ");
        String input = scanner.nextLine();

        int digitCounter = 0;
        int charCounter = 0;
        int letterCounter = 0;

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (Character.isLetter(ch)) {
                letterCounter++;
            } else if (Character.isDigit(ch)) {
                digitCounter++;
            } else {
                charCounter++;
            }
        }

        if (digitCounter == charCounter && digitCounter == letterCounter) {
            System.out.println("Ok");
        } else {
            System.out.println("Not!");
        }
    }
}
