package HundredEightyToTwoHundred;

import java.util.Scanner;

public class HundredAndEightySeven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a String: ");
        String str = scanner.nextLine();

        String result = replaceVowelsWithAsterisks(str);

        System.out.println("Result: " + result);

    }
    public static String replaceVowelsWithAsterisks(String input) {
        String vowels = "AEIOUaeiou";
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (vowels.indexOf(ch) != -1) {
                result.append('*');
            } else {
                result.append(ch);
            }
        }
        return result.toString();
    }
}
