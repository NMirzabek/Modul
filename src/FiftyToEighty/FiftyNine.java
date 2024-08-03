package FiftyToEighty;

import java.util.Scanner;

public class FiftyNine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number: ");
        int a = scanner.nextInt();

        System.out.println("Enter number: ");
        int b = scanner.nextInt();

        System.out.println("Enter number: ");
        int c = scanner.nextInt();

        int positiveCount = 0;

        if (a > 0) positiveCount++;
        if (b > 0) positiveCount++;
        if (c > 0) positiveCount++;

        if (positiveCount == 1) {
            System.out.println("Only once is positive");
        } else if (positiveCount == 2) {
            System.out.println("Only twice number is positive");
        } else if (positiveCount == 3){
            System.out.println("All of them is positive");
        } else {
            System.out.println("None of them is positive");
        }

    }
}
