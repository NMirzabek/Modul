package HundredFiftyToHundredSeventy;

import java.util.Scanner;

public class HundredAndSixtySeven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a String: ");
        String str = scanner.nextLine();

        int uppercaseCounter = 0;
        int lowercaseCounter = 0;

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (Character.isUpperCase(c)) {
                uppercaseCounter++;
            } else if (Character.isLowerCase(c)) {
                lowercaseCounter++;
            }
        }

        if (lowercaseCounter < uppercaseCounter) {
            System.out.println("PDP");
        } else {
            System.out.println("Academy");
        }
    }
}
