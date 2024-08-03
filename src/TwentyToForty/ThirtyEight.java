package TwentyToForty;

import java.util.Scanner;

public class ThirtyEight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter four digit number: ");
        int number = scanner.nextInt();

        String numberStr = Integer.toString(number);

        char thousandsDigit = numberStr.charAt(0);
        char unitsDigit = numberStr.charAt(3);

        if (thousandsDigit == '3' || unitsDigit == '3') {
            System.out.println("ishtirok etgan");
        } else {
            System.out.println("ishtirok etmagan");
        }
    }
}
