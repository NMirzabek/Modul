package HundredAndThirtyTOFifty;

import java.util.Scanner;

public class HundredAndThirtySeven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];

        System.out.println("Enter 5 numbers: ");
        for (int i = 0; i < 5; i++) {
            numbers[i] = scanner.nextInt();
        }

        int largest = numbers[0];
        int secondLargest = numbers[0];

        for (int i = 0; i < 5; i++) {
            if (numbers[i] > largest) {
                largest = numbers[i];
            }
        }

        for (int i = 0; i < 5; i++) {
            if (numbers[i] > secondLargest && numbers[i] < largest) {
                secondLargest = numbers[i];
            }
        }

        System.out.print("Second Largest is: " + secondLargest);
    }
}
