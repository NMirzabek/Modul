package OneToTwenty;

import java.util.Scanner;

public class Seven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter money: ");
        int userInput = scanner.nextInt();
        int dollarValue = 11200;
        System.out.println("Money you can get: " + userInput * dollarValue);

    }
}
