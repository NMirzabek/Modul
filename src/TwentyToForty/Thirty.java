package TwentyToForty;

import java.util.Scanner;

public class Thirty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter capacity of that file: ");
        double fileSizeKB = scanner.nextDouble();

        double fileSizeByte = fileSizeKB * 1024;

        double numberOfCharacters = fileSizeByte / 2;

        System.out.println("Result: " + (int)numberOfCharacters);
    }
}
