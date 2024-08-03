package FiftyToEighty;

import java.util.Scanner;

public class FiftyTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter year: ");
        int year = scanner.nextInt();

        if (year > 0 && year < 5000) {
            int century = (year + 99) / 100;
            System.out.println("this year " + century + " belong to this century");
        } else {
            System.out.println("Invalid year!");
        }
    }
}
