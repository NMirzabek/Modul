package TwentyToForty;

import java.util.Scanner;

public class TwentyTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a days: ");
        int a = scanner.nextInt();

        System.out.println("Enter hours: ");
        int b = scanner.nextInt();

        int minutesOfDays = a * 24 * 60;

        int minutesOfHours = b * 60;

        int totalMinutes = minutesOfDays + minutesOfHours;

        System.out.println("Result: " + totalMinutes);
    }
}
