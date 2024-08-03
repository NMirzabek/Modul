package HundredFiftyToHundredSeventy;

import java.util.Scanner;

public class HundredAndFiftyThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter String: ");
        String string = scanner.nextLine();

        int count = 0;

        for (int i = 0; i < string.length(); i++) {
            if (Character.isDigit(i))
                count++;
        }

        if (count <= 8) {
            System.out.println("PDP");
        } else {
            System.out.println("Academy");
        }
    }
}
