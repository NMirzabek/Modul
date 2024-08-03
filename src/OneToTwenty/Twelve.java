package OneToTwenty;

import java.util.Scanner;

public class Twelve {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a three digit");
        int threeDigit = scanner.nextInt();

        int findHundred = (threeDigit / 10) % 10;

        System.out.println(findHundred);
    }
}
