import java.util.Scanner;

public class HundredAndNinetySix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a String: ");
        String str = scanner.nextLine();

        int letterCounter = 0;
        int digitCounter = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isLetter(ch)) {
                letterCounter++;
            } else if (Character.isDigit(ch)) {
                digitCounter++;
            }
        }

        if (letterCounter == digitCounter) {
            System.out.println("Ok");
        } else {
            System.out.println("Error!");
        }
    }
}
