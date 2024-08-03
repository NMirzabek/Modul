import java.util.Scanner;

public class HundredAndSeventyFive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a String: ");
        String str = scanner.nextLine();

        StringBuilder lettersOnly = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isLetter(ch)) {
                lettersOnly.append(ch);
            }
        }


        String reversedLetters = lettersOnly.reverse().toString();
        System.out.println("Natija: " + reversedLetters);
    }
}
