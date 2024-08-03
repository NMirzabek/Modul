package HundredFiftyToHundredSeventy;

import java.util.Scanner;

public class HundredAndSixtyTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String Str = scanner.nextLine();

        int counter = 0;
            for (int i = 0; i < Str.length(); i++) {
                char c = Str.charAt(i);

                if (Character.isLetter(c)) {
                    counter++;
                }
            }
        System.out.println("Entered Letter: " + counter);
    }
}
