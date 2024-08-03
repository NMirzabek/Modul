package HundredFiftyToHundredSeventy;

import java.util.Scanner;

public class HundredAndFiftySix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Enter String: ");
        String str = scanner.nextLine();

        int lowercaseCounter = 0;
        int uppercaseCounter = 0;

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (Character.isLowerCase(c)) {
                lowercaseCounter++;
            } else if (Character.isUpperCase(c)) {
                uppercaseCounter++;
            }
        }

        System.out.println("Entered lowercases: " + lowercaseCounter);
        System.out.println("Entered uppercases: " + uppercaseCounter);
    }
}
