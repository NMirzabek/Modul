package HundredFiftyToHundredSeventy;

import java.util.Scanner;

public class HundredAndFiftyFour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter something: ");
        String string = scanner.nextLine();

        int sum = sumOfDigit(string);

        System.out.println("output: " + sum);


    }

    public static int sumOfDigit(String str) {
        int sum = 0;

        for (int i =0; i < str.length(); i++) {
            char ch =str.charAt(i);

            if (Character.isDigit(ch)){
                sum += Character.getNumericValue(ch);
            }
        }
        return sum;
    }
}
