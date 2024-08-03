package HundredFiftyToHundredSeventy;

import java.util.Scanner;

public class HundredAndFiftyNine {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a password: ");
        String password = scanner.nextLine();

        boolean isValid = isPasswordValid(password);

        if (isValid) {
            System.out.println("Password is correct.");
        } else {
            System.out.println("Error, Password is incorrect!");
        }

    }

    public static boolean isPasswordValid(String password) {
        if (password.length() < 8) {
            return false;
        }

        boolean hasLowercase = false;
        boolean hasSpecialChar = false;
        boolean hasDigit = false;

        for (char ch : password.toCharArray()) {
            if (Character.isLowerCase(ch)) {
                hasLowercase = true;
            }
            if (ch == '#') {
                hasSpecialChar = true;
            }

            if (Character.isDigit(ch)) {
                hasDigit = true;
            }
        }

        return hasLowercase && hasSpecialChar && hasDigit;
    }
}
