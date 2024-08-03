package HundredAndThirtyTOFifty;

import java.util.Scanner;

public class HundredAndFortyFive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = new int[6];

        System.out.println("Enter a number: ");

        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        int largest = array[0];
        int lowest = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] > largest) {
                largest = array[i];
            }

            if (array[i] < lowest) {
                lowest = array[i];
            }
        }

        System.out.println("The largest: " + largest);
        System.out.println("The lowest: " + lowest);
    }
}
