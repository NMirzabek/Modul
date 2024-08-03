package HundredFiftyToHundredSeventy;

import java.util.Scanner;

public class HundredAndSixtyEight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int a = scanner.nextInt();

        System.out.print("Enter another number: ");
        int b = scanner.nextInt();

        if (a == 7 || b == 7 || a + b ==7 || a - b == 7 || b - a == 7){
            System.out.println("True");
        } else {
            System.out.println("False!");
        }


    }
}
