package FiftyToEighty;

import java.util.Scanner;

public class SixtyOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number between 1-999: ");
        int number = scanner.nextInt();


        String description = "";

        if (number < 1 || number > 999) {
            description = "Number is not between 1-999";
        } else {
            if (number >= 1 && number <= 9){
                description = "One digit";
            } else if (number >= 10 && number <= 99) {
                description = "Two digit";
            } else if (number >= 100 && number <= 999) {
                description = "Three digit";
            }

            if (number % 2 == 0) {
                description += " Odd number";
            } else {
                description += " Even number";
            }
        }
        System.out.println(description);
    }
}
