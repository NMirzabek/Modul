package HundredFiftyToHundredSeventy;

import java.util.Scanner;

public class HundredAndSixty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter string: " );
        String str = scanner.nextLine();

        String modifiedString = replaceCharWithUppercase(str);

        System.out.println("Result: " + modifiedString);

    }

    public static String replaceCharWithUppercase(String string) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < string.length(); i++) {
            char ch = string.charAt(i);


            if (Character.isUpperCase(ch)) {
                result.append('*');
            } else {
                result.append(ch);
            }
        }

        return result.toString();
    }
}
