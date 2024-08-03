package TwentyToForty;

import java.util.Scanner;

public class TwentyFour {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter weeks: ");
        int week = scanner.nextInt();

        System.out.println("Enter days: ");
        int days = scanner.nextInt();

        int totalDays = week * 7 + days;

        int totalHours = totalDays * 24;
        System.out.println("Result: " + totalHours);
    }
}
