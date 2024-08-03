package OneToTwenty;

import java.util.Scanner;

public class Twenty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number (greater than 999): ");
        int number = scanner.nextInt();


        int hundredsDigit = (number / 100) % 10;

        System.out.println("A number in thousands: " + hundredsDigit);

    }
}
