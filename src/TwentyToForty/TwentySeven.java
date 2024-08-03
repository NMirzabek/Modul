package TwentyToForty;

import java.util.Scanner;

public class TwentySeven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter seconds: ");
        int totalSeconds = scanner.nextInt();

        int days = totalSeconds / (24 * 3600);
        totalSeconds  %= 24 * 3600;

        int hours = totalSeconds / 3600;
        totalSeconds %= 3600;

        int minutes = totalSeconds / 60;

        int seconds = totalSeconds % 60;

        System.out.println("Given seconds: " + days + " day, " + hours + " hours, " + minutes + " minutes, " + seconds + " seconds.");
    }
}
