package HundredFiftyToHundredSeventy;

import java.util.Scanner;

public class HundredAndFiftyOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter String: ");
        String input = scanner.nextLine();

        String result = getTheFirstFourLowercase(input);

        System.out.println("Output: " + result);


    }
    public static String getTheFirstFourLowercase (String str) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);{
                if (Character.isLowerCase(ch)) {
                    result.insert(0, ch);
                    if (result.length() == 4) {
                        break;
                    }
                }
            }
        }


        if (result.length() < 4) {
            return result.reverse().toString();
        } else {
            return result.reverse().toString();
        }
    }
}
