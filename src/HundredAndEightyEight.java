import java.util.Scanner;

public class HundredAndEightyEight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String input = scanner.nextLine();
        String result = replaceConsonantsWithPlus(input);

        System.out.println("Result: " + result);


    }
    public static String replaceConsonantsWithPlus (String input) {
        String vowels = "AEIOUaeiou";
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < input.length(); i++){
            char ch = input.charAt(i);
            if (Character.isLetter(ch) && vowels.indexOf(ch) == -1) {
                result.append('+');
            }else {
                result.append(ch);
            }
        }

        return result.toString();

    }
 }
