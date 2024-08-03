import java.util.Scanner;

public class HundredAndSeventySeven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a String: ");
        String input = scanner.nextLine();

        boolean onlyDigitsAndSymbols = true;

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (Character.isLetter(c)) {
                onlyDigitsAndSymbols = false;
                break;
            }
        }


        if (onlyDigitsAndSymbols) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }


    }
}
